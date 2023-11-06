import java.util.Scanner;

public class Caso18 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea 30 notas de examen, podrán usarse decimales. Se
		 * debe comprobar que cada una de ellas está entre 0 y 10, si alguna no lo
		 * cumple se seguirá pidiendo hasta que sea correcta. Calcular la nota media,
		 * la más alta y la más baja e informar del resultado por pantalla.
		 */

		float nota;
		float suma = 0;
		float media = 0;
		float mayor = 0;
		float menor = 0;
		int cont = 1;
		int numAlumnos = 0;
		int notaMin = 0;
		int notaMax = 10;

		Scanner sc = new Scanner(System.in);

		System.out.println("Indique número de alumnos de la clase:");
		numAlumnos = sc.nextInt();

		System.out.println("Has seleccionado " + numAlumnos + " alumnos para hacer los cálculos.");
		// VALIDACION DEL NUMERO DE ALUMNOS

		do {
			System.out.println("Indique nota entre 0 y 10:");
			nota = sc.nextFloat();
			// COMPROBAMOS QUE LA NOTA ESTA ENTRE 0 Y 10
			if (nota >= notaMin && nota <= notaMax) {
				// CALCULAMOS NOTA MEDIA
				suma += nota;
				media = suma / cont;
				// cont == 1 PARA CONTROLAR PRIMERA VUELTA Y ASIGNAR VALOR A VARIABLES MENOR Y
				// MAYOR
				if (cont == 1) {
					mayor = nota;
					menor = nota;
				}
				// cont != 1 INICIAMOS VALIDACIONES DE VARIABLES MENOR Y MAYOR CON UN DATO
				// INICIAL A COMPARAR
				else {
					if (mayor < nota) {
						mayor = nota;
					}
					if (menor > nota) {
						menor = nota;
					}
				}
				cont++;// INCREMENTAMOS CONTADOR PARA LA SIGUIENTE INTERACION
			} else {
				System.out.println("ERROR nota fuera de rango: " + nota);
			}
		} while (cont <= numAlumnos);

		System.out.println("** Se han ingresado " + numAlumnos + " alumnos **");
		System.out.println("Nota media: " + media);
		System.out.println("Nota más alta: " + mayor);
		System.out.println("Nota más baja: " + menor);
	}

}