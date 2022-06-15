package org.fundacionview.jpa_base_datos.controladores;

import org.fundacionview.jpa_base_datos.modelos.Usuario;
import org.fundacionview.jpa_base_datos.repositorios.RepositorioUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorUsuarios {

	@Autowired
	RepositorioUser repoU;
	
	
	@GetMapping("/")
	public String index() {
		
		Usuario u= new Usuario();
		u.setNombre("Victor");
		u.setEdad(19);
		u.setEmail("loquesea@gmail.com");
		repoU.save(u);
		
		
		return "index";
	}
	
}
