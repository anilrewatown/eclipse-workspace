package com.employee.management.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@GetMapping(value="/home")
	public String home(){
		 
		return "home";
	}
	
	@GetMapping(value="/index")
	public String index1(){
		 
		return "index";
	}
	
	@RequestMapping("/")
	public String index() {
	return "index.html";
	}

}
