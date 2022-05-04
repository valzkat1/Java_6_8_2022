package clases;

public class Profesor extends Persona{

	
	private int matriz[][];
	
	
	
	
	public int[][] getMatriz() {
		return matriz;
	}




	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}


	
	public void LlenarMatriz(int filas,int columnas) {
		
		this.matriz =new int[filas][columnas];
		
		for(int i=0;i<filas;i++) {
			
			
			for(int j=0;j<columnas;j++) {
				
				this.matriz[i][j]=getAleatorio();
				
				
			}
			
		}
		
	}
	
	
	public void MostrarMatriz(int filas,int columnas) {
		
		for(int i=0;i<filas;i++) {
			
			for(int j=0;j<columnas;j++) {
				
				System.out.print(this.matriz[i][j] +" | ");
				
			
				if(j<columnas-1) {				
				}else {
					System.out.println("");
				}
				
			}
			
			System.out.println("----------");
		}
		
		
	}
	
	
	
	public int getAleatorio() {
		
		return (int)(Math.random()*10+1);
		
	}
	


	@Override
	public String toString() {
		return "Profesor [getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()="
				+ getEdad() + ", getSexo()=" + getSexo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
	
}
