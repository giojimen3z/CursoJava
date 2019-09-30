package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", "Hola Spring Framework con Model!");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {

		Usuario usuario = new Usuario();
		usuario.setNombre("Gio");
		usuario.setApellido("Jimenez");
		usuario.setEmail("giou@outllodert.es");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del Usuario ".concat(usuario.getNombre()));
		return "perfil";
		
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		List<Usuario> usuarios  = new ArrayList<>();
		usuarios.add(new Usuario("Gio","Jimenez","oud@hjotmail.com"));
		usuarios.add(new Usuario("Camilo","Jimenez","oud@hjotmail.com"));
		usuarios.add(new Usuario("Andres","Jimenez","oud@hjotmail.com"));
		model.addAttribute("titulo", "listado de usuarios");
		model.addAttribute("usuarios", usuarios);
		return "listar";
	}

	
}
