/**
 * 
 */
package com.cloudwick.training.json;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 * @author alekya
 *
 */
public class JsonExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createJSON();
		readJSON();
	}

	@SuppressWarnings("unchecked")
	private static void createJSON() throws IOException {

		JSONObject jObj = new JSONObject();
		jObj.put("name", "alekya");
		jObj.put("age", "24");
		JSONArray arr = new JSONArray();
		arr.add("Hello");
		arr.add("alekya");
		arr.add("How r u");
		jObj.put("msg", arr);

		FileWriter fW = new FileWriter("cloudwick.json");
		fW.write(jObj.toJSONString());
		fW.flush();
		if (fW != null)
			fW.flush();

	}

	private static void readJSON() {
		try {
			FileReader fR = new FileReader("cloudWick.json");
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(fR);
			JSONObject jObj = (JSONObject) obj;

			System.out.println("Name " + jObj.get("name"));
			System.out.println("age " + jObj.get("age"));
			JSONArray jArr = (JSONArray) jObj.get("msg");
			Iterator<String> itr = jArr.iterator();
			System.out.println("messages.........");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}

		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
}
