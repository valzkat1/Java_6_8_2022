package org.fundacionview.xmlbeans.controladores;

import org.fundacionview.xmlbeans.modelos.Empleado;
import org.fundacionview.xmlbeans.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@Autowired
	Empleado e;
	
	@Autowired
	ApplicationContext contexto;
	
	
	@GetMapping("/")
	public String index() {
		
		Usuario u= (Usuario) contexto.getBean("usuario");
		
		System.out.println("Contenedor con xml*** "+u.toString());
		
		System.out.println("Actividades del empleado: "+e.getActividades());
		
	/*	for (String name : contexto.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		*/
		
		return "index";
	}
	
	
	
}
