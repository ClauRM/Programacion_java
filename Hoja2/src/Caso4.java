import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		/*
		 * Caso 4 Escribir un programa, en lenguaje Java, que: 1o) Pida por teclado el
		 * resultado (dato entero) obtenido al lanzar un dado de seis caras. 2o) Muestre
		 * por pantalla el número en letras (dato String) de la cara opuesta al
		 * resultado obtenido. Nota 1: En las caras opuestas de un dado de seis caras
		 * están los números: 1-6, 2-5 y 3-4. Nota 2: Si el número del dado
		 * introducido es menor que 1 ó mayor que 6, se mostrará el mensaje:
		 * "ERROR: Número incorrecto.".
		 * 
		 * Ejemplo de ejecución: Introduzca número del dado: 5, En la cara opuesta
		 * está el "dos". Introduzca número del dado: 8, ERROR: Número incorrecto.
		 */

		int dado;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el lado del dado:");
		dado = sc.nextInt();


		switch (dado) {
		case 1:
			System.out.println("En la cara opuesta está el número 6");
			break;
		case 2:
			System.out.println("En la cara opuesta está el número 5");
			break;
		case 3:
			System.out.println("En la cara opuesta está el número 4");
			break;
		case 4:
			System.out.println("En la cara opuesta está el número 3");
			break;
		case 5:
			System.out.println("En la cara opuesta está el número 2");
			break;
		case 6:
			System.out.println("En la cara opuesta está el número 1");
			break;
		default:
			System.out.println("ERROR: número incorrecto.");
		}

	}
}
