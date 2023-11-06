
public class Caso17_v2 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que muestre por pantalla la secuencia: 135791113151719
		 * Primero de la secuencia Mi número de la suerte No soy supersticioso Último
		 * de la secuencia
		 */

		for (int i = 1; i < 20; i += 2) {
			if (i == 1) {
				System.out.print(i);
				System.out.print("  Mi número de la suerte");
				System.out.println("");
			} else if (i > 1 && i < 19) {
				System.out.println(i);
			} else if (i == 19) {
				System.out.print(i);
				System.out.print("  No soy supersticioso");
			}
		}
	}
}