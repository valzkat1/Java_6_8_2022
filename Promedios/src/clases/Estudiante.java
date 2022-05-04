package clases;

import java.util.Arrays;

public class Estudiante extends Persona{


	private double notas[];
	private double promedio;
	
	
	
	
	public Estudiante(String nombre, String apellidos, int edad, String sexo, double[] notas, double promedio) {
		super(nombre, apellidos, edad, sexo);
		this.notas = notas;
		this.promedio = promedio;
	}


	public Estudiante() {
		super();
	}

	//private int cantidad;
	
	
	//public int getCantidad() {
	//	return cantidad;
	//}



//	public void setCantidad(int cantidad) {
	//	this.cantidad = cantidad;
	//}



	public double[] getNotas() {
		return notas;
	}



	public void setNotas(double[] notas) {
		this.notas = notas;
	}



	public double getPromedioC() {
		double sumatoria=0;
		//for(int i=0;i<cantidad;i++) {
		for(int i=0;i<notas.length;i++) {
			sumatoria=sumatoria+notas[i];
		}
		promedio=sumatoria/notas.length;
		return promedio;
	}

	public double getPromedio() {
		return promedio;
	}

	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}



	@Override
	public String toString() {
		return "Estudiante [notas=" + Arrays.toString(notas) + ", promedio=" + promedio + ", cantidad=, getCantidad()=, getNotas()=" + Arrays.toString(getNotas())
				+ ", getPromedio()=" + getPromedio() + ", getNombre()=" + getNombre() + ", getApellidos()="
				+ getApellidos() + ", getEdad()=" + getEdad() + ", getSexo()=" + getSexo() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	
	
	// Java annotations  


	
	
	
	
}
