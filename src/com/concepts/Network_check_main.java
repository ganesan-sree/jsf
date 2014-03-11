package com.concepts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

public class Network_check_main {
	public static void main(String[] args) throws Exception {
		System.setProperty("http.proxyHost", "proxy.cognizant.com");
	    System.setProperty("http.proxyPort", "6050");
	    
	    long startTime = System.currentTimeMillis();
	   
	
	    
	    URL url = new URL("http://dq.sdc.bsnl.co.in/bsnl-web/reversePhone.seam");
	    
		//URL url = new URL("http://www.google.com");
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
	//	BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			//writer.write(line);
			//writer.newLine();
		}
		reader.close();
		//writer.close();
		
	    long endTime   = System.currentTimeMillis();
	    long totalTime = endTime - startTime;
	    System.out.println(totalTime/1000);
	}
}
