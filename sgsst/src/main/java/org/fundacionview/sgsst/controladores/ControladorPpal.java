package org.fundacionview.sgsst.controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.fundacionview.sgsst.modelos.CamposGeneral;
import org.fundacionview.sgsst.modelos.CamposLogin;
import org.fundacionview.sgsst.modelos.Empleado;
import org.fundacionview.sgsst.modelos.tipoID;
import org.fundacionview.sgsst.repositorios.RepoUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorPpal {

	@Autowired
	RepoUsuarios repoU;
	
	
	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Empleado());
		
		//System.out.println("*****  -- "+repoU.consultaNativa());
		
		return "index";
	}
	
	
	@GetMapping("/form_empleado")
	public String creaEmpleado(Model mod) {
		mod.addAttribute("empleado",new Empleado());
		
		ArrayList<tipoID> listaTipos=new ArrayList<tipoID>();
		listaTipos.add(new tipoID("-- Seleccionar",""));
		listaTipos.add(new tipoID("Cedula Ciudadania","CC"));
		listaTipos.add(new tipoID("Cedula Extranjero","CE"));
		
		mod.addAttribute("listaTipoID",listaTipos);
		
		//System.out.println("*****  -- "+repoU.consultaNativa());
		
		return "form_empleado";
	}
	
	
	@PostMapping("/form_empleado")
	public String procesaFormulario(Model mod, @Validated(CamposGeneral.class) @ModelAttribute("empleado")Empleado e,BindingResult rv) {
		
		if(rv.hasErrors()) {
			return "form_empleado";
		}else
		{
			repoU.save(e);
			
		return "redirect:/home";
		}
	}
	
	
	@PostMapping("/login")
	public String login(Model mod,@Validated(CamposLogin.class) @ModelAttribute("usuario")Empleado u,BindingResult rv,HttpSession sess) {
	
		if(rv.hasErrors()) {
			return "index";
		}else {
			return "redirect:/home";
		}
		
	}
	
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	
	
	
	
}
