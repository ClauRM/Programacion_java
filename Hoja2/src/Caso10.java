import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa en Java que lea una secuencia de números positivos.
		 * Mostrar por pantalla su suma y su producto. Se terminará de procesar
		 * números cuando el usuario introduzca un número negativo.
		 */

		int numero = 0;
		int suma = 0;
		int producto = 1;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca un número:");
			numero = sc.nextInt();
			suma += numero;
			producto = producto * numero;
			System.out.println("Suma = " + suma + " y Producto = " + producto);
		} while (numero >= 0);

		System.out.println("Fin!");
	}

}
