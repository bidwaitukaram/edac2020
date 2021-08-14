package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	public IndexController() {
		System.out.println("In const of "+getClass().getName());
	}
	
	@GetMapping("/")
	public String showIndexPage()
	{
		return "/index";
	}
}
