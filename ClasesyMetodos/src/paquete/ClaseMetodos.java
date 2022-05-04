package paquete;

import java.lang.*;

public class ClaseMetodos {

	// niveles de acceso..
	
	// Static no es necesario instanciar un objeto de la clase 
	
	// public static  Aplica tanto para metodos como para propiedades..
	
	
	//Math.PI;
	
	
    public static int numero;
    
    
    public Argumento objArgumento;

    public static int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        numero = numero;
    }
    
    
    public void Datos(String dato1,int dato2,Argumento dato3) {
    	
    }
    
    
    public void promedio(double nota1,double nota2,double nota3) {
    	
    }
    
    
    
    public static void metodoRecursivo(int inicio,int fin) {
    	
    	if(inicio<=fin) {
    		
    		//inicio=inicio+1;
    		
    		System.out.println("estamos en el paso "+inicio);
    		inicio++;
    		metodoRecursivo(inicio, fin);
    		
    		
    	}else {
    		
    		System.out.println("Aca deberia terminar***");
    		
    	}
    	
    	
    	
    }
    
    
    
    public void cargarArgumento(Argumento argu) {
    	objArgumento=argu;
    	
    }
    
	
	
	
	
}
