/**
 * 
 */
package com.cloudwick.training.core.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author alekya
 *
 */
public class FileStreamExample {

	/**
	 * @param args
	 * @throws FileExistsException
	 * @throws IOException
	 */

	public void createMyFile(String fileName) throws FileExistsException,
			IOException {
		File fileObj = new File(fileName);
		if (fileObj.exists()) {

			// throw new FileExistsException("File already Exists");

		} else {

			fileObj.createNewFile();

		}
	}

	public void readContent(String fileName) {
		FileInputStream file = null;

		try {
			file = new FileInputStream(fileName);
			int d = file.read();
			while (d != -1) {
				System.out.print((char) d);
				d = file.read();
			}

			file.read();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
	
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				file.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void writeContent(String fileName) {
		FileOutputStream fOut = null;
		try {
			fOut = new FileOutputStream(fileName);
			// System.out.println("aleya");
			String data = "I am Alekya sdfsadfsd fsd fsd f";
			fOut.write(data.getBytes());
			fOut.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fOut != null)
				try {
					fOut.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
	}

	private void writeTextContent(String fileName) {
		FileWriter file;
		String data = "Alekya reddy \nBachala";
		System.out.println("As");
		try {
			System.out.println("AS");
			file = new FileWriter(fileName);
			BufferedWriter buffer = new BufferedWriter(file);
			System.out.println("As");
			buffer.write(data);
			buffer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void readTextContent(String fileName) {
		FileReader file;
		BufferedReader buffer = null;
		String line = null;
		try {
			file = new FileReader(fileName);
			buffer = new BufferedReader(file);
			while ((line = buffer.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileStreamExample file = new FileStreamExample();
		try {
			file.createMyFile("D://alekya2ry2.txt");
			// System.out.println("aleya");
			// file.writeContent("D://alekya1.txt");
			// file.readContent("D://alekya1.txt");
			file.writeTextContent("D://alekya1.txt");
			file.readTextContent("D://alekya1.txt");
		} catch (FileExistsException e) {

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
