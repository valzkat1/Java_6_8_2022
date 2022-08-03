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
import org.fundacionview.sgsst.modelos.Empleado.AreasEmpresa;
import org.fundacionview.sgsst.modelos.Permisos;
import org.fundacionview.sgsst.modelos.Usuario;
import org.fundacionview.sgsst.modelos.tipoID;
import org.fundacionview.sgsst.repositorios.RepoAusentismos;
import org.fundacionview.sgsst.repositorios.RepoCie10;
import org.fundacionview.sgsst.repositorios.RepoUser;
import org.fundacionview.sgsst.seguridad.PermissionCheck;
import org.fundacionview.sgsst.seguridad.SecurityUtil;
import org.fundacionview.sgsst.seguridad.Workspace;
import org.fundacionview.sgsst.repositorios.RepoEmpleados;
import org.fundacionview.sgsst.repositorios.RepoPermisos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
	RepoEmpleados repoEmpleado;
	
	@Autowired
	RepoUser usuarioLogin;
	
	@Autowired
	RepoAusentismos repoA;
	
	
	@Autowired
	RepoPermisos repoPermi;
	
	
	@Autowired
	RepoCie10 cie10;
	
	
	@GetMapping({"/","/login"})	
	public String index(Model mod) {
		//mod.addAttribute("usuario",new Usuario());
		
		//System.out.println("*****  -- "+repoU.consultaNativa());
		
		return "index";
	}
	
	
	@GetMapping("/form_empleado")
	@PermissionCheck(workspace = {Workspace.EMPLEADOS},write = true)
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
	@PermissionCheck(workspace = {Workspace.EMPLEADOS},write = true)
	public String procesaFormulario(Model mod, @Valid @ModelAttribute("empleado")Empleado e,BindingResult rv) {
		
		if(rv.hasErrors()) {
			ArrayList<tipoID> listaTipos=new ArrayList<tipoID>();
			listaTipos.add(new tipoID("-- Seleccionar",""));
			listaTipos.add(new tipoID("Cedula Ciudadania","CC"));
			listaTipos.add(new tipoID("Cedula Extranjero","CE"));
			
			mod.addAttribute("listaTipoID",listaTipos);
			
			return "form_empleado";
		}else
		{
			repoEmpleado.save(e);
			
		return "redirect:/home";
		}
	}
	
	
	//@PostMapping("/login")
	public String login(Model mod,@Validated(CamposLogin.class) @ModelAttribute("usuario")Usuario u,BindingResult rv,HttpSession sess) {
	
		if(rv.hasErrors()) {
			return "index";
		}else {
			
			 if(usuarioLogin.loginUser(u.getUsername(),u.getPassword())!=null) {
				 return "redirect:/home";
			 }else {
				 return "redirect:/";
			 }
			
			
		}
		
	}
	
	
	
	@GetMapping("/home")
	@PermissionCheck(workspace = {Workspace.HOME},read = true)
	public String home() {
		return "home";
	}
	
	
	@InitBinder
	public void bindeFechas(WebDataBinder binde ) {
		
	  SimpleDateFormat miformato=new SimpleDateFormat("yyyy-MM-dd");
				
	   binde.registerCustomEditor(Date.class, new CustomDateEditor(miformato, false));
		
	}
	
	
	@GetMapping("/listarEmpleado")
	@PermissionCheck(workspace = {Workspace.EMPLEADOS},read = true)
	public String listarEmpl(Model mod) {
		
		Permisos permisoEmplea=repoPermi.consultaRolPermisos( SecurityUtil.getUser().getRoles().toString(), "Empleados");
		
		mod.addAttribute("permiso",permisoEmplea);
		mod.addAttribute("listaEmpleados",repoEmpleado.findAll());
		
		return "listarEmpleados";
	}
	
	
	@GetMapping("/editar_empleado")
	@PermissionCheck(workspace = {Workspace.EMPLEADOS},write  = true)
	public String editarEmplea(Model mod,@RequestParam("id")int id) {
		
		
		ArrayList<tipoID> listaTipos=new ArrayList<tipoID>();
		listaTipos.add(new tipoID("-- Seleccionar",""));
		listaTipos.add(new tipoID("Cedula Ciudadania","CC"));
		listaTipos.add(new tipoID("Cedula Extranjero","CE"));
		
		mod.addAttribute("listaTipoID",listaTipos);
		mod.addAttribute("empleado",repoEmpleado.getById(id));
		
		return "editar_empleado";
	}
	
	@GetMapping("/crear_user")
	@PermissionCheck(workspace = {Workspace.USUARIOS},read = true)
	public String CrearUser(Model mod, @RequestParam("id")int id) {
		
		Usuario uCompo=usuarioLogin.ComprobarCrearUser(id);
		
		if(uCompo!=null) {
		
			mod.addAttribute("usuario",uCompo);
			mod.addAttribute("editando",true);
			mod.addAttribute("titulo","Editar Usuario del Empleado: "+id);
			return "form_empleado_user";
		}else {
		
		  Usuario u=new Usuario();
		  u.setUnoAuno(repoEmpleado.getById(id));
		  //u.setId_empleado(id);
		  mod.addAttribute("usuario",u);
			mod.addAttribute("editando",false);
		  mod.addAttribute("titulo","Crear Usuario del Empleado: "+id);
		  return "form_empleado_user";
		}
	}
	
	
	
	@GetMapping("/editar_user")
	@PermissionCheck(workspace = {Workspace.USUARIOS},read = true)
	public String editar_user(Model mod, @RequestParam("id")int id) {
		
		Usuario uCompo=usuarioLogin.ComprobarCrearUser(id);
		
		if(uCompo!=null) {
		
			mod.addAttribute("usuario",uCompo);
			mod.addAttribute("editando",true);
			mod.addAttribute("titulo","Editar Usuario del Empleado: "+id);
			return "editar_user";
		}else {
		
		  Usuario u=new Usuario();
		  u.setUnoAuno(repoEmpleado.getById(id));
		  //u.setId_empleado(id);
		  mod.addAttribute("usuario",u);
			mod.addAttribute("editando",false);
		  mod.addAttribute("titulo","Crear Usuario del Empleado: "+id);
		  return "editar_user";
		}
	}
	
	@Autowired
	BCryptPasswordEncoder encode;
	
	
	@PostMapping("/form_usuario")
	@PermissionCheck(workspace = {Workspace.USUARIOS},write =  true)
	public String crearUs(@Valid @ModelAttribute("usuario")Usuario u,BindingResult rv,Model mod) {
		
		if(rv.hasErrors()) {
			return "form_empleado_user";
		}else {
		
			
			u.setPassword(encode.encode(u.getPassword()));
			usuarioLogin.save(u);	
			
		return "redirect:/listarEmpleado";
		}
	}
	
	
	
	@PostMapping("/editar_user")
	@PermissionCheck(workspace = {Workspace.USUARIOS},write =  true)
	public String editar_user(@Valid @ModelAttribute("usuario")Usuario u,BindingResult rv,Model mod) {
		
		if(rv.hasErrors()) {
			return "editar_user";
		}else {
		
			
			//u.setPassword(encode.encode(u.getPassword()));
			usuarioLogin.save(u);	
			
		return "redirect:/listarEmpleado";
		}
	}
	
	@GetMapping("/listarUser")
	@PermissionCheck(workspace = {Workspace.USUARIOS},read = true)
	public String listarUser(Model mod) {
		
		mod.addAttribute("listaEmpleados",usuarioLogin.findAll());
		
		return "listarUser";
	}
	
	
	
	
	
	
	@GetMapping("/eliminar_user")
	@PermissionCheck(workspace = {Workspace.USUARIOS},delete =  true)
	public String eliminarUser(Model mod,@RequestParam("id")int id) {
		
		usuarioLogin.deleteById(id);
	
		return "redirect:/listarUser";
	}
	
	
	@GetMapping("/eliminar_empleado")
	@PermissionCheck(workspace = {Workspace.USUARIOS},delete =  true)
	public String eliminar_empleado(Model mod,@RequestParam("id")int id) {
		
		repoEmpleado.deleteById(id);
	
		return "redirect:/listarEmpleado";
	}
	
	
	@GetMapping("/form_incapacidad")
	@PermissionCheck(workspace = {Workspace.AUSENTISMOS},write  = true)
	public String formAusentismo(Model mod) {
		
		mod.addAttribute("ausentismo",new Ausentismo());
		return "form_ausentismos";
	}
	
	
	
	@PostMapping("/form_incapacidad")
	@PermissionCheck(workspace = {Workspace.AUSENTISMOS},write = true)
	public String procesaFormularioIncapacidad(Model mod, @Valid @ModelAttribute("ausentismo")Ausentismo a,BindingResult rv,@RequestParam("dataDiagnosti")String dataDiagnosti) {
		
		if(rv.hasErrors()) {
			
			return "form_ausentismos";
		}else
		{
			
			Empleado e=repoEmpleado.consultarByID((a.getNumDoc()));
			
			a.setTipoDoc(e.getTipoID());
			a.setApellidos(e.getApellidos());
			
			a.setAreaTrabajo(e.getAreaEmpleado());
			a.setDiagnostico(cie10.getDiagnosti(dataDiagnosti.toLowerCase()));
			
			double valorInca=a.getTotalDias()*a.getSalarioDia();
			a.setValorIncapacidad(valorInca);
			
			double calculos[]=calculoEntidadPagadora(a.getTipoIncapacidad(), a.getTotalDias(), a.getSalarioDia());
			a.setTotalEPS(calculos[1]);
			a.setTotalARL(calculos[3]);
			a.setTotalPensiones(calculos[2]);
			a.setAsumidoEmpresa(calculos[0]);
			a.setFechaReg(new Date());
			repoA.save(a);
			
		return "redirect:/listarIncapacidad";
		}
	}
	
	
	
	public double[] calculoEntidadPagadora(String tipoIncapa,int totalDias,double salarioDia) {
		
		double totalPagar[]=new double[4];  //0=Empleador, 1=EPS, 2=Fondo Pension,3= ARL
		if(tipoIncapa.equals("Enfermedad Comun")) {
			if(totalDias<3) {
				totalPagar[0]=totalDias*salarioDia;
				totalPagar[1]=0.0;
				totalPagar[2]=0.0;
				totalPagar[3]=0.0;
			}else if(totalDias<=180) {
				totalPagar[0]=(2*salarioDia);
				totalPagar[1]=((totalDias-2)*salarioDia)*0.6667;
				totalPagar[2]=0.0;
				totalPagar[3]=0.0;
			}else if(totalDias<=540){
				totalPagar[0]=(2*salarioDia);
				totalPagar[1]=((178)*salarioDia)*0.6667;
				totalPagar[2]=(totalDias-180)*salarioDia*0.5;
				totalPagar[3]=0.0;
				
			}else {
				totalPagar[0]=(2*salarioDia);
				totalPagar[1]=((178)*salarioDia)*0.6667;
				totalPagar[2]=(totalDias-180)*salarioDia*0.5;
				totalPagar[3]=0.0;
			}
			
		}else if(tipoIncapa.equals("Licencia Maternidad")) {
			
			totalPagar[0]=0.0;
			totalPagar[1]=totalDias*salarioDia;
			totalPagar[2]=0.0;
			totalPagar[3]=0.0;
			
			
		}else if(tipoIncapa.equals("Licencia Paternidad")) {
			
			totalPagar[0]=0.0;
			totalPagar[1]=totalDias*salarioDia;
			totalPagar[2]=0.0;
			totalPagar[3]=0.0;
			
			
		}else if(tipoIncapa.equalsIgnoreCase("Accidente de Trabajo") || tipoIncapa.equalsIgnoreCase("Enfermedad Laboral")) {
			totalPagar[0]=0.0;
			totalPagar[1]=0.0;
			totalPagar[2]=0.0;
			totalPagar[3]=totalDias*salarioDia;
			
			
		}else if(tipoIncapa.equals("Fondo Pensiones")) {
			
			
			
		}else if(tipoIncapa.equals("Accidente de Transito")) {
			
			if(totalDias<3) {
				totalPagar[0]=totalDias*salarioDia;
				totalPagar[1]=0.0;
				totalPagar[2]=0.0;
				totalPagar[3]=0.0;
			}else {
				totalPagar[0]=2*salarioDia;
				totalPagar[1]=0.0;
				totalPagar[2]=0.0;
				totalPagar[3]=(totalDias-2)*salarioDia*0.67;
			}
			
		}
		
		
		return totalPagar;
	}
	
	
	
	
	@GetMapping("/listarIncapacidad")
	@PermissionCheck(workspace = {Workspace.AUSENTISMOS},read = true)

	public String listarIncapacidad(Model mod) {
		
		mod.addAttribute("listaIncapacidades",repoA.findAll());
		
		return "listarIncapacidad";
	}
	
	@GetMapping("/sinPermisos")
	public String sinPermisos() {
		return "sinPermisos";
	}
	
	
	@GetMapping("/editar_incapacidad")
	public String editar_incapacidad(Model mod,@RequestParam("id")int id) {
		
		mod.addAttribute("ausentismo",repoA.getById(id));
		
		return "editar_incapacidad";
	}
	
	
	@GetMapping("/reporteArea")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String reporteArea() {
		return "reporteArea";
	}
	
	
	@PostMapping("/reporteAreas")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String generarReporteArea(Model mod,@RequestParam("area")AreasEmpresa area) {
	//public String generarReporteArea(Model mod,@RequestParam("area")Integer area) {		
		
		mod.addAttribute("listaIncapacidades",repoA.findByAreaTrabajo(area));
		//mod.addAttribute("listaIncapacidades",repoA.buscarPorArea(area));
		mod.addAttribute("area",area);
		return "tableReporteArea";
	}
	
	@GetMapping("/reporteTipo")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String reporteTipo() {
		return "reporteTipo";
	}
	
	@PostMapping("/reporteTipo")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String generarReporteTipo(Model mod,@RequestParam("tipoIncapacidad")String tipo) {
		
		
		mod.addAttribute("listaIncapacidades",repoA.findByTipoIncapacidad(tipo));
		mod.addAttribute("area",tipo);
		return "tableReporteTipo";
	}
	
	
	@GetMapping("/reporteCuentas")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String reporteCuentas() {
		return "reporteCuentas";
	}
	
	
	@PostMapping("/reporteCuentas")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String generarReporteCuentas(Model mod,@RequestParam("fechaIn")Date fechaIn,@RequestParam("fechaFin")Date fechaFin) {
		
		
		mod.addAttribute("listaIncapacidades",repoA.consultaCuentas(fechaIn,fechaFin));
		mod.addAttribute("fechas","Entre "+fechaIn.toString()+" y "+fechaFin.toString());
		return "tableReporteCuentas";
	}
	
	@GetMapping("/reporteEmpleado")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String reporteEmpleado() {
		return "reporteEmpleado";
	}
	
	@PostMapping("/reporteEmpleado")
	@PermissionCheck(workspace = {Workspace.REPORTES},read = true)
	public String generarReporteEmpleados(Model mod,@RequestParam("numDoc")Long numDoc,@RequestParam("nombre")String nombre) {
		
		
		mod.addAttribute("listaIncapacidades",repoA.findByNumDoc(numDoc));
		mod.addAttribute("titulo",nombre);
		return "tableReporteEmpleados";
	}
	
	
}
