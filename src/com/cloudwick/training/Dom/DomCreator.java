/**
 * 
 */
package com.cloudwick.training.Dom;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;


/**
 * @author alekya
 *
 */
@SuppressWarnings("deprecation")
public class DomCreator {

	private static Document doc;
	private static PersonDom personObj;

	/**
	 * @param args
	 */

	public static void populate() {
		personObj = new PersonDom();
		List<UserDom> userList = new ArrayList<>();
		int i = 0;
		while (i < 4) {
			UserDom userObj = new UserDom();
			userObj.setId(i);
			userObj.setCity("Fremont");
			userObj.setPassWord("hadoop123");
			userObj.setUserName("Alekya");
			userList.add(userObj);
			i++;
		}
		personObj.setList(userList);

	}

	private static void createDocument() throws ParserConfigurationException {

		DocumentBuilderFactory fac = DocumentBuilderFactory.newInstance();
		DocumentBuilder dom = fac.newDocumentBuilder();
		doc = dom.newDocument();

	}

	private static void createDom() {
		Element rootEl = doc.createElement("person");
		doc.appendChild(rootEl);
		Iterator<UserDom> itr = personObj.getList().iterator();
		while (itr.hasNext()) {
			UserDom obj = itr.next();
			Element user = doc.createElement("user");
			user.setAttribute("id", String.valueOf(obj.getId()));

			Element userName = doc.createElement("username");
			Text uText = doc.createTextNode(obj.getUserName());
			userName.appendChild(uText);
			user.appendChild(userName);

			Element passWord = doc.createElement("password");
			Text pdText = doc.createTextNode(obj.getPassWord());
			passWord.appendChild(pdText);
			user.appendChild(passWord);

			Element city = doc.createElement("city");
			Text uCity = doc.createTextNode(obj.getCity());
			city.appendChild(uCity);
			user.appendChild(city);

			rootEl.appendChild(user);
		}
	}

	@SuppressWarnings("deprecation")
	private static void writeXml() throws IOException {
		OutputFormat out = new OutputFormat(doc);
		out.setIndenting(true);
		XMLSerializer xml = new XMLSerializer(new FileOutputStream(
				"myperson.xml"), out);
		xml.serialize(doc);
	}

	public static void main(String[] args) throws ParserConfigurationException,
			IOException {
		populate();
		createDocument();
		createDom();
		writeXml();
	}

}
