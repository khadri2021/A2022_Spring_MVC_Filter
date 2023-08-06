package com.khadri.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class Controller2 {

	@RequestMapping("/hit2")
	@ResponseBody
	protected String service(HttpServletRequest req, HttpServletResponse resp) {
		System.out.println("Controller2 Invoked");
		return "Controller2";
	}
}
