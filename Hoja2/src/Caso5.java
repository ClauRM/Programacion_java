import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		/*
		 * Caso 5
		 * 
		 * En la siguiente tabla se muestra el número de camas de las habitaciones de
		 * una casa rural, además de la planta donde está ubicada cada una de ellas:
		 * 
		 * HABITACION CAMAS PLANTA 
		 * 1 azul 2 primera
		 *  2 roja 1 primera 
		 *  3 verde 3 segunda 
		 *  4 rosa 2 segunda 
		 *  5 gris 1 tercera
		 * 
		 * Escribir un programa, en lenguaje Java, que:
		 * 
		 * 1o) Muestre el listado de las habitaciones de la casa rural. 2o) Pida por
		 * teclado el número (dato entero) asociado a una habitación. 3o) Muestre por
		 * pantalla la planta y el número de camas de la habitación seleccionada.
		 * 
		 * Nota: Si el número introducido por el usuario, no está asociado a ninguna
		 * habitación, se mostrará el mensaje:
		 * "ERROR: <número> no está asociado a ninguna habitación.".
		 * 
		 * Ejemplo de ejecución:
		 * 
		 * Listado de habitaciones: 1. Azul2. Roja3. Verde4. Rosa5. Gris Introduzca
		 * número de habitación: 3La Verde tiene 3 cama/s y está en la segunda
		 * planta.
		 */

		int habitacion;

		Scanner sc = new Scanner(System.in);

		System.out.println("Listado de habitaciones:" + "\n" + "1. Azul" + "\n" + "2. Roja" + "\n" + "3. Verde" + "\n"
				+ "4. Rosa" + "\n" + "5. Gris" + "\n \n" + "Indique el número de la habitación:");
		habitacion = sc.nextInt();

		switch (habitacion) {
		case 1:
			System.out.println("La habitación Azul tiene 2 camas y está en la primera planta");
			break;
		case 2:
			System.out.println("La habitación Roja tiene 1 cama y está en la primera planta");
			break;
		case 3:
			System.out.println("La habitación Verde tiene 3 camas y está en la segunda planta");
			break;
		case 4:
			System.out.println("La habitación Rosa tiene 2 camas y está en la segunda planta");
			break;
		case 5:
			System.out.println("La habitación Gris tiene 1 cama y está en la tercera planta");
			break;
		default:
			System.out.println("ERROR: <" + habitacion + "> no está asociado a ninguna habitación");
		}
	}

}
