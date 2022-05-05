package paquete;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Principal {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Trabajando con archivos**");
		
		try {
			FileWriter objArchivo=new FileWriter("logs.txt");
			
			objArchivo.write("Cualquier informacion que desee escribir en el archivo**\n");
			
			//  Adicionamos minimamente 50 lineas con su contador al frente.
			
			for(int i=1;i<=50;i++) {
				
				objArchivo.write(i+". Cualquier texto para cada linea.. \n");
				
			}
			
			
			objArchivo.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
