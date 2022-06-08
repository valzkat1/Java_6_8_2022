package org.fundacionview.xmlbeans.controladores;

import java.util.Locale;

import org.fundacionview.xmlbeans.modelos.Empleado;
import org.fundacionview.xmlbeans.modelos.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
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
	MessageSource mensajes;
	
	
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
		
		Locale espaCol=new Locale("es","CO");
		
		Locale inglesUs=new Locale("en","US");
		
		
		// Texto plano
		String text1=mensajes.getMessage("texto1", null,inglesUs);
		
		// Texto con una variable
		String text2=mensajes.getMessage("texto2", new String[] {"Dato como argumento**"},inglesUs);
		
		// Texto con dos o mas variables
		String text3=mensajes.getMessage("texto3", new String[] {"WEB De traducciones","Victor"},inglesUs);
		
		
		mod.addAttribute("texto1",text1);
		mod.addAttribute("texto2",text2);
		
		mod.addAttribute("texto3",text3);
		
		return "index";
	}
	
	
	@PostMapping("/procesarUsuario")
	public String procesarUsu(Model mod,@ModelAttribute("usu")Usuario u) {
		
		mod.addAttribute("usuario",u);
		
		return "resultado";
	}
	
	
}
