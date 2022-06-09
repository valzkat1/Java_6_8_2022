package org.fundacionview.validaciones.modelos;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

@Component
public class Persona {

	
	@Size(min = 1,max = 100,message = "El campo nombre es requerido")
	private String nombre;
	
	@Size(min = 3,message = "Minimo 3 caracteres")
	private String apellidos;
	
	
	// numeros entre 1-7 


	@AssertTrue
	private boolean logueado;
	
	// Cr o Cl   | 
	// Cl 123 # 56 - 189
	@Pattern(regexp = "((Cr)|(Cl)) ([0-9]{1,3}) # ([0-9]{1,3}) - (([0-9]{1,3}))")
	private String clave;
	
	@Min(value = 18,message = "Solo mayores de edad.")
	private int edad;
	
	@Email(message = "Debe tener el formato de email")
	@NotBlank(message = "Campo requerido")	
	private String email;
	
	
	@NotEmpty
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
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	
	
	
	
}
