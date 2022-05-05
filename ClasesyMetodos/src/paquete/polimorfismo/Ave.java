package paquete.polimorfismo;

public class Ave extends Animal{

	
	public Ave(String color,String tama,int edad) {
		super.setColor(color);
		super.setTamano(tama);
		
		super.setEdad(edad);
	}
	
	
	
	@Override
	// Es posible sobreescribir el nivel de acceso siempre y cuando no se reduzca
	public void MetodoSobreEscribir() {
		
		System.out.println("Metodo para las aves *****");
		
	}
	
}
