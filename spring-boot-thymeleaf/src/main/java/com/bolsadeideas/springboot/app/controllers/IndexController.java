package com.bolsadeideas.springboot.app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@Value("${application.controllers.mensaje}")
	private String mensaje;
	
	@GetMapping(value="/hola")
	public String hola(Model model) {
	
		model.addAttribute("mensaje", mensaje);
		return "hola";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Tiiiitulo");
		return "index";
	}
}
