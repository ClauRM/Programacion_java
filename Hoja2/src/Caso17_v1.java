import java.util.Scanner;

public class Caso17_v1 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que muestre por pantalla la secuencia: 135791113151719
		 * Primero de la secuencia Mi número de la suerte No soy supersticioso Último
		 * de la secuencia
		 */

		int numSuerte = 1;
		int numSuperst = 19;
		int numJuego;
		char fin = 'n';
		boolean salir = false;

		System.out.println("¡¡ Adivina mi número de la suerte !!");
		System.out.println("1 3 5 7 9 11 13 15 17 19");

		Scanner sc = new Scanner(System.in);

		do {
			// PEDIR VALOR POR CONSOLA
			System.out.println("Indique un número de los mostrados:");
			numJuego = sc.nextInt();
			// EVALUAR SI EL NUMERO SE ENCUENTRA FUERA DEL RANGO
			if (numJuego < -1 || numJuego > 20) {
				System.out.println("Ohh... el número jugado está fuera de rango");
			} else {
				// EVALUAR SI EL NUMERO NO ES PAR
				if ((numJuego % 2) == 0) {
					System.out.println("Vaya... el número no está en la serie");
				} else {
					System.out.println("Vamos a revisar tu numero, espere un momento...");
				}
				// SI ADIVINA EL SEGUNDO VALOR IMPRIME NO SOY SUPERSTICIOSO Y SIGUE EN EL JUEGO
				if (numJuego == numSuperst) {
					System.out.println("Uich, no soy supersticioso...");
					salir = false;
				}
				// SI ADIVINA EL VALOR IMPRIMA MI NUMERO DE LA SUERTE Y SALE DEL JUEGO
				else if (numJuego == numSuerte) {
					System.out.println("¡Es mi número de la suerte!");
					salir = true;
				} else {
					// PREGUNTAR SI DESEA FINALIZAR EL JUEGO
					System.out.println("Buah, tu numero no vale pa ná :/");
					System.out.println("¿Quieres continuar? S/N");
					fin = sc.next().charAt(0);

					if (fin == 'S' || fin == 's') {
						salir = false;
					} else if (fin == 'N' || fin == 'n') {
						salir = true;
					}
				}
			}
		} while (!salir);

		sc.close();
		System.out.println("FIN DEL JUEGO");

	}
}
