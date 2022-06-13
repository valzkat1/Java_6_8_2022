package org.fundacionview.validaciones.controladores;

import javax.validation.Valid;

import org.fundacionview.validaciones.anotaciones.GrupoGeneral;
import org.fundacionview.validaciones.modelos.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorUno {

	@GetMapping("/")
	public String index(Model mod ) {
		
		mod.addAttribute("persona",new Persona());
		return "index";
	}
	
	@PostMapping("/validar")
	public String validar(Model mod,@Validated(GrupoGeneral.class) @ModelAttribute("persona")Persona per,BindingResult resultadoV) {
		
		if(resultadoV.hasErrors()) {
			return "index";
		}else {
			
		mod.addAttribute("per",per);	
		return "resultado";
	}
	}
	
	
}
