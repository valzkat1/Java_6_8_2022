package org.fundacionview.web_1.controladores;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorUno {

	
	//  Bean
	
	
	@GetMapping("/")
	public String index(Model modelo ) {
		
		modelo.addAttribute("mensaje","Este esta en metodo del index***");
		return "index";
	}
	
	
	
	@GetMapping("/login")
	public ModelAndView login() {
		
		ModelAndView vista=new ModelAndView("login");		
		vista.addObject("mensaje","Lo que necesitemos enviar desde el controlador**");
		return vista;
		
	}
	
	
	
	
	
	@PostMapping("/logear")
	public String formulario(@RequestParam("nombre")String nombre,@RequestParam("claves")String clave,Model mod) {
		
		
		
		
		if(nombre.equals("victor")   && clave.equals("12345")) {
			
			mod.addAttribute("mensaje","Coinciden nombre y clave");
			
		}else {
			mod.addAttribute("mensaje","Error");
		}
		
		return "menu";
		
	}
	
	
	@RequestMapping("/logear2")
	public String formulario2(HttpServletRequest objetoRequest,Model mod) {
		
		
		String nombre,clave;
		

		objetoRequest.toString();
		
		nombre=objetoRequest.getParameter("nombre").toString();
		
		clave=objetoRequest.getParameter("claves");
		
		
		if(nombre.equals("victor")   && clave.equals("12345")) {
			
			mod.addAttribute("mensaje","Login correcto***");
		}else {
			
			mod.addAttribute("mensaje","Error en la informacion");
		}
		
			
			
		return "menu";
	}
	
	
	
}
