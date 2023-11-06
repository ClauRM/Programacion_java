import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa en java que lea temperaturas en grados Celsius y las
		 * transforme a la escala Fahrenheit. La formula de transformación es:
		 * F=C*9/5+32 Tras cada ejecución, el programa muestra por pantalla el mensaje:
		 * “Desea continuar [s/n]”. La ejecución finaliza cuando se responde algo
		 * distinto de ‘s’.
		 */

		int celsius;
		int fahrenheit;
		char continuar = 'S';

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Introduzca temperatura en grados Celsius:"); // SOLICITAR TEMPERATURA EN CELSIUS
			celsius = sc.nextInt();
			fahrenheit = (celsius * 9 / 5) + 32; // CONVERTIR Cº A Fº
			System.out.println(celsius + "ºC corresponden a " + fahrenheit + "ºF"); // MOSTRAR RESULTADO
			System.out.println("Desea continar?: S/N");// PARA CONTINUAR
			continuar = sc.next().charAt(0);
		} while (continuar == 's' | continuar == 'S');

		System.out.println("FIN");

	}

}
