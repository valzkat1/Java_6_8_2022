package org.fundacionview.xmlbeans.modelos;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("usuario")
@Scope("prototype")
public class Usuario {

	
	private String nombre;
	private String apellidos;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	public Usuario() {
		super();
	}
	
	
	
	
}
