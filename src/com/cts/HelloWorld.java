package com.cts;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {

	@ManagedProperty(value = "#{message}")

	private String message;

	public HelloWorld() {
		System.out.println("HelloWorld started!");
	}

	public String getMessage() {
	      return "Hello World!";
	   }

	public void setMessageBean(String message) {
		this.message = message;
	}

}
