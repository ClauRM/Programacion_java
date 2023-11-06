import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		/*
		 * Caso 4: Pide un texto y controla si es palíndromo (palabra o expresión que es
		 * igual si se lee de izquierda a derecha que de derecha a izquierda). Por
		 * ejemplo: "RECONOCER" o "AMOR A ROMA"
		 */

		String texto;
		char[] textoArray;
		int contador;
		String comparador = "";

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa un texto:"); // pedir texto
		texto = sc.nextLine();

		textoArray = texto.toCharArray(); // convertir texto en array de variables tipo char

		contador = textoArray.length - 1;// cogemos la longitud del texto para tratarlo como un indice
		for (int i = 0; i < textoArray.length; i++) {
			if (textoArray[i] == textoArray[contador]) {// compara la primera letra con la última del texto
				comparador += String.valueOf(textoArray[i]);// si son iguales los guardamos en comparador
			}
			contador--;// decrementamos la variable contador para recorrer el texto en reversa
		}

		if (texto.equalsIgnoreCase(comparador)) {// si el texto es igual a lo almacenado en comparador son palíndromos
			System.out.println("Palíndromos");
		} else {
			System.out.println("No son palíndromos");
		}
		//
	}

}
