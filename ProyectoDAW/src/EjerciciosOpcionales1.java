import java.util.Scanner;

public class EjerciciosOpcionales1 {

	public static void main(String[] args) {
		// HOJA 1 - EJECICIOS BASICOS OPCIONALES

		/*
		 * Caso 1 Calcular el área de un triángulo en función de la base y la altura Los
		 * datos base y altura deben ser solicitados como entrada (variables). ÁREA =
		 * BASE * ALTURA / 2
		 */

		int base;
		int altura;

		Scanner sc = new Scanner(System.in);

		System.out.println("Caso 1: Calcular el área de un triángulo \n");

		System.out.println("Introduzca la base del triángulo en cm:");
		base = sc.nextInt();

		System.out.println("Introduzca la altura del triángulo en cm:");
		altura = sc.nextInt();

		System.out.println("El área del triángulo de " + base + "cm de base y " + altura + "cm de altura es = "
				+ ((base * altura) / 2) + "cm2");

		System.out.println("============================");

		/*
		 * Caso 2 Leer 2 números y visualizar el número mayor o la palabra “iguales” si
		 * son iguales.
		 */

		int numero1;
		int numero2;

		System.out.println("Caso 2: Indicar cuál es el mayor de dos números \n");

		System.out.println("Introduzca un número:");
		numero1 = sc.nextInt();

		System.out.println("Introduzca otro número:");
		numero2 = sc.nextInt();

		if (numero1 < numero2) {
			System.out.println(numero2 + " es mayor que " + numero1);

		} else if (numero1 > numero2) {
			System.out.println(numero1 + " es mayor que " + numero2);

		} else if (numero1 == numero2) {
			System.out.println(numero1 + " y " + numero2 + " son iguales");
		}

		System.out.println("============================");

		/*
		 * Caso 3 Escribir un algoritmo que permita introducir números por teclado hasta
		 * que la suma de todos ellos sea mayor que 30, hay que tener en cuenta que el
		 * primer número introducido ya puede ser mayor de 30.
		 */

		int numero3 = 0;
		int resultado = 0;

		System.out.println("Caso 3: Sumar números hasta que su resultado sea mayor de 30 \n");

		do {
			System.out.println("Escriba un número:");
			numero3 = sc.nextInt();
			resultado = resultado + numero3;
			System.out.println("Suma = " + resultado);
		} while (resultado <= 30);

		System.out.println("La suma de los números supera 30 = " + resultado);

		System.out.println("============================");

		/*
		 * Caso 4 Hacer un algoritmo que lea el nombre, apellido y la nota de un alumno.
		 * Se debe imprimir un mensaje del tipo: Pedro Pérez tiene un aprobado. Las
		 * notas posibles son: “suspenso”, “aprobado”, “notable” y “sobresaliente”. Los
		 * rangos de cada nota son libres.
		 */

		String nombre;
		String apellidos;
		double notanum;
		String notatex = null;
		boolean test = true;

		System.out.println("Caso 4: Imprimir mensaje con la nota de un alumno \n");

		System.out.println("Indique nombre del alumno:");
		sc.nextLine();
		nombre = sc.nextLine();

		System.out.println("Indique apellidos del alumno:");
		apellidos = sc.nextLine();

		System.out.println("Indique la nota en números de 0 al 10 del alumno:");
		notanum = sc.nextDouble();

		do {
			if (notanum < 0 || notanum > 10) {
				System.out.println("Error. Indique la nota en números de 0 al 10 del alumno:");
				notanum = sc.nextDouble();
			} else {
				test = false;
			}
		} while (test);

		if (notanum >= 0 && notanum < 5) {
			notatex = "SUSPENSO";
		} else if (notanum >= 5 && notanum < 7) {
			notatex = "APROBADO";
		} else if (notanum >= 7 && notanum < 9) {
			notatex = "NOTABLE";
		} else {
			notatex = "SOBRESALIENTE";
		}

		System.out.println("El alumno " + nombre + " " + apellidos + " tiene un " + notatex);

		System.out.println("============================");

		/*
		 * Caso 5 Solicita un día, un mes y un año de manera numérica. Muestra la fecha
		 * en modo texto: Para día=1, mes=2 y año=2020 debe mostrar “hoy es 1 de febrero
		 * de 2020
		 */

		int dia;
		int mesnum = 0;
		String mestext = null;
		int annus;

		System.out.println("Caso 5: Imprimir fecha en modo texto \n");

		System.out.println("Indique el día en formato numérico:");
		dia = sc.nextInt();

		System.out.println("Indique el mes en formato numérico:");
		mesnum = sc.nextInt();

		System.out.println("Indique el año en formato numérico:");
		annus = sc.nextInt();

		switch (mesnum) {
		case 1:
			mestext = "Enero";
			break;
		case 2:
			mestext = "Febrero";
			break;
		case 3:
			mestext = "Marzo";
			break;
		case 4:
			mestext = "Abril";
			break;
		case 5:
			mestext = "Mayo";
			break;
		case 6:
			mestext = "Junio";
			break;
		case 7:
			mestext = "Julio";
			break;
		case 8:
			mestext = "Agosto";
			break;
		case 9:
			mestext = "Septiembre";
			break;
		case 10:
			mestext = "Octubre";
			break;
		case 11:
			mestext = "Noviembre";
			break;
		case 12:
			mestext = "Diciembre";
			break;
		}

		System.out.println("Hoy es " + dia + " de " + mestext + " de " + annus);

	}

}
