/**
 * 
 */
package com.cloudwick.training.sax;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.cloudwick.training.Dom.PersonDom;
import com.cloudwick.training.Dom.UserDom;

/**
 * @author alekya
 *
 */
public class SaxManager extends DefaultHandler {

	private static PersonDom personObj;
	private static List<UserDom> userList;
	private static String data;
	private static UserDom userObj;
	
	@SuppressWarnings("unused")
	private void parseXml(String fileName) throws ParserConfigurationException,
			SAXException, IOException {
		SAXParserFactory fac = SAXParserFactory.newInstance();
		SAXParser parser = fac.newSAXParser();
		parser.parse(fileName, this);
	}
	
	private static void printResults() {
		List<UserDom> users = personObj.getList();

		for (UserDom user : users) {
			System.out.println("id " + user.getId());
			System.out.println("Name " + user.getUserName());
			System.out.println("Password " + user.getPassWord());
			System.out.println("City " + user.getCity());
		}
	}

	public static void main(String[] args) throws ParserConfigurationException,
			SAXException, IOException {

		SaxManager sManager = new SaxManager();
		sManager.parseXml("person.xml");
		printResults();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 * java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub
		// super.startElement(uri, localName, qName, attributes);
		if (qName.equals("person")) {
			personObj = new PersonDom();
			userList = new ArrayList<>();
		}
		if (qName.equals("user")) {
			 userObj = new UserDom();
			userObj.setId(Integer.parseInt(attributes.getValue("id")));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		data = new String(ch, start, length);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.xml.sax.helpers.DefaultHandler#endElement(java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		// super.endElement(uri, localName, qName);
		if (qName.equals("username")) {
			userObj.setUserName(data);
		}
		if(qName.equals("city"))
		{
			userObj.setCity(data);
		}
		if(qName.equals("password"))
		{
			userObj.setPassWord(data);
		}
		if(qName.equals("user"))
		{
			userList.add(userObj);
		}
		if(qName.equals("person"))
		{
			personObj.setList(userList);
		}
	}
}