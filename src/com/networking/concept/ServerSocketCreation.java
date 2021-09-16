//WAP to create a server for the purpose of sending some string to the client.

package com.networking.concept;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketCreation {

	public static void main(String[] args)throws Exception {
		//create an object of serversocket class to start a server side socket.
		ServerSocket ss = new ServerSocket(123);
		//let the server wait till the client accepts connection.
		Socket accept = ss.accept();
		System.out.println("connection establishd");
		//attech outputstream to the serversocket.
		OutputStream os = accept.getOutputStream();
		//attech printstream to send data to the socket
		PrintStream ps = new PrintStream(os);
		//send string to the client;
		String string="hello java world";
		ps.println(string);
		ps.println("bye");
		
		//close connection stream and socket
		ps.close();
		//os.close();
		accept.close();
		ss.close();
		
 		
	}

}
