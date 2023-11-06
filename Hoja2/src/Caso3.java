import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que pida el mes en forma numérica (1 ..12) y devuelva
		 * el número de días que tiene ese mes. Para Febrero devolver 28.
		 */

		int mes;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el mes de forma numérica, entre 1 y 12:");
		mes = sc.nextInt();
	
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tiene 31 días");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Tiene 30 días");
			break;
		case 2:
			System.out.println("Tiene 28 días");
			break;
		default:
			System.out.println("Error. Fin!");
		}

	}
}
