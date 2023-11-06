import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa en Java que lea una secuencia de números y determine
		 * cual es el mayor de ellos y el número de veces que aparece. Cada vez que se
		 * introduce un número se debe preguntar “Se desea continuar (s /n)”. La
		 * ejecución se terminará siempre que el usuario pulse algo distinto de s.
		 */

		int numero;
		int nummayor = 0;
		int repeticion = 1;
		char continuar = 's';

		Scanner sc = new Scanner(System.in);

		do {

			System.out.println("Introduzca un número:");
			numero = sc.nextInt();
			sc.nextLine();

			if (numero > nummayor) {
				nummayor = numero;
				repeticion=1;

			} else if (numero == nummayor) {
				repeticion++;
			}

			System.out.println("¿Desea continuar?: s/n");
			continuar = sc.next().charAt(0);

		} while (continuar == 's' || continuar == 'S');

		System.out.println("El mayor de los números es: " + nummayor + ". Dicho número se ha repetido "+ repeticion +" veces" );

		sc.close();

	}

}
