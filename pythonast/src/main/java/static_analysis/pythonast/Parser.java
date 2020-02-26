package static_analysis.pythonast;

import static java.util.Map.entry;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

import ast.*;
import reference.PropFuture;
import reference.RefFutureResolver;
import reference.ParserReference;

public abstract class Parser {
	//Todo: Find classes that need to be mapped, work out special cases for enums, and
	// Figure out what happens to members like small Alias (no type before parens)
	public static Map<String, Class<?>> classMap = Map.ofEntries(
				entry("Expr", ExprObj.class),
				entry("alias", SmallAlias.class)
			); 
	public static Map<String, Enum<?>> eMap = Map.ofEntries(
				//unaryop (ast.UnaryOp)
				entry("Invert", SmallUnaryOp.Invert),
				entry("Not", SmallUnaryOp.Not),
				entry("UAdd", SmallUnaryOp.UAdd),
				entry("USub", SmallUnaryOp.USub),
				//expr_context (ast.ExprContext)
				entry("Load", ExprContext.Load),
				entry("Store", ExprContext.Store),
				entry("Del", ExprContext.Del),
				entry("AugLoad", ExprContext.AugLoad),
				entry("AugStore", ExprContext.AugStore),
				//boolop (ast.SmallBoolOp)
				entry("And", SmallBoolOp.And),
				entry("Or", SmallBoolOp.Or),
				//operator (ast.Operator)
				entry("Add", Operator.Add),
				entry("Sub", Operator.Sub),
				entry("Mult", Operator.Mult),
				entry("MatMult", Operator.MatMult),
				entry("Div", Operator.Div),
				entry("Mod", Operator.Mod),
				entry("Pow", Operator.Pow),
				entry("LShift", Operator.LShift),
				entry("RShift", Operator.RShift),
				entry("BitOr", Operator.BitOr),
				entry("BitXor", Operator.BitXor),
				entry("BitAnd", Operator.BitAnd),
				entry("FloorDiv", Operator.FloorDiv),
				//cmpop (ast.CmpOp)
				entry("Eq", CmpOp.Eq),
				entry("NotEq", CmpOp.NotEq),
				entry("Lt", CmpOp.Lt),
				entry("LtE", CmpOp.LtE),
				entry("Gt", CmpOp.Gt),
				entry("GtE", CmpOp.GtE),
				entry("Is", CmpOp.Is),
				entry("IsNot", CmpOp.IsNot),
				entry("In", CmpOp.In),
				entry("NotIn", CmpOp.NotIn)
			);
	
	public static Ast parseAst(JSONObject ast) {
		RefFutureResolver refResolver = new RefFutureResolver(); 
		Ast tree = (Ast)parseAstHelper(ast.toMap(), refResolver);
		refResolver.resolve();
		return tree;
	}
	
	public static Object parseAstHelper(Object prop, RefFutureResolver refResolver) {
		try {
			if(prop instanceof Map) {
				Map<String, Object> map = (Map<String, Object>)prop;
				String nodeType = (String)map.get("ast2json_nodetype");
				
				if(nodeType.equals("ast2json_reference")) {
					Long refId = (Long)map.get("ast2json_ref");
					return new ParserReference(refId);
				}
				
				if(eMap.containsKey(nodeType)) {
					Enum<?> e = eMap.get(nodeType);
					refResolver.addRef((Long)map.get("ast2json_id"), e);
					return e;
				}
				
				Class<?> clazz = null;
				if(classMap.containsKey(nodeType)) {
					clazz = classMap.get(nodeType);
				}
				else {
					//Cuts down on the number of types I need to re-map
					String capitalClassName = nodeType.length() < 2? nodeType.toUpperCase() :
						nodeType.substring(0,1).toUpperCase() + nodeType.substring(1);
					
					clazz= java.lang.Class.forName("ast."+capitalClassName);
				}
			
				Ast node = (Ast) clazz.getConstructors()[0].newInstance();
				refResolver.addRef((Long)map.get("ast2json_id"), node);
				
				for(String k : map.keySet()) {
					if(!k.contains("ast2json")) { 
						Field toSet = clazz.getDeclaredField(k);
						Object val = parseAstHelper(map.get(k), refResolver);
						putOrRef(node, toSet, val, refResolver);
					}
				}
				return node;
			}
			else if(prop instanceof Iterable) {
				List<Object> lst = new ArrayList<Object>();
				for(Object item : (Iterable<Object>)prop) {
					addOrRef(lst, parseAstHelper(item, refResolver), refResolver);
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
	
	public static void addOrRef(List<Object> target, Object val, RefFutureResolver refResolver) {
		if(val instanceof ParserReference) {
			Long ref = ((ParserReference)val).getId();
			refResolver.addListFuture(target, ref);
		}
		else {
			target.add(val);
		}
	}
	
	public static void putOrRef(Object target, Field toSet, Object val, RefFutureResolver refResolver) throws IllegalArgumentException, IllegalAccessException {
		if(val instanceof ParserReference) {
			Long ref = ((ParserReference)val).getId();
			refResolver.addPropFuture(toSet, target, ref);
		}
		else {
			Class<?> fType = toSet.getType();
			if(val == null || fType.isInstance(val)) {
				toSet.setAccessible(true);
				toSet.set(target, val);
				toSet.setAccessible(false);
			}
			else {
				System.err.println("Subtree type error. Skipping");
			}
		}
	}
	
}
