package org.fundacionview.sgsst.controladores;

import javax.servlet.http.HttpSession;

import org.fundacionview.sgsst.modelos.CamposLogin;
import org.fundacionview.sgsst.modelos.Empleado;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControladorPpal {

	
	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Empleado());
		
		return "index";
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
