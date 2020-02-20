package static_analysis.pythonast;
import org.json.JSONObject;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	File inFile = new File("C:\\Users\\djt0812\\research\\py2json\\testjson.txt");
        	String json = "";
        	Scanner scan = new Scanner(inFile);
        	while(scan.hasNext()) {
        		json = json.concat(scan.next());
        	}
            JSONObject obj = new JSONObject(json);
            System.out.println("Done");
        } catch (FileNotFoundException e) {
        	System.err.println("File not found.");
        }
    }
}
