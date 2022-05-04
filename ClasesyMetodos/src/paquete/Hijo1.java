package paquete;



public class Hijo1 extends Padre{

	public Hijo1() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Hijo1 [getAtributo1()=" + getAtributo1() + ", getAtributo2()=" + getAtributo2() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	@Override
	public void setAtributo2(String argumento2) {
		
		super.setAtributo2(argumento2);
		
	}
	
	
	
}
