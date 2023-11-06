import java.util.Scanner;

public class ValidarNumero {

	public static void main(String[] args) {

		int[] numeros = { 1, 2, 3, 4 };
		String[] nombres = { "pepe", "lola", "lisa", "mario" };
		int numero;
		
		numero=pedirDatos("Introduce un número");
		

	}

	private static int pedirDatos(String mensaje) {
		String numero;
		Scanner lector = new Scanner(System.in);
		do {
			System.out.println(mensaje);
			numero = lector.nextLine();
		} while (!esNumero(numero));

		return Integer.parseInt(numero);

	}
	
	private static boolean esNumero(String dato) {
		
		return true;
	}

}
