package clases;

public class Validaciones {

	
	public static int ConvertirEntero(String num) {
		
		int retornar=0;
		try {
			
			retornar= Integer.parseInt(num);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		return retornar;
	}
	
	
	
}
