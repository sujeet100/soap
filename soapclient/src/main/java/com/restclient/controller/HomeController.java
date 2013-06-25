package com.restclient.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.restclient.controller.test.TestService;

@Controller
public class HomeController {

	@Autowired
	TestService service;
	@RequestMapping(value = "/home")
	public ModelAndView homePage(Model model, HttpServletResponse response)
			throws IOException {
		service.testWebService();
		return new ModelAndView("home");
	}	
}
