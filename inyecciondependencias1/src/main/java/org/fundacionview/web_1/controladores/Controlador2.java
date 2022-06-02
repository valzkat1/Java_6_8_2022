package org.fundacionview.web_1.controladores;

import java.util.ArrayList;

import org.fundacionview.web_1.modelos.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuarios")

public class Controlador2 {

	
//	@Autowired
//	Estudiante es;
	

	@Autowired
	ApplicationContext contextoApp;
	
	
	//Version del contexto basada en configuracion xml
	//ClassPathXmlApplicationContext contexto; 
	
	
	ArrayList<Estudiante> milista= new ArrayList<Estudiante>();
	
	
	
	@GetMapping("/crear")
	public String formular() {
		return "formulario";
	}
	
	
	
	@GetMapping("/crearMVC")
	public String formularMVC(Model mod) {
		
		
		
		mod.addAttribute("estudiante",(Estudiante)contextoApp.getBean("estudiante"));
		return "formularioMVC";
	}
	
	
	
	@PostMapping("/crearMVC")
	public String crearMvc(Model mod,@ModelAttribute("estudiante")Estudiante ess) {
		
		milista.add(ess);
		mod.addAttribute("listaEstudiantes",milista);
		return "listar";
	}
	
	
	@PostMapping("/crear")
	public String formular(Model mod,@RequestParam("nombre")String nombre,@RequestParam("edad")int edad) {
		//Estudiante es=getScop();
		//getScop(es)
		
		Estudiante es=(Estudiante) contextoApp.getBean("estudiante");
		
		//Estudiante es=new Estudiante();
		
		es.setNombre(nombre);
		es.setEdad(edad);
		
		milista.add(es);
		
		
		mod.addAttribute("listaEstudiantes",milista);
		return "listar";
		
	}
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
		Estudiante es= (Estudiante) contextoApp.getBean("estudiante");
		
		es.setNombre("PEPE");
		es.setEdad(30);
		//es.setNotas(null);
		mod.addAttribute("estudiante",es);
		return "usuarios";
	}
	
	
}
