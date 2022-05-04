package clases;

import javax.swing.JOptionPane;

public class Principal {

	
	// Scope global
	
	// Librerias, Dependencias
	// Maven , Gradle
	// XML   , Json
	double cantidad;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Scope local
		double cantidad=2;
		
	
		double resultado= Math.sqrt(cantidad);
		
		//JOptionPane.showMessageDialog(null, "La raiz cuadrada de 2 es: "+resultado);
		
		int resultado3 = (int) Math.floor(Math.random()*6 + 1);
		
	//	JOptionPane.showMessageDialog(null, "Numero aleatorio: "+resultado3);
		
		System.out.println(Math.sin( Math.toRadians(90)));
		//(-b±√(b²-4ac))/(2a) 
		
		// () [] 
		// * /
		// + -
		
		int a=2,b=9,c=10;
		
		double resultadPos,resultadoNeg,resultadoTang;
		
		resultadPos =( -b + Math.sqrt(Math.pow(b, 2) - 4*(a*c))) /2*a;
		resultadoNeg =( -b - Math.sqrt(Math.pow(b, 2) - 4*(a*c))) /2*a;
		
		System.out.println("Postivo: "+resultadPos);
		System.out.println("Negativo: "+resultadoNeg);
		
		int x=3;
		
		resultadoTang= Math.tan(Math.pow(Math.E,  Math.pow(x, 3)));
		
		System.out.println(resultadoTang);
		
		
		String cadena1="TeXto";
		String cadena2="texto";
		
		if( cadena1.equalsIgnoreCase(cadena2)) {
			System.out.println("Las cadenas son equivalentes");
		}else {
			System.out.println("Las cadenas NO son equivalentes");
		}
		
		
		String cadena3="Texto largo en el cual buscar";
		String cadena4="largoj";
		
		if(cadena3.contains(cadena4)) {
			System.out.println("Texto encontrado");
		}else {
			System.out.println("Texto no presente");
		}
		
		
		String cadena5="5730000570000";
		
		
		// String.startsWith
		// String.indexOf
		
		System.out.println(cadena5.startsWith("57"));
		
		System.out.println(cadena5.indexOf("57")==0);
		
		
		System.out.println(cadena3.concat(" "+cadena1));
		
		String cadenaEspecial="Texto con la ñ de niño";
		
		System.out.println (cadenaEspecial.replace(" ", "_"));
		
		 
		int num;
		Integer ObjNum;
		
		
	}

	
	
	
}
