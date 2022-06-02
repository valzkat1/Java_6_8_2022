package org.fundacionview.xmlbeans.controladores;

import org.fundacionview.xmlbeans.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@Autowired
	Usuario u;
	
	@Autowired
	ApplicationContext contexto;
	
	
	@GetMapping("/")
	public String index() {
		
		Usuario u= (Usuario) contexto.getBean("Usuario");
		
		System.out.println("Contenedor con xml*** "+u.toString());
		
		return "index";
	}
	
	
	
}
