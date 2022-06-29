package org.fundacionview.sgsst.modelos;

import org.springframework.stereotype.Component;

@Component
public class tipoID {

	public tipoID(String nombre, String valor) {
		super();
		this.nombre = nombre;
		this.valor = valor;
	}
	private  String nombre;
	private  String valor;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public tipoID() {
		super();
	}
	
	
	
	
	
}
