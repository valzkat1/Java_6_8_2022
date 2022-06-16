package org.fundacionview.jpa_base_datos.controladores;

import javax.validation.Valid;

import org.fundacionview.jpa_base_datos.modelos.Usuario;
import org.fundacionview.jpa_base_datos.repositorios.RepositorioUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorUsuarios {

	@Autowired
	RepositorioUser repoU;
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
	/*	Usuario u= new Usuario();
		u.setNombre("Victor");
		u.setEdad(19);
		u.setEmail("loquesea@gmail.com");*/
		
		mod.addAttribute("usuario",new Usuario());
		
		//repoU.save(u);
		
		
		return "index";
	}
	
	
	
	@PostMapping("/formuluario")
	public String crearUser(Model mod,@Valid @ModelAttribute("usuario")Usuario u,BindingResult resV) {
		
		if(resV.hasErrors()) {
			return "index";
		}else {
		
			repoU.save(u);
			
		return "redirect:/listar";
		
		}
	}
	
	
	@GetMapping("/listar")
	public String listarUser(Model mod) {
		
		mod.addAttribute("listaUsuarios",repoU.findAll());
		return "resultado";
	}
	
	
}
