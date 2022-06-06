package org.fundacionview.xmlbeans.controladores;

import org.fundacionview.xmlbeans.modelos.Empleado;
import org.fundacionview.xmlbeans.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {

	@Autowired
	Empleado e;
	
	@Autowired
	ApplicationContext contexto;
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
		/*	Usuario u= (Usuario) contexto.getBean("usuario");
		
		System.out.println("Contenedor con xml*** "+u.toString());
		
		System.out.println("Actividades del empleado: "+e.getActividades());
		
		for (String name : contexto.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		*/
		
		//mod.addAttribute("usu",new Usuario());
		mod.addAttribute("usu",(Usuario) contexto.getBean("usuario"));
		
		
		
		return "index";
	}
	
	
	@PostMapping("/procesarUsuario")
	public String procesarUsu(Model mod,@ModelAttribute("usu")Usuario u) {
		
		mod.addAttribute("usuario",u);
		
		return "resultado";
	}
	
	
}
