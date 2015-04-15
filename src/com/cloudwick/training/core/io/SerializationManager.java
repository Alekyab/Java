/**
 * 
 */
package com.cloudwick.training.core.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * @author alekya
 *
 */
public class SerializationManager {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		System.out.println(Thread.currentThread()); // main, priority of the
													// thread , called thread

		serializedObject();
		deSerializedObject();
		compressContent();
	}

	@SuppressWarnings("unused")
	private static void serializedObject() throws IOException {
		System.out.println(Thread.currentThread());
		FileOutputStream fos = new FileOutputStream("serialize.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		UserSerialize obj = new UserSerialize();
		obj.setName("Alekya");
		obj.setSsn(12374);
		os.writeObject(obj);
		os.flush();
		fos.close();

	}

	private static void compressContent() throws Exception {
		System.out.println(Thread.currentThread());

		FileOutputStream fos = new FileOutputStream("serialize.gz");
		GZIPOutputStream gZip = new GZIPOutputStream(fos);
		FileInputStream fis = new FileInputStream("serialize.txt");

		int data = 0;
		while ((data = fis.read()) != -1) {
			gZip.write(data);
		}

		gZip.finish();
		gZip.close();
		fos.flush();
		fos.close();
		fis.close();

	}

	private static void deCompressContent() throws Exception {
		FileInputStream fis = new FileInputStream("serialize.gz");
		GZIPInputStream is = new GZIPInputStream(fis);
		FileOutputStream fos = new FileOutputStream("serialize.txt");

	}

	private static void deSerializedObject() throws IOException,
			ClassNotFoundException {
		System.out.println(Thread.currentThread());
		FileInputStream fis = new FileInputStream("serialize.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		Object o = is.readObject();
		if (o instanceof UserSerialize) {
			System.out.println(((UserSerialize) o).getSsn());
			System.out.println(((UserSerialize) o).getName());
		}
	}
}
