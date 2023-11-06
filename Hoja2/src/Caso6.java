import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida un número entero y escriba por pantalla
		 * dependiendo del valor del número: “El número introducido es < valor_numero
		 * >”, en el caso de que sea positivo. “El número introducido es NEGATIVO”, en
		 * el caso de que sea negativo.
		 */

		int numero;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique un número entero: ");
		numero = sc.nextInt();

		if (numero >= 0) {
			System.out.println("El número introducido es < " + numero + " >");
		} else {
			System.out.println("El número introducido es NEGATIVO");
		}
	}

}
