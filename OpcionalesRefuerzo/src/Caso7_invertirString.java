import java.util.Scanner;

public class Caso7_invertirString {

	public static void main(String[] args) {
		// Caso 1: Pide una palabra e invierte su dirección. Por ejemplo "Hola" es
		// "aloH"

		String stPalabra;

		stPalabra = pidePalabra(); // ALMACENA LA FRASE DEL METODO PIDEFRASE

		inviertePalabra(stPalabra); // METODO QUE INVIERTE LA FRASE

	}

	public static String pidePalabra() { // METODO
		String palabra;

		Scanner sc = new Scanner(System.in);
		System.out.println("Dime una palabra");
		palabra = sc.next().toString();// ALMACENA LA FRASE INTRODUCIDA POR CONSOLA
		sc.nextLine();

		return palabra; // DEVUELVE EL VALOR EN EL METODO
	}

	public static void inviertePalabra(String palabra) { // METODO QUE RECIBE POR PARAMETRO LA FRASE
		char[] arPalabra; // DECLARAMOS ARRAY TIPO CHAR PARA ALMACENAR LA FRASE
		char[] arPalabraInvertida = null; // DECLARAMOS ARRAY PARA DEVOLVER EL RESULTADO
		arPalabra = palabra.toCharArray();// LLENAMOS EL ARRAY CON LA FRASE
		arPalabraInvertida = new char[arPalabra.length]; // DAMOS LA MISMA LONGITUD AL ARRAZ INVERTIDO
		int contador = 0;// CREAMOS CONTADOR PARA RELLENAR EL ARRAY INVERTIDO

		for (int i = arPalabra.length; i > 0; i--) { // RECORREMOS ALREVES EL ARRAY QUE TIENE LA FRASE
			arPalabraInvertida[contador] = arPalabra[i - 1]; // RELLENAMOS EL ARRAY INVERTIDO
			contador++;// SUMAMOS UNA POSICION AL ARRAY INVERTIDO
		}
		System.out.println("Al revés " + String.valueOf(arPalabraInvertida));

	}

}
