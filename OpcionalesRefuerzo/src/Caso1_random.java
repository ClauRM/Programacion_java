import java.util.Random;
import java.util.Scanner;

public class Caso1_random {

	public static void main(String[] args) {
		/*
		 * El sistema pedirá al usuario un número entre 100 y 1000. El sistema pedirá un
		 * número de repeticiones superior a 3. No se admitirán números fuera de esos
		 * rangos. El sistema generará números al azar entre 100 y el número
		 * seleccionado por el usuario. Generará tantos números como repeticiones se
		 * pidan. Mostrará los tres números más altos que aparezcan al azar tras las
		 * repeticiones
		 */

		int numeroUsuario = 0;
		int repeticiones;
		int numeroRandom;
		int maximo1 = 0;
		int maximo2 = 0;
		int maximo3 = 0;

		Scanner sc = new Scanner(System.in);

		// INSTANCIO LA CLASE RANDOM QUE UTILIZARE PARA GENERAR LOS NUMEROS ALEATORIOS
		Random random = new Random(numeroUsuario);

		// PEDIR NUMERO ENTRE 100 Y 1000. NO SE ADMITEN FUERA DE RANGO

		do {
			System.out.println("Indique número entre 100 y 1000:");
			numeroUsuario = sc.nextInt();
		} while (numeroUsuario < 100 || numeroUsuario > 1000);

		// PEDIR NUMERO DE REPETICIONES MAYOR A 3. NO SE ADMINTEN MENOS
		do {
			System.out.println("Indique número de repeticiones superior a 3:");
			repeticiones = sc.nextInt();
		} while (repeticiones < 3);

		// BUCLE FOR PARA CONTROLAR EL NUMERO DE REPETICIONES
		for (int i = 0; i < repeticiones; i++) {
			// GENERA NUMERO RANDOM ENTRE 100 Y EL NUMERO SELECCIONADO
			// UTILIZANDO METODO NEXTINT (upperBound-lowerBound) + lowerBound
			numeroRandom = random.nextInt(numeroUsuario - 100) + 100;
			//BUCLE IF PARA ORDENAR DE MAYOR A MENOR
			if (numeroRandom > maximo1) {
				maximo1 = numeroRandom;
			} else if (numeroRandom > maximo2) {
				maximo2 = numeroRandom;
			} else if (numeroRandom > maximo3) {
				maximo3 = numeroRandom;
			}

		}

		// MOSTRAR LOS 3 NUMEROS MAS ALTOS SELECCIONADOS AL AZAR
		System.out.println("Los tres números más altos son: " + maximo1 + " , " + maximo2 + " , " + maximo3);

		String a = "error";
		String b = "023";
		
		System.out.println("prueba de java: " + a + Integer.parseInt(b));
		
		
		
	}

}
