package paquete;

import paquete.polimorfismo.Animal;
import paquete.polimorfismo.Ave;
import paquete.polimorfismo.Mamifero;

public class App {

	public static void main(String[] args) {


		
		/*
		 * ClaseMetodos.metodoRecursivo(1, 100);
		 * 
		 * 
		 * 
		 * Hijo1 objHij1= new Hijo1();
		 * 
		 * 
		 * objHij1.setAtributo1(1);
		 * 
		 * 
		 * System.out.println(objHij1.toString());
		 */

		
		Animal objAnimal=new Animal("Negro", "Grande", 5);
		
		Animal ArregloAnimal[]=new Animal[4];
		
		ArregloAnimal[0]=objAnimal;
		
		ArregloAnimal[1]= new Animal("Blanco", "Mediano", 10);
		
		ArregloAnimal[2]= new Mamifero("Gris","Pequeño",7);
		
		ArregloAnimal[3]= new Ave("Azul", "Pequeño", 1);
		
		
		for(int i=0;i<3;i++) {
			
			System.out.println(" "+ArregloAnimal[i]);
			
		}
		
			
		objAnimal.MetodoSobreEscribir();
		ArregloAnimal[2].MetodoSobreEscribir();
		ArregloAnimal[3].MetodoSobreEscribir();
		
		
		
		
		
		
	}

}
