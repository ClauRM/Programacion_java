import java.util.Scanner;

public class Caso11 {
 
	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea una secuencia de números, se terminará de
		 * recoger números cuando el usuario introduzca un 0. Mostrar por pantalla su
		 * suma, su producto y su media. Deberás tener cuidado si el primer número
		 * introducido es un 0, no se habrá introducido ningún número y al calcular
		 * la media, recuerda que la división por cero no existe.
		 */

		int numero;
		float suma = 0;
		float producto = 1;
		float media;
		float contador = 0;

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Introduzca un número:");
			numero = sc.nextInt();

			if (contador <= 1 && numero <= 0) {
				System.out.println("No ha introducido ningún valor");

			} else {
				contador++;
				suma += numero;
				producto = producto * numero;
				media = suma / contador;

				System.out.println("La suma es: " + suma);
				System.out.println("El producto es: " + producto);
				System.out.println("La media es: " + media);
			}

		} while (numero != 0);

		System.out.println("Número introducido 0: FIN!");

	}

}
