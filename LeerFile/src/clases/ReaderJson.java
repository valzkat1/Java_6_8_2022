package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import org.json.JSONArray;
import org.json.JSONObject;

public class ReaderJson {

	public static void main(String args[]) {
		
		String archivo="";
		
		JSONObject objetoJson = null;
		
		try {
			
			BufferedReader lector=new BufferedReader(new FileReader("GSON.txt"));
			
			StringBuilder sb=  new StringBuilder();
			
			String linea=lector.readLine();
			
			while(linea!=null) {
				sb.append(linea);
				sb.append("\n");
				linea=lector.readLine();
			}
			
			archivo=archivo+sb.toString();
			
			objetoJson=new JSONObject(archivo);
			
			}catch(Exception e) {
				
				
			}
		
		//System.out.println(archivo);
		
		System.out.println(objetoJson.get("nombre"));
		
		JSONArray arregloEstudiantes=objetoJson.getJSONArray("listadoEstudiantes");
		
		for(int i=0;i<arregloEstudiantes.length();i++) {
			
			System.out.println(arregloEstudiantes.get(i));
			JSONObject objetoInterno=arregloEstudiantes.getJSONObject(i);
			
			
			
		}
		
		
		
		
	}

	
}
