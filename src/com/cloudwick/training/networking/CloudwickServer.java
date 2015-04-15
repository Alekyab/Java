/**
 * 
 */
package com.cloudwick.training.networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author alekya
 *
 */
public class CloudwickServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(7000);
	while(true)
	{
		System.out.println("Accepting request on "+server.getLocalPort());
		Socket socket = server.accept();
		InputStream in = socket.getInputStream();
		DataInputStream din = new DataInputStream(in);
		System.out.println(din.readUTF());
		DataOutputStream dOut = new DataOutputStream(socket.getOutputStream());
		dOut.writeUTF("Thanks for reading");
		socket.close();
	}
	}

}
