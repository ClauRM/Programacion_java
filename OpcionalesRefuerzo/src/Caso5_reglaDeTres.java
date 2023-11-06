import java.util.Scanner;

public class Caso5_reglaDeTres {

	public static void main(String[] args) {
		/*
		 * Resuelve las reglas de tres pidiendo al usuario A y B:
		 * 
		 * Si A es el 100%, a cuánto % corresponde B y a cuánta cantidad corresponde B
		 */

		float valorA;
		float valorBporciento;
		float valorBvalor;
		int opcion;

		Scanner sc = new Scanner(System.in);

		// PREGUNTO VALOR A
		System.out.println("Indique el valor que corresponde al 100%");
		valorA = sc.nextFloat();

		// PREGUNTO QUE OPCION DESEA
		System.out.println("Opciones:" + " \n" + "1. Desea conocer cantidad?" + "\n" + "2. Desea conocer porcentaje?");
		opcion = sc.nextInt();

		// MENU PARA EJECUTAR SEGUN LA OPCION TECLEADA
		switch (opcion) {
		case 1:
			System.out.println("Indique el valor de B en tanto por ciento (%)");
			valorBporciento = sc.nextFloat();
			System.out.println("El valor de B correspondiente al " + valorBporciento + "%, es "
					+ ((valorA * valorBporciento) / 100));
			break;
		case 2:
			System.out.println("Indique el valor de B");
			valorBvalor = sc.nextFloat();
			System.out.println("El % de B es " + ((valorBvalor * 100) / valorA) + "%");
			break;
		default:
			System.out.println("Error en la opción. Fin del programa");
			break;
		}

	}

}
