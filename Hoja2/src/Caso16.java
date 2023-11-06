
public class Caso16 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que muestre por pantalla las secuencias: 1 en 1 hasta el
		 * 20; Impares hasta el 20; 5 en 5 hasta el 50; 10 en 10 desde el 100 en orden
		 * inverso; Pares hasta el 26;
		 */

		System.out.println("Secuencia 1:");
		for (int i = 1; i <= 20; i++) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println("\n" + "Secuencia 2:");
		for (int i = 1; i <= 21; i += 2) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println("\n" + "Secuencia 3:");
		for (int i = 5; i <= 50; i += 5) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println("\n" + "Secuencia 4:");
		for (int i = 100; i >= 0; i -= 10) {
			System.out.print(i);
			System.out.print(" ");
		}

		System.out.println("\n" + "Secuencia 5:");
		for (int i = 2; i <= 26; i += 2) {
			if (i % 8 != 0) {
				System.out.print(i);
				System.out.print(" ");
			}
		}

	}

}
