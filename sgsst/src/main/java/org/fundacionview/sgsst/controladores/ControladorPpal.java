package org.fundacionview.sgsst.controladores;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.naming.Binding;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.fundacionview.sgsst.modelos.Ausentismo;
import org.fundacionview.sgsst.modelos.CamposGeneral;
import org.fundacionview.sgsst.modelos.CamposLogin;
import org.fundacionview.sgsst.modelos.Empleado;
import org.fundacionview.sgsst.modelos.Usuario;
import org.fundacionview.sgsst.modelos.tipoID;
import org.fundacionview.sgsst.repositorios.RepoUser;
import org.fundacionview.sgsst.repositorios.RepoUsuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControladorPpal {

	@Autowired
	RepoUsuarios repoU;
	
	@Autowired
	RepoUser usuarioLogin;
	
	@GetMapping("/")
	public String index(Model mod) {
		mod.addAttribute("usuario",new Usuario());
		
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
			ArrayList<tipoID> listaTipos=new ArrayList<tipoID>();
			listaTipos.add(new tipoID("-- Seleccionar",""));
			listaTipos.add(new tipoID("Cedula Ciudadania","CC"));
			listaTipos.add(new tipoID("Cedula Extranjero","CE"));
			
			mod.addAttribute("listaTipoID",listaTipos);
			
			return "form_empleado";
		}else
		{
			repoU.save(e);
			
		return "redirect:/home";
		}
	}
	
	
	@PostMapping("/login")
	public String login(Model mod,@Validated(CamposLogin.class) @ModelAttribute("usuario")Usuario u,BindingResult rv,HttpSession sess) {
	
		if(rv.hasErrors()) {
			return "index";
		}else {
			
			 if(usuarioLogin.loginUser(u.getUsername(),u.getClave())!=null) {
				 return "redirect:/home";
			 }else {
				 return "redirect:/";
			 }
			
			
		}
		
	}
	
	
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	
	@InitBinder
	public void bindeFechas(WebDataBinder binde ) {
		
	  SimpleDateFormat miformato=new SimpleDateFormat("yyyy-MM-dd");
				
	   binde.registerCustomEditor(Date.class, new CustomDateEditor(miformato, false));
		
	}
	
	
	@GetMapping("/listarEmpleado")
	public String listarEmpl(Model mod) {
		
		mod.addAttribute("listaEmpleados",repoU.findAll());
		
		return "listarEmpleados";
	}
	
	@GetMapping("/editar_empleado")
	public String editarEmplea(Model mod,@RequestParam("id")int id) {
		
		mod.addAttribute("empleado",repoU.getById(id));
		
		return "form_empleado";
	}
	
	@GetMapping("/crear_user")
	public String CrearUser(Model mod, @RequestParam("id")int id) {
		
		Usuario uCompo=usuarioLogin.ComprobarCrearUser(id);
		
		if(uCompo!=null) {
		
			mod.addAttribute("usuario",uCompo);
			mod.addAttribute("editando",true);
			mod.addAttribute("titulo","Editar Usuario del Empleado: "+id);
			return "form_empleado_user";
		}else {
		
		  Usuario u=new Usuario();
		  u.setUnoAuno(repoU.getById(id));
		  //u.setId_empleado(id);
		  mod.addAttribute("usuario",u);
			mod.addAttribute("editando",false);
		  mod.addAttribute("titulo","Crear Usuario del Empleado: "+id);
		  return "form_empleado_user";
		}
	}
	
	@PostMapping("/form_usuario")
	public String crearUs(@Valid @ModelAttribute("usuario")Usuario u,Model mod,BindingResult rv) {
		
		if(rv.hasErrors()) {
			return "form_empleado_user";
		}else {
		
			usuarioLogin.save(u);	
			
		return "redirect:/listarEmpleado";
		}
	}
	
	@GetMapping("/listarUser")
	public String listarUser(Model mod) {
		
		mod.addAttribute("listaEmpleados",usuarioLogin.findAll());
		
		return "listarUser";
	}
	
	
	
	@GetMapping("/editar_user")
	public String editarUser(Model mod,@RequestParam("id")int id) {
		
		mod.addAttribute("usuario",usuarioLogin.getById(id));
		mod.addAttribute("editando",true);
		mod.addAttribute("titulo","Editar Usuario del Empleado: "+id);
		return "form_empleado_user";
	}
	
	
	@GetMapping("/eliminar_user")
	public String eliminarUser(Model mod,@RequestParam("id")int id) {
		
		usuarioLogin.deleteById(id);
	
		return "redirect:/listarUser";
	}
	
	@GetMapping("/form_incapacidad")
	public String formAusentismo(Model mod) {
		
		mod.addAttribute("ausentismo",new Ausentismo());
		return "form_ausentismos";
	}
	
	
	
}
