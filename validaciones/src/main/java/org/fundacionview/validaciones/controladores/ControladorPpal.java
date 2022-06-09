package org.fundacionview.validaciones.controladores;

import javax.validation.Valid;

import org.fundacionview.validaciones.modelos.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorPpal {

	//  C R U D 
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
		mod.addAttribute("persona",new Persona());
		return "index";
	}
	
	
	@PostMapping("/validaciones")
	public String validar(Model mod,@Valid @ModelAttribute("persona")Persona per,BindingResult resultV) {
		
		if(resultV.hasErrors()) {
			
			// no se deja proseguir al usuario hasta que no diligencie bien los campos.
			return "index";
		}else {
		
			// Se almacena la info luego de pasar la validacion.
			
			return "resultado";
		}
	}
	
}
