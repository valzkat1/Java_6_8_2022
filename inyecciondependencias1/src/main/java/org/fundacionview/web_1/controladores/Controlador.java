package org.fundacionview.web_1.controladores;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.fundacionview.web_1.modelos.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@Autowired
	Estudiante es;
	
	
	
	@PostConstruct
	public void contenedorIniciado() {
		Double notas[] =new Double[3];
		notas[0]=3.5;
		notas[1]=4.0;
		notas[2]=5.0;
		
		es.setNombre("Victor");
		es.setEdad(10);
	//	es.setNotas(notas);
		System.out.println("Acaba de iniciar el contenedor de Beans.***** ");
		
	}
	
	@PreDestroy
	public void predDestroy() {
		System.out.println("Se esta deteniendo la aplicacion***** ");
	}
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
		
		//Estudiante es=new Estudiante("Victor", 20, notas);
		
		mod.addAttribute("estudiante",es);
		
		return "index";
	}
	
	@GetMapping("/menu")
	public String menu(Model mod) {
		
		
		
		
		mod.addAttribute("estudiante",es);
		mod.addAttribute("promedio","");
		return "menu";
	}
	
	
	
}
