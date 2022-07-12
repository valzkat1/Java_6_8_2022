package org.fundacionview.sgsst.controladores;

import java.util.ArrayList;
import java.util.Map;

import org.fundacionview.sgsst.modelos.CIE10;
import org.fundacionview.sgsst.repositorios.RepoCie10;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorApis {

	
	@Autowired
	RepoCie10 repoDiagnost;
	
	@GetMapping("/diagnosticos")
	public String getLista() {
		
		
	ArrayList<CIE10> listaDiag=	repoDiagnost.autocompleteDiagnosticos("A4");
	
	for(CIE10 d:listaDiag) {
		
	 System.out.println(d.toString());
	 
	}
		
		return "";
	}
	
	
	
	
	
}
