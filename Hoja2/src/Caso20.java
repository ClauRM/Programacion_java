import java.util.Scanner;

public class Caso20 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida un número entero y calcule su factorial. Si el
		 * número introducido es negativo se seguirá pidiendo hasta que sea positivo.
		 * Una vez calculado se informará del resultado con el siguiente formato: “El
		 * factorial de <número> es <factorial>” Para todo número natural n, se llama
		 * factorial de n al producto de todos los naturales desde 1 hasta n.
		 */

		int numero;
		int factorial=1;
		boolean positivo=false;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Introduzca un número entero positivo:");
			numero=sc.nextInt();
			if (numero>=0) {
				positivo=true;
			} else {
				System.out.println("ERROR");
			}
		} while (!positivo);

		for (int i=1;i<=numero;i++) {
			factorial=i*factorial;
		}
		
		System.out.println("El factorial de <" +numero+"!> es igual a <"+factorial+">");
	}

}
