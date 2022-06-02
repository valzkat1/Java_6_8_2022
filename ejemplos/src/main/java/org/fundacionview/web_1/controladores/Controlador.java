package org.fundacionview.web_1.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	
	
	@PostMapping("/formulario")
	public String formulario(@RequestParam("nombre")String nom,@RequestParam("n1")Double n1,@RequestParam("n2")Double n2,@RequestParam("n3")Double n3,Model mod) {
		
		Double prome=  (n1+n2+n3)/3;
		
		mod.addAttribute("promedio",prome);
		mod.addAttribute("estudiante",nom);
		
		return "index";
	}

	
	
	
	@GetMapping("/promedios")
	public String promedios() {
		return "promedios";
	}
	
	
	
	@PostMapping("/promedios")
	public String calculo2(@RequestParam("nombre")String nomb,@RequestParam("cantidad")int cantid,Model mod) {
		
		mod.addAttribute("cantidad",cantid);
		mod.addAttribute("estudiante",nomb);
		return "calculopromedios2";
	}
	
	
	
	
	@PostMapping("/calculo2")
	public String envioFormPromedios2(Model mod,@RequestParam("notas")Double notas[],@RequestParam("estudiante")String estu) {
		
		Double suma=0d;
		for(int i=0;i < notas.length;i++) {
			
			suma=suma+notas[i];
		}
		Double prome=suma/notas.length;
		
		mod.addAttribute("estudiante",estu);
		mod.addAttribute("promedio",prome);
		return "index";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
