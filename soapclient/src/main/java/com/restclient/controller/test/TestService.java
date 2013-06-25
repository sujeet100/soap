package com.restclient.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import com.restclient.proxy.GetMessage;
import com.restclient.proxy.ObjectFactory;

@Service
public class TestService {

	@Autowired
	WebServiceTemplate wsTemplate;

	public void testWebService() {

		GetMessage request = new GetMessage();
		request.setArg0("Sujit");
		String message = (String) wsTemplate.marshalSendAndReceive(request);
		System.out.println(message);
	}
	
	public static void main(String[] args) {
		new  TestService().testWebService();
	}
}
