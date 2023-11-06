import java.util.ArrayList;
import java.util.Collections;

public class Collections_Shuffle {

	public static void main(String[] args) {
		// Desordenar una lista de numeros

		ArrayList<Integer> datos = numerosAzar(5); // declarar arraylist con numero total
		System.out.println(datos.toString());

	}

	private static ArrayList<Integer> numerosAzar(int total) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		for (int i = 1; i <= total; i++) {
			numeros.add(i); // llenar el arraylist
		}

		Collections.shuffle(numeros);

		return numeros;
	}

}
