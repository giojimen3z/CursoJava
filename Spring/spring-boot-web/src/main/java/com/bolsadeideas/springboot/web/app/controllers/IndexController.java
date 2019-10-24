package com.bolsadeideas.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;


@Controller
@RequestMapping("/app")
public class IndexController {
	
	@Value("${texto.indexController.index.titulo}")
	private String textoIndex;
	
	@Value("${texto.indexController.perfil.titulo}")
	private String textoPerfil;
	
	@Value("${texto.indexController.listar.titulo}")
	private String textoListar;
	
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		
		model.addAttribute("titulo", textoIndex);
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {

		Usuario usuario = new Usuario();
		usuario.setNombre("Gio");
		usuario.setApellido("Jimenez");
		usuario.setEmail("giou@outllodert.es");
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo",textoPerfil.concat(usuario.getNombre()));
		return "perfil";
		
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {

		model.addAttribute("titulo", textoListar);
		return "listar";
	}

	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		
		List<Usuario> usuarios  = new ArrayList<>();
		usuarios.add(new Usuario("Gio","Jimenez","oud@hjotmail.com"));
		usuarios.add(new Usuario("Camilo","Jimenez","oud@hjotmail.com"));
		usuarios.add(new Usuario("Andres","Jimenez","oud@hjotmail.com"));		
		
		return usuarios;
	}
}
