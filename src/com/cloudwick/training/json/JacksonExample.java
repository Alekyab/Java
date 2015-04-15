/**
 * 
 */
package com.cloudwick.training.json;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 * @author alekya
 *
 */
public class JacksonExample {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper mapper = new ObjectMapper();
		UserJson obj = new UserJson();
		UserJson populate = mapper.readValue(new File("cloudwick.json"), UserJson.class);
		Iterator<String> itr= populate.getMsg().iterator();
		while(itr.hasNext())
		System.out.println(itr.next());
		System.out.println(populate.getName());
		System.out.println(populate.getAge());
		
		System.out.println(mapper.writeValueAsString(populate));
	}

	
}
