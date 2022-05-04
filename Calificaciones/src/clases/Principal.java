package clases;

import java.util.ArrayList;

public class Principal {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double notas[]=new double[3];
		notas[0]=3.5;
		notas[1]=4;
		notas[2]=5;
		
		Estudiante objEstud=new Estudiante();
		
		System.out.println("Objeto estudiante linea 11*** "+objEstud.toString());
		
		objEstud.setNombre("Victor");
		objEstud.setEdad(30);
		objEstud.setSexo("M");
		objEstud.setApellidos("Ramirez");
		
		objEstud.setNotas(notas);
		//objEstud.setCantidad(3);
		
		
		System.out.println("Objeto estudiante linea 18*** "+objEstud.toString());
		
		System.out.println("El promedio del estudiante es: "+objEstud.getPromedioC());
		
		
		Profesor objProfe=new Profesor();
		
		objProfe.LlenarMatriz(3, 3);
		
		objProfe.MostrarMatriz(3, 3);
		
		
		ArrayList<Estudiante> ListaEstudiantes=new ArrayList<Estudiante>();
		
		//List<Estudiante>
		
		ListaEstudiantes.add(objEstud);
		
		
		double notas2[]=new double[3];
		notas2[0]=4;
		notas2[1]=4;
		notas2[2]=4;
		Estudiante pepe=new Estudiante("Pepe","Perez",20,"M",notas2,0);
		
		ListaEstudiantes.add(pepe);
		
		
		// ForEach 
		for(Estudiante e:ListaEstudiantes) {
			
			System.out.println(e.toString());
			
		}
		
		
		
	}

}
