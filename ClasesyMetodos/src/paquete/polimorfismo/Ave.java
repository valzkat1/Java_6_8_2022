package paquete.polimorfismo;

public class Ave extends Animal{

	
	public Ave(String color,String tama,int edad) {
		super.setColor(color);
		super.setTamano(tama);
		
		super.setEdad(edad);
	}
	
	
	
	@Override
	public void MetodoSobreEscribir() {
		
		System.out.println("Metodo para las aves *****");
		
	}
	
}
