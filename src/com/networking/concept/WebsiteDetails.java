//WAP to display the details and the index.html page content of the given URL(uniform resource locator)
package com.networking.concept;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Date;

public class WebsiteDetails {

	public static void main(String[] args) throws Exception {
	
		URL obj=new URL("https://www.tutorialspoint.com/java/java_networking.htm");
		URLConnection con = obj.openConnection();
		
		//Display the date
		System.out.println("Date :"+new Date(con.getDate()));
		
		//Display the content type whether text file or html
		System.out.println("Content type :"+con.getContentType());
		
		//Display expire date
		System.out.println("Expiry date of this website"+ con.getExpiration());
		
		//Display last modified date
		System.out.println("last modified date"+con.getLastModified());
		
		//display how many byte does java_networking.html page have
		int l = con.getContentLength();
		System.out.println("length of this page"+l);
		if(l==0) {
			System.out.println("content not available");
		}else {
			int ch;
			InputStream is = con.getInputStream();
			//display the content of the java_networking.html page
			while((ch=is.read())!=-1) {
				System.out.print((char)ch);
			}
		}

	}

}
