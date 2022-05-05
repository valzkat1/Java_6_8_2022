package paquete.polimorfismo;

public /* final */ class Animal {

	
	private String Color;
	private String Tamano;
	private int edad;
	
	
	public Animal() {
		
	}
	
	 
	
	public Animal(String color, String tamano, int edad) {
		super();
		Color = color;
		Tamano = tamano;
		this.edad = edad;
	}






	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getTamano() {
		return Tamano;
	}
	public void setTamano(String tamano) {
		Tamano = tamano;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Animal [Color=" + Color + ", Tamano=" + Tamano + ", edad=" + edad + ", getColor()=" + getColor()
				+ ", getTamano()=" + getTamano() + ", getEdad()=" + getEdad() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	public /*final*/ void MetodoSobreEscribir() {
		
		System.out.println("Este es el metodo original..***");
		
		
	}
	
	
	
}
