import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida un número entero entre 1 y 10, ambos
		 * incluidos. Debe seguir pidiéndose mientras el número no esté en dicho
		 * intervalo. Después se debe mostrar por pantalla el número introducido, pero
		 * en formato texto. Si el número introducido es 1 → La salida será: uno Si el
		 * número introducido es 2 → La salida será: dos ......
		 */

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca número entre 1 y 10:");
		numero = sc.nextInt();

		while (numero < 1 || numero > 10) {
			System.out.println("Número no válido. Introduzca número entre 1 y 10:");
			numero = sc.nextInt();
		}

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

		System.out.println("\n" + "FIN");
	}

}
