package static_analysis.pythonast;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.json.JSONObject;

import ast.Ast;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	File inFile = new File("./test_resources/test2.json");
        	String json = "";
        	Scanner scan = new Scanner(inFile);
        	while(scan.hasNextLine()) {
        		json = json.concat(scan.nextLine());
        	}
        	scan.close();
            JSONObject obj = new JSONObject(json);
            Ast testAst = Parser.parseAst(obj);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
        	System.err.println("File not found.");
        }
    }
}
