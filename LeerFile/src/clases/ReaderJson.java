package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReaderJson {

	public static void main(String args[]) {
		
		String archivo="";
		try {
			
			BufferedReader lector=new BufferedReader(new FileReader("GSON.txt"));
			
			StringBuilder sb=  new StringBuilder();
			
			String linea=lector.readLine();
			
			while(linea!=null) {
				sb.append(linea);
				linea=lector.readLine();
			}
			
			archivo=archivo+sb.toString();
			
			}catch(Exception e) {
				
				
			}
		
		System.out.println(archivo);
	}

	
}
