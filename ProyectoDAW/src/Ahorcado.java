import java.util.Scanner;

public class Ahorcado {

	public static void main(String[] args) {
		// CLASICO JUEGO DEL AHORCADO

		String clave = "Conseguido";
		char[] claveArray = clave.toUpperCase().toCharArray(); // CONVIERTE STRING EN UN ARRAY DE VARIABLES TIPO CHAR MAYUS

		String oculto = "**********";
		char[] ocultoArray = oculto.toCharArray(); // CONVIERTE STRING EN UN ARRAY DE ASTERISCOS

		String letra;
		int vidas = 10;
		boolean ganar = false; // INICIALIZAR FALSE

		Scanner sc = new Scanner(System.in);

		System.out.println("<< HANGMAN GAME >>");
		System.out.println("Advivina la frase oculta: " + oculto);

		do {
			// SOLICITA UNA LETRA Y LA CONVIERTE A MAYUSCULA
			System.out.println("Dime una letra:");
			letra = sc.next().toString().toUpperCase();
			vidas--; // RESTA UNA VIDA

			// SI LA LETRA ESTA EN LA CADENA CLAVE SE REEMPLAZA EN LA CADENA OCULTA
			if (clave.toUpperCase().contains(letra)) {
				for (int i = 0; i < claveArray.length; i++) { // BUCLE FOR PARA RECORRER LA MATRIZ CLAVE
					if (claveArray[i] == letra.charAt(0)) {// SI LA LETRA ESTA EN LA POSICION i DE LA MATRIZ CLAVE
						ocultoArray[i] = letra.charAt(0);// SUSTITUYE EL * DE LA POSICION i POR LA LETRA
					}
				}
			// SI LA LETRA NO ESTA EN LA CADENA SOLO MUESTRA MENSAJE
			} else {
				System.out.println("Tu letra no vale pa'na");
			}
			
			System.out.println(String.valueOf(ocultoArray));// MUESTRA EL NUEVO RESULTADO DE LA MATRIZ OCULTA
			System.out.println("Te quedan " + vidas + " vidas");

			// SI OCULTO NO CONTIENE ASTERISCOS O NO QUEDAN VIDAS ENTRA EN EL IF
			if (String.valueOf(ocultoArray).contains("*") == false || vidas == 0) {
				if (String.valueOf(ocultoArray).contains("*") == false) {
					System.out.println("YOU'RE WIN!!");
					ganar = true; // PARA SALIR DEL BUCLE
				} else {
					System.out.println("YOU'RE LOSER!!");
					ganar = true; // PARA SALIR DEL BUCLE
				}
			}

		} while (!ganar);

		System.out.println("<< Fin >>");

	}

}
