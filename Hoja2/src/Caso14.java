import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa en java que calcule e imprima la suma de los múltiplos
		 * de 2 comprendidos entre dos valores a y b que pedirá por pantalla. No se
		 * debe permitir que se introduzcan valores negativos para a y b. Se deberá
		 * controlar que a < b. Si a > b se intercambiarán estos valores
		 */

		int inferior;
		int superior;
		int cambiar;
		int multiplo = 2;
		int num = 0;
		int resultado = 0;
		int suma = 0;

		Scanner sc = new Scanner(System.in);

		// SOLICITAR NUMEROS Y REPETIR SI SON NEGATIVOS
		do {
			System.out.println("Introduzca dos números enteros. No válidos valores negativos:");
			System.out.println("Primer número:");
			inferior = sc.nextInt();
			System.out.println("Segundo número:");
			superior = sc.nextInt();
		} while (inferior < 0 || superior < 0);

		// CAMBIAR SI LOS LIMITES SUPERIOR E INFERIOR ESTAN ALREVES
		if (inferior > superior) {
			cambiar = inferior;
			inferior = superior;
			superior = cambiar;
		}

		// BUSCA PRIMER NUMERO > INFERIOR QUE AL DIVIDIRLO POR MULTIPLO SEA 0
		do {
			resultado = multiplo * num;
			num++;
		} while (resultado < inferior);

		resultado = 0;

		// HALLADO EL NUMERO, MULTIPLIZARLO POR MULTIPLO Y SUMAR RESULTADOS
		for (int i = num - 1; resultado < superior; i++) {
			resultado = multiplo * i;
			suma += resultado;
		}

		System.out.println("La suma de los multiplos de " + multiplo + " comprendidos entre " + inferior + " y "
				+ superior + " es: " + (suma - resultado));
	

	}
}
