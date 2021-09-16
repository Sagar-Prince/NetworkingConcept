//This program should be execute on a system which is connected to Internet.
//KNOWINGH IP Address of a Website.

package com.networking.concept;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class Address {
	public static void main(String[] args) throws IOException
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter website name: ");
		String site = scn.next();
		try {
			InetAddress address = InetAddress.getByName(site);
			System.out.println("IP Address of thiis website is "+address);
		 } 
		catch (Exception e) 
		{
			e.printStackTrace();
		}	
	}
}
