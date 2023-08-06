package com.khadri.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Controller1 {

	@RequestMapping("/hit1")
	@ResponseBody
	protected String service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Controller1 Invoked");
		
		return "Controller1";
	}
}
