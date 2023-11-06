import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		/*
		 * Caso 13 Realizar un programa en java que realice las siguientes acciones: ➢
		 * Pida el número de alumnos de una clase, debe comprobarse que la cifra está
		 * entre 5 (mínimo) y 30 (máximo). ➢ Pida tantas notas como alumnos hay en la
		 * clase, las notas son enteros entre 0 y 10 ➢ Informe por pantalla del número
		 * de aprobados (nota >=5) y suspensos (nota<5).
		 */

		int alumnos;
		int nota;
		int contador=0;
		int aprobados = 0;
		int suspensos = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique el número de alumnos (entre 5 y 30):");
		alumnos = sc.nextInt();
		sc.nextLine();

		while (alumnos < 5 || alumnos > 30) {
			System.out.println("Error. El número de alumnos debe estar entre 5 y 30. Indique el número de alumnos:");
			alumnos = sc.nextInt();
		}

		System.out.println("Indique las notas en números, valores 0 y 10:");

		do {
			System.out.println("Nota alumno: ");
			nota = sc.nextInt();
			contador++;

			if (nota >= 5) {
				aprobados++;
			} else {
				suspensos++;
			}
			
		} while (contador < alumnos);

		System.out.println("Hay " + aprobados + " aprobados y " + suspensos + " suspensos");

	}
}
