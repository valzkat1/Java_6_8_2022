package org.fundacionview.xmlbeans.modelos;



public class Empleado {

	private String nombre;
	private String apellidos;
	private String cargo;
	
	
	
	
	public Empleado() {
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
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	public String getActividades() {
		return "Atiende Clientes, Oficios varios";
	}
	
}
