import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		/*
		 * Pide un número entre 0 y 10 al usuario.
		 * Si no es válido debes volver a pedirlo.
		 * Muestra la tabla de multiplicar de ese número. Por ejemplo si se pone el 3
		 * debes imprimir por consola: 3*1=3;3*2=6;3*3=9; ... (resto de los casos) ...
		 * ;3*10=30;
		 */

		int numero;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Teclee un número entre 0 y 10:"); //PEDIR NUMERO
		numero=sc.nextInt();
		
		for (int i=0; i<=10; i++) {
			System.out.println(numero + " * " + i + " = "+ (i*numero));
		}
		
		
	}

}
