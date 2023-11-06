import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		/*
		 * Escribir un programa que pida tres valores enteros e imprima por pantalla el
		 * mayor de ellos. Si existen valores iguales se imprimirá cualquiera de ellos.
		 * “El número mayor es : <numero_mayor >”
		 */

		int numero1;
		int numero2;
		int numero3;

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca tres números enteros." + "\n" + "Número 1: ");
		numero1 = sc.nextInt();

		System.out.println("Número 2: ");
		numero2 = sc.nextInt();

		System.out.println("Número 3: ");
		numero3 = sc.nextInt();

		if (numero1 > numero2 && numero2 > numero3) {
			System.out.println("El número mayor es: < " + numero1 + " >");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("El número mayor es: < " + numero2 + " >");
		} else if (numero3 > numero1 && numero3 > numero2) {
			System.out.println("El número mayor es: < " + numero3 + " >");
		} else {
			System.out.println("Los tres números son iguales: < " + numero1 + " >");
		}

	}
}
