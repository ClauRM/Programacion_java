
public class Caso1 {

	public static void main(String[] args) {
		/*
		 * Caso 1: Muestra las siguientes series por consola. 
		 * 12 10 8 6 4 2 0
		 * 0 3 6 9 12 15 18 
		 * 1 1 2 3 5 8 13 21... (excepto los dos primeros, cada número es las suma
		 * de las dos anteriores)
		 */
		int suma=1;
		int num1=0;
		int num2=1;
		int max = 10;
		
		System.out.println("SERIE 1:");
		for(int i = 12; i >= 0; i-=2) {
			System.out.print(" " + i);
		}
		
		System.out.println("\n" + "SERIE 2:");
		for(int i = 0; i <= 18; i+=3) {
			System.out.print(" " + i);
		}
		
		System.out.println("\n" + "SERIE 3:");		
		for(int i = 1; i <= max; i++) {
			System.out.print(" "+ suma);			
			suma = num1 + num2;
			num1 = num2;
			num2 = suma;
		}
		
	}
	
	
}
