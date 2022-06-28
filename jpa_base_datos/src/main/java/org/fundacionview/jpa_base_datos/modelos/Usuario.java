package org.fundacionview.jpa_base_datos.modelos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

//@Entity(name = "tbl_usuario")
@Entity
@Table(name = "tbl_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(max = 100,min = 3)
	private String nombre;
	
	@Email(groups = {validacionLogin.class,validacionUser.class})
	private String email;
	
	
	@Size(min = 6,message = "Minimo 6 caracteres",groups = {validacionLogin.class})
	private String clave;
	
	
	@Min(value = 18)
	
	private int edad;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", clave=" + clave + ", edad=" + edad
				+ ", getId()=" + getId() + ", getNombre()=" + getNombre() + ", getEmail()=" + getEmail()
				+ ", getClave()=" + getClave() + ", getEdad()=" + getEdad() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	
	
}
