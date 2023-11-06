import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida dos números enteros positivos, si los números
		 * introducidos no son positivos se seguirán pidiendo hasta que lo sean.
		 * Calcular su producto mediante sumas e informar por pantalla del resultado.
		 * Por ejemplo: si los números son 3 y 6, las siguientes operaciones serían
		 * equivalentes: 3*6 = 3 + 3 + 3 +3 + 3 + 3 = 6+ 6+ 6
		 */

		int num1;
		int num2;
		int producto;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Dime dos números enteros y positivos:");
			num1=sc.nextInt();
			num2=sc.nextInt();
		} while (num1<0 || num2<0);
		
		producto=num1*num2;
		System.out.println("El producto es "+ producto);
		
		for(int i=num1; i<=producto; i+=num1 ){
			if (i>=num1 && i<producto) {
				System.out.print(num1);
				System.out.print(" + ");	
			} else if (i==producto) {
				System.out.print(num1);
			}

		}
		
		System.out.println("");
		
		for(int i=num2; i<=producto; i+=num2 ){
			if (i>=num2 && i<producto) {
				System.out.print(num2);
				System.out.print(" + ");	
			} else if (i==producto) {
				System.out.print(num2);
			}

		}
		
	}

}
