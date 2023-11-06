
public class TablasMultiplicar {

	public static void main(String[] args) {
		// IMPRIME LAS TABLAS DE MULTIPLICAR

		// VARIABLE j SERA EL MULTIPLICANDO = TABLA
		// VARIABLE i SERA EL MULTIPLICADOR

		for (int j = 1; j <= 10; j++) {
			System.out.println("\n" + "TABLA DEL " + j);

			for (int i = 0; i <= 10; i++) {
				System.out.println(j + " x " + i + " = " + (j * i));

			}
		}

	}

}
