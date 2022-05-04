package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int cantiEstu,cantiNotas;
		
		cantiEstu= Validaciones.ConvertirEntero(JOptionPane.showInputDialog("Por favor ingrese la cantidad de Estudiantes"));
		cantiNotas= Validaciones.ConvertirEntero(JOptionPane.showInputDialog("Por favor ingrese la cantidad de notas"));
		
		ArrayList<Estudiante> miListaEstudiantes=new ArrayList<Estudiante>();
		
		for(int i=0;i<cantiEstu;i++) {
			
			Estudiante e=new Estudiante();
			e.setNombre(JOptionPane.showInputDialog("******* Por favor ingrese el nombre del estudiante "+(i+1)));
			e.setApellidos(JOptionPane.showInputDialog("Por favor ingrese los apellidos del estudiante "+e.getNombre()));
			e.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la edad")));
			
			double notas[]= new double[cantiNotas];
			
			for(int j=0;j<cantiNotas;j++) {
				
				notas[j]= Double.parseDouble(JOptionPane.showInputDialog("Nota "+(j+1)+" de "+e.getNombre()));
				
			}
			
			e.setNotas(notas);
			
			miListaEstudiantes.add(e);
			
		}
		
		for(Estudiante e1:miListaEstudiantes) {
			
			System.out.println(e1.toString()+"  "+e1.getPromedioC());
			
			
		}
		
		
		// Mostrar en consola los primedios y la informacion de cada estudiante.
		
		
	}

}
