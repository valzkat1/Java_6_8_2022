package org.fundacionview.jpa_base_datos.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

//@Entity(name = "tbl_usuario")
@Entity
public class Usuario {

	@Id
	private int id;
	
	@Size(max = 100,min = 3)
	private String nombre;
	
	@Email
	private String email;
	
	private String clave;
	
	
	
	public Usuario() {
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

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Min(value = 18)
	private int edad;
	
	
	
	
}
