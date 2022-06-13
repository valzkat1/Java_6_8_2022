package org.fundacionview.validaciones.modelos;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.fundacionview.validaciones.anotaciones.Confirmar_Email;
import org.fundacionview.validaciones.anotaciones.Email_Gmail;
import org.fundacionview.validaciones.anotaciones.GrupoGeneral;
import org.fundacionview.validaciones.anotaciones.GrupoLogin;
import org.fundacionview.validaciones.anotaciones.Indicativo_Colombia;
import org.springframework.stereotype.Component;

@Component
@Confirmar_Email(groups = {GrupoGeneral.class})
public class Persona {

	@NotEmpty(groups = {GrupoGeneral.class})
	private String nombre;
	

	private String confirmaremail;
	
	// Indicativo de colombia.
	@Indicativo_Colombia(groups = {GrupoGeneral.class})
	private String telefono;
	// Crear una anotacion para validar los email de gmail.
	
	//@Email
	@Email_Gmail(message = "Solo email de gmail",groups = {GrupoLogin.class})
	private String email;
	
	
	@Size(min = 6,message = "Solo claves con mas de 6 caracteres.",groups = {GrupoLogin.class})
	
	private String clave;
	
	@Min(value = 18,message = "Solo mayores de edad")
	private int edad;
	
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getConfirmaremail() {
		return confirmaremail;
	}
	public void setConfirmaremail(String confirmaremail) {
		this.confirmaremail = confirmaremail;
	}

	
	
	
	
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
