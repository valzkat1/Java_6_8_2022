package org.fundacionview.web_1.modelos;

import java.util.Arrays;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
//@Scope("prototype")
public class Estudiante {

	private String nombre;
	private int edad;
	private String apellidos;
	private String direccion;
	private String telefono;

	private String genero;
	private boolean activo;
	private boolean mayorEdad;
	
	private String clave;
	private String textoLargo;
	private String escondido;
	
	
	
	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getTextoLargo() {
		return textoLargo;
	}

	public void setTextoLargo(String textoLargo) {
		this.textoLargo = textoLargo;
	}

	public String getEscondido() {
		return escondido;
	}

	public void setEscondido(String escondido) {
		this.escondido = escondido;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
	public Double calcularPromedio(Double notas[]) {
		
		Double suma=0.0;
		for(int i=0;i<notas.length;i++) {
			suma=suma+notas[i];
		}
		/**/
		//return 0.0;
		return (suma/notas.length);
	}
	public Estudiante(String nombre, int edad, Double[] notas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		//this.notas = notas;
	}
	
	public Estudiante() {
		super();
		
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", apellidos=" + apellidos + ", direccion="
				+ direccion + ", telefono=" + telefono + ", genero=" + genero + ", activo=" + activo + ", getGenero()="
				+ getGenero() + ", isActivo()=" + isActivo() + ", getApellidos()=" + getApellidos()
				+ ", getDireccion()=" + getDireccion() + ", getTelefono()=" + getTelefono() + ", getNombre()="
				+ getNombre() + ", getEdad()=" + getEdad() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}





	
	
}
