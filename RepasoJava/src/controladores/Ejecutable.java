package controladores;

import javax.swing.JOptionPane;

import modelos.Ejemplos;

public class Ejecutable {

	// Scope  -- Globales, Locales y Estaticas
	
	
	// Las variables globales pueden ser utilizadas desde cualquier metodo de 
	 static String  nombre;
	
	// Tipos de datos:   String, int, double, float, boolean (false y verdad)
	
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	JOptionPane.showMessageDialog(null, args);;
		 
	/*
	 * nombre=JOptionPane.showInputDialog("Por favor digite su nombre");
	 * 
	 * // Manipular cadenas de texto en java
	 * 
	 * 
	 * if(nombre.equalsIgnoreCase("Andres")) {
	 * 
	 * JOptionPane.showMessageDialog(null, "Usuario con permisos"); }else {
	 * JOptionPane.showMessageDialog(null, "Usuario no autorizado"); }
	 * 
	 * 
	 * 
	 * if(nombre.length()>5) {
	 * 
	 * JOptionPane.showMessageDialog(null, "El nombre tiene la longitud deseada");
	 * 
	 * }else {
	 * 
	 * JOptionPane.showMessageDialog(null,
	 * "No tenemos la cantidad de caracteres minima necesaria"); }
	 */
		
		
		// IndexOf 

		String  texA= "correXgmail.com";
		 String texB = "x";
		
		if(texA.indexOf(texB)>0) {
			JOptionPane.showMessageDialog(null, "La cadena es una correo electronico");
		}else {
			JOptionPane.showMessageDialog(null, "Cadena sin @");
		}
		 
		
		String TextoAvector[]= texA.split("");
		
		
		for(int i=0;i<TextoAvector.length;i++) {
		
		System.out.println(TextoAvector[i]);
		}
		
		
	}

	
	
	
}
