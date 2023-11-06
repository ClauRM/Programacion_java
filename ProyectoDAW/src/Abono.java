import java.util.Scanner;

public class Abono {

	public static void main(String[] args) {
		// CALCULA PRECIO DEL ABONO EN FUNCION DE LA EDAD Y LA ZONA

		// Z <10 25 65 >65
		// A 0 10 40 10
		// B 0 15 60 10
		// C 0 20 80 15

		// VARIABLES

		int edad;
		char zona;

		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, introduzca la edad:");
		edad = sc.nextInt();

		System.out.println("Por favor, introduzca la zona en mayúsculas, A, B o C:");
		zona = sc.next().charAt(0);

		System.out.println("===== ZONA " + zona + ": =====");

		switch (zona) {

		case 'A': // ZONA A
			if (edad < 10) {
				System.out.println("Para menores de 10 años el servicio de transporte es gratuito.");
			} else if (edad >= 10 && edad < 25) {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 10 EUR");
			} else if (edad >= 25 && edad < 65) {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 40 EUR");
			} else {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 10 EUR");
			}
			break;

		case 'B': // ZONA B

			if (edad < 10) {
				System.out.println("Para menores de 10 años el servicio de transporte es gratuito.");
			} else if (edad >= 10 && edad < 25) {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 15 EUR");
			} else if (edad >= 25 && edad < 65) {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 60 EUR");
			} else {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 10 EUR");
			}
			break;

		case 'C': // ZONA C

			if (edad < 10) {
				System.out.println("Para menores de 10 años el servicio de transporte es gratuito.");
			} else if (edad >= 10 && edad < 25) {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 20 EUR");
			} else if (edad >= 25 && edad < 65) {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 80 EUR");
			} else {
				System.out.println("El precio a pagar, correspondiente a " + edad + " años, es de 15 EUR");
			}
			break;
		}

		System.out.println("=== Hasta pronto ===");

	}

}
