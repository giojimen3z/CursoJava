package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	
	@GetMapping("/")
	public String home() {
		/*
		 * Con el redirect se redirige y recarga las paginas y s epeuden usar cualquier url
		 * 
		 * con el fordward   solo redirige y  mantiene la url, el fordward solo  vaa los  controladores  asiq ue no s epueden usar urls de a uera
		 * */
		
		return "redirect:/app/index";
		
	}
	
}
