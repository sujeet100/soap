package com.restclient.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Controller;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.restclient", 
				excludeFilters={@Filter(value=WebConfiguration.class, type=FilterType.ASSIGNABLE_TYPE), @Filter(value=Controller.class)})
@ImportResource( { "classpath:spring-security.xml" } )
@PropertySource({"application.properties"})
public class ApplicationConfiguration {
	
	@Bean
	public WebServiceTemplate wsTemplate(){
		WebServiceTemplate ws=new WebServiceTemplate();
		Jaxb2Marshaller marshaller=new Jaxb2Marshaller();
		marshaller.setContextPath("com.restclient.proxy");
		
		ws.setMarshaller(marshaller);
		
		ws.setUnmarshaller(marshaller);
		ws.setDefaultUri("http://localhost:8080/webservice/hello");
		return ws;
	}
}
