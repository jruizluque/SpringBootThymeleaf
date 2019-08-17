package com.bolsadeideas.springboot.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home1() {	
		return "redirect:/app/index";
	}
	
	@GetMapping("/forward")
	public String home2() {	
		return "forward:/app/index";
	}
	
	@GetMapping("/google")
	public String google() {	
		return "redirect:https://www.google.com";
	}
}
