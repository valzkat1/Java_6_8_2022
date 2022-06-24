package org.fundacionview.jpa_base_datos.controladores;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.fundacionview.jpa_base_datos.modelos.Usuario;
import org.fundacionview.jpa_base_datos.modelos.validacionLogin;
import org.fundacionview.jpa_base_datos.repositorios.RepositorioUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorUsuarios {

	@Autowired
	RepositorioUser repoU;
	
	
	@GetMapping("/")
	public String index(Model mod) {
		
	/*	Usuario u= new Usuario();
		u.setNombre("Victor");
		u.setEdad(19);
		u.setEmail("loquesea@gmail.com");*/
		
	//	Usuario u=repoU.login("Pepito", "123456");
		
	//	System.out.println(u.toString());
		
	//	ArrayList<Usuario> usuarioEntre=repoU.betweenEdad();
		
		
	//	System.out.println("****  *****");
	//	System.out.println(usuarioEntre.toString());
		
		
		System.out.println("****  *****");
		System.out.println("El promedio de edad es: "+repoU.getPromedioEdad());
		
		
		
		mod.addAttribute("usuario",new Usuario());
		
		//repoU.save(u);
		
		
		return "index";
	}
	
	
	//C R U D
	
	
	@PostMapping("/formuluario")
	public String crearUser(Model mod,@Valid @ModelAttribute("usuario")Usuario u,BindingResult resV) {
		
		if(resV.hasErrors()) {
			return "index";
		}else {
		
			repoU.save(u);
			
			
			
		return "redirect:/listar";
		
		}
	}
	
	
	@GetMapping("/listar")
	public String listarUser(Model mod,HttpSession sesion) {
		
		
		if(sesion.getAttribute("LOGEADO") != null) {
			mod.addAttribute("listaUsuarios",repoU.findAll());
			return "resultado";
		}else {
			return "redirect:/login";
		}
		
	}
	
	
	@GetMapping("/editarU")
	public String editarUsuario(Model mod,@RequestParam("id")int id) {
		
		mod.addAttribute("usuario",repoU.getById(id));
		return "editar";
	}
	
	@GetMapping("/eliminarU")
	public String eliminarUsuario(Model mod,@RequestParam("id")int id) {
		
		repoU.deleteById(id);
		
		return "redirect:/listar";
	}
	
	
	
	@GetMapping("/login")
	public String login(Model mod) {
		
		mod.addAttribute("usuario",new Usuario());
		return "login";
	}
	
	
	@PostMapping("/login")
	public String loginPro(Model mod,@Validated(validacionLogin.class) @ModelAttribute("usuario")Usuario u,BindingResult resV,HttpSession sesion) {
		
		if(resV.hasErrors()) {
			return "login";
		}else {
		
		Usuario u2=repoU.login(u.getNombre(), u.getClave());	
		if(u2!=null) {
			
			sesion.setAttribute("LOGEADO", true);
			
			return "redirect:/listar";
		}	else {
			mod.addAttribute("mensaje","Datos incorrectos");
			return "login";
		}
		  
		}
	}
	
}
