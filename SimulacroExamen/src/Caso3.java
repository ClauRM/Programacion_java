import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class Caso3 {

	public static void main(String[] args) {
		/**
		 * Pide su nombre al usuario. Controla si la primera letra está en mayúsculas.
		 * Controla si su nombre tiene más de 10 letras.
		 * 
		 * Controla si es un nombre compuesto o no (Carlos no es compuesto, José Ramón
		 * es compuesto)
		 * 
		 * ¿Cuántas vocales tiene su nombre?
		 */

		String nombre;
		char[] nombreArray;
		char[] vocales = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
		int contador = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Ingresa tu nombre:"); // pedir nombre
		nombre = sc.nextLine();

		// controlar 1 posicion mayuscula
		if (nombre.charAt(0) >= 65 && nombre.charAt(0) <= 90) { // mayúsculas entre 65 y 90 en ASCII
			System.out.println("Empieza por mayúscula");
		}

		// longitud + de 10 letras
		if (nombre.length() > 10) {
			System.out.println("Tiene más de 10 letras");
		}

		// tiene espacios?
		nombreArray = nombre.toCharArray();

		for (int i = 0; i < nombreArray.length; i++) {
			if (nombreArray[i] == 32) { // espacio ASCII = 32
				System.out.println("Es compuesto");
			}
		}

		// contar vocales

		for (int i = 0; i < nombreArray.length; i++) {
			for (int j = 0; j < vocales.length; j++) {
				if (nombreArray[i] == vocales[j]) {
					contador++;
				}
			}
		}

		System.out.println("Tiene " + contador + " vocales");
		contador = 0;
	}

}
