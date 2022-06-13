package org.fundacionview.validaciones.modelos;

import javax.validation.constraints.Email;

import org.fundacionview.validaciones.anotaciones.Email_Gmail;
import org.springframework.stereotype.Component;

@Component
public class Persona {

	private String nombre;
	
	
	// Crear una anotacion para validar los email de gmail.
	
	//@Email
	@Email_Gmail(message = "Solo email de gmail")
	private String email;
	private String telefono;
	
	
	
	
	public Persona() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", email=" + email + ", telefono=" + telefono + "]";
	}
	
	
	
	
}
