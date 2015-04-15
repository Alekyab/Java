/**
 * 
 */
package com.cloudwick.training.Dom;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author alekya
 *
 */
public class DomManager {
	private static Document doc;
	private static PersonDom person = new PersonDom();

	/**
	 * @param args
	 * @throws IOException
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 */
	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		parseXml("person.xml");
		processDocument();
		printResults();
	}

	private static void printResults() {
		List<UserDom> users = person.getList();

		for (UserDom user : users) {
			System.out.println("id " + user.getId());
			System.out.println("Name " + user.getUserName());
			System.out.println("Password " + user.getPassWord());
			System.out.println("City " + user.getCity());
		}
	}

	private static void parseXml(String fileName)
			throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory docBuildFact = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder dom;

		dom = docBuildFact.newDocumentBuilder();
		doc = dom.parse(fileName);

	}

	private static void processDocument() {
		Element root = doc.getDocumentElement();
		NodeList users = root.getElementsByTagName("user");

		List<UserDom> userList = new ArrayList();

		for (int i = 0; i < users.getLength(); i++) {
			Element user = (Element) users.item(i);
			UserDom userObj = new UserDom();
			String id = user.getAttribute("id");
			userObj.setId(Integer.parseInt(id));

			NodeList userName = user.getElementsByTagName("username");
			Element userNam = (Element) userName.item(0);
			userObj.setUserName(userNam.getFirstChild().getNodeValue());

			NodeList passWord = user.getElementsByTagName("password");
			Element passWor = (Element) passWord.item(0);
			userObj.setPassWord(passWor.getFirstChild().getNodeValue());

			NodeList city = user.getElementsByTagName("city");
			Element cit = (Element) city.item(0);
			userObj.setCity(cit.getFirstChild().getNodeValue());
			
			userList.add(userObj);
		}
		person.setList(userList);
	}
}