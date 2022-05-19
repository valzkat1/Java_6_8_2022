package org.fundacionview.primeraapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controlador {

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
}
