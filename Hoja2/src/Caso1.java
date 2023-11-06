import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		/* 
		 * Realizar un programa que pida un número entero entre 1 y 10, ambos
		 * incluidos. Después se debe mostrar por pantalla el número introducido, pero
		 * en formato texto. Si el número introducido es 1 → La salida será: uno Si el
		 * número introducido es 2 → La salida será: dos ...... Si el número
		 * introducido es 10 → La salida será: diez Si el número introducido no está
		 * entre 1 y 10 → La salida será: número no válido
		 */

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca número entre 1 y 10:");
		numero = sc.nextInt();

		if (numero < 1 || numero > 10) {
			System.out.print("Número no válido");
		} else {
			System.out.print("Su número es: ");
			switch (numero) {
			case 1:
				System.out.print("uno");
				break;
			case 2:
				System.out.print("dos");
				break;
			case 3:
				System.out.print("tres");
				break;
			case 4:
				System.out.print("cuatro");
				break;
			case 5:
				System.out.print("cinco");
				break;
			case 6:
				System.out.print("seis");
				break;
			case 7:
				System.out.print("siete");
				break;
			case 8:
				System.out.print("ocho");
				break;
			case 9:
				System.out.print("nueve");
				break;
			case 10:
				System.out.print("diez");
				break;
			}
		}
		System.out.println("\n"+ "FIN!");

	}

}
