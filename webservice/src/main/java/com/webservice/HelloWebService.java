package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;


@WebService
public class HelloWebService {

	
	@WebMethod
	public String getMessage(String name){
		return "Hello "+name;
	}
	
	
	@WebMethod
	public String getAgeMessage(int age){
		return  "Your age is "+age;
				
	}
}
