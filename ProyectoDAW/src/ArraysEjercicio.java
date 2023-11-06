import java.util.Arrays;
import java.util.Scanner;

public class ArraysEjercicio {

	public static void main(String[] args) {
		// crear el almacen de alumnos y notas
		String[] nombres;
		int[] notas;
		int numeroAlumnos = 0;
		int respuesta;
		int inicio, fin;

		Scanner lector = new Scanner(System.in);

		// pedir usuario los alumnos
		System.out.println("Dime el número de alumnos");
		numeroAlumnos = lector.nextInt();
		lector.nextLine();

		nombres = new String[numeroAlumnos];
		notas = new int[numeroAlumnos];

		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce el nombre del alumno " + i);
			nombres[i] = lector.nextLine();
		}

		System.out.println(Arrays.toString(nombres));

		// pedir las notas de cada alumno
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce la nota del alumno " + nombres[i]);
			notas[i] = lector.nextInt();
			lector.nextLine();
		}

		System.out.println(Arrays.toString(nombres));
		System.out.println(Arrays.toString(notas));

		// preguntar por la consulta

		do {
			System.out.println("1- mejor nota");
			System.out.println("2- la media");
			System.out.println("3- rango de notas");
			System.out.println("4- salir");
			respuesta = lector.nextInt();

			switch (respuesta) {
			case 1:
				
				break;
			case 2:

				break;
			case 3:
				System.out.println("Dime desde que nota");
				inicio=lector.nextInt();
				System.out.println("Dime hasta que nota");
				fin=lector.nextInt();
				
				break;

			default:
				System.out.println("Opción errónea");
				break;
			}

		} while (respuesta != 4);

	}

}
