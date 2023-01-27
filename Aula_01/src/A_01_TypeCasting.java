public class A_01_TypeCasting {
	
// Uma aula bastante rápida a respeito do Type Casting.

	
	public static void main(String[] args) {
		
		// Uso do double:
		
			double salario = 5350.75;
		
		// Uso do long:
		
			long numeroGrande = 33333333333L;
				
		// Uso do short:
				
			short valorPequeno = 2131;
				
		// Uso do byte:
				
			byte b = 1;
		
		// Conversão com Type Casting:
		
			int valor = (int) salario;
	
			System.out.println("Uso do Type Casting:" + " " + valor);
			
			// O valor imprimido será apenas 5350,
			//pois o int ignora o que está após o " . " 
	}
}