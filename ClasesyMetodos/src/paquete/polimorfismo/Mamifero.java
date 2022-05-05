package paquete.polimorfismo;

public class Mamifero extends Animal{

	
	public Mamifero(String color,String tama,int edad) {
		super.setColor(color);
		super.setTamano(tama);
		super.setEdad(edad);
	} 
	
	@Override
	public String toString() {
		return "Mamifero [getColor()=" + getColor() + ", getTamano()=" + getTamano() + ", getEdad()=" + getEdad()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}

	
	@Override
	public void MetodoSobreEscribir() {
		
		System.out.println("Este es el metodo para los mamiferos****");
		
	}
	
	
	
}
