import javax.swing.JOptionPane;

public class Primera {

	
    // Promedios
    // Calcular el promedio de n notas ingresadas por el usuario
    // Sum Notas/canti
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Definir cantidad Como Entero
		int cantidad=0; 
		double suma,promedio;
		suma=0;
		
		
		try {
	 	cantidad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de notas a promediar"));
		}catch(Exception e ) {
			System.out.println("Error de conversion: "+e.getMessage());
			cantidad=0;
		}
		
		for(int i=1;i<=cantidad;i++) {
			
			suma = suma+  Double.parseDouble(JOptionPane.showInputDialog("Por favor ingrese la nota "+i));
			
		}
		
		promedio = suma/cantidad;
		
		
		JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
		
		
	}

}
