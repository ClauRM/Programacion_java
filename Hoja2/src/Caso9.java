import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida un número entero, cuyo valor esté entre 0 y
		 * 9999. El programa debe informar de la cantidad de dígitos que tiene o dar un
		 * mensaje de error si el número introducido no está en el intervalo deseado.
		 */

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca número entero entre 0 y 9999:");
		numero = sc.nextInt();

		if (numero >= 0 && numero < 10) {
			System.out.println("El número de dígitos es: 1");
		} else if (numero >= 10 && numero < 100) {
			System.out.println("El número de dígitos es: 2");
		} else if (numero >= 100 && numero < 1000) {
			System.out.println("El número de dígitos es: 3");
		} else if (numero >= 1000 && numero < 10000) {
			System.out.println("El número de dígitos es: 4");
		} else {
			System.out.println("Número fuera de rango");
		}

	}

}
