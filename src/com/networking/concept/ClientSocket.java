////wap to create client side program, which accept all the string send by server.

package com.networking.concept;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocket {

	public static void main(String[] args) throws Exception {
		// create client socket with same port number
		Socket s = new Socket("localhost", 123);
		// to read data coming from the server, attach InputStream to the socket
		InputStream is = s.getInputStream();
		// to read data from the socket into the client, use bufferedreader
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		// receving string
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println("from server" + str);

		}
		// close connection by closing the strems and socket
		br.close();
		s.close();

	}

}
