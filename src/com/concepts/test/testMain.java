package com.concepts.test;

import org.apache.log4j.Logger;

import com.concepts.log4jExample;

public class testMain {
	static Logger log = Logger.getLogger(
			testMain.class);


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("Hellllooooooooooooooooooooooooooo");

	}
	
	
	public void doLog(){
		log.debug("Doing logggggg");
	}

}
