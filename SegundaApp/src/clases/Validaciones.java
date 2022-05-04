package clases;

import javax.swing.JOptionPane;

public class Validaciones {

	public  int DeCadenaaEntero(String mensaje) {
		int numero=0;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
			}catch(Exception e ) {
				System.out.println("Error de conversion: "+e.getMessage());
				numero=0;
			}
		
		
		return numero;
	}
	
	
	
}
