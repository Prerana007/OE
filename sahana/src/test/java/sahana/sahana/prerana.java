package sahana.sahana;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;





public class prerana {

	public static void main(String[] args) throws IOException,ParseException, org.json.simple.parser.ParseException{
		// TODO Auto-generated method stub
		JSONParser js= new JSONParser();
		FileReader as = new FileReader(".\\project.json");
		Object obj = js.parse(as);
		JSONObject stu=(JSONObject)obj;
		String ls = (String)stu.get("dis");
		System.out.println(ls);
	}

}