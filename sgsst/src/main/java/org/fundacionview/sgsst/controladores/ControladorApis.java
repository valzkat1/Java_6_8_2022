package org.fundacionview.sgsst.controladores;

import java.util.ArrayList;
import java.util.Map;

import org.fundacionview.sgsst.modelos.CIE10;
import org.fundacionview.sgsst.modelos.Empleado;
import org.fundacionview.sgsst.repositorios.RepoCie10;
import org.fundacionview.sgsst.repositorios.RepoEmpleados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControladorApis {

	
	@Autowired
	RepoCie10 repoDiagnost;
	
	@Autowired
	RepoEmpleados repoEmple;
	
	@GetMapping("/empleados")
	public ArrayList<Empleado> getLista(@RequestParam("text")String texto) {
		
		
	    ArrayList<Empleado> listaDiag=	repoEmple.listarEmpleadByName(texto.toLowerCase());
		
		return listaDiag;
	}
	
	@GetMapping("/diagnosticos")
	public ArrayList<CIE10> getListaDiagnosticos(@RequestParam("text")String texto) {
		
		
	    ArrayList<CIE10> listaDiag=	repoDiagnost.autocompleteDiagnosticos(texto.toLowerCase());

		
		return listaDiag;
	}
	
	
	
}
