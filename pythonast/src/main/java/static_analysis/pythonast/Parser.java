package static_analysis.pythonast;

import static java.util.Map.entry;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import ast.*;

public abstract class Parser {
	//Todo: Find classes that need to be mapped, work out special cases for enums, and
	// Figure out what happens to members like small Alias (no type before parens)
	public static Map<String, Class<?>> classMap = Map.ofEntries(
				entry("boolop", ast.SmallBoolOp.class),
				entry("unaryop", ast.SmallUnaryOp.class),
				entry("alias", ast.SmallAlias.class)
			); 
	
	public static Ast parseAst(Object ast) {
		Map<Long, Object> seen = new HashMap<Long, Object>();
		return (Ast)parseAstHelper(ast, seen);
	}
	
	public static Object parseAstHelper(Object prop, Map<Long, Object> seen) {
		try {
			if(prop instanceof JSONObject) {
				Map<String, Object> map = ((JSONObject)prop).toMap();
				String nodeType = (String)map.get("ast2json_nodetype");
				
				if(nodeType.equals("ast2json_reference")) {
					Long refId = (Long)map.get("ast2json_ref");
					if(seen.containsKey(refId)) {
						return seen.get(refId);
					}
					System.err.println("ast2json error: ref not found. Setting null subtree.");
					return null;
				}
				//Cuts down on the number of types I need to re-map
				String capitalClassName = nodeType.length() < 2? nodeType.toUpperCase() :
					nodeType.substring(0,1).toUpperCase() + nodeType.substring(1);
				
				Class<?> clazz= java.lang.Class.forName("ast."+capitalClassName);
				Ast node = (Ast) clazz.getConstructors()[0].newInstance();
				seen.put((Long)map.get("ast2json_id"), node);
				
				for(String k : map.keySet()) {
					if(!k.contains("ast2json")) { 
						Field toSet = clazz.getField(k);
						Object val = parseAstHelper(map.get(k), seen);
						Class<?> fType = toSet.getType();
						if(val == null || fType.isInstance(val)) {
							toSet.set(node, val);
						}
						else {
							System.err.println("Subtree type error. Skipping");
						}
					}
				}
				return node;
			}
			else if(prop instanceof JSONArray) {
				List<Object> lst = new ArrayList<Object>();
				for(Object item : (JSONArray)prop) {
					lst.add(parseAstHelper(item, seen));
				}
				return lst;
			}
			return prop;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
