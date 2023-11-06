import java.util.ArrayList;

public class Ejercicio1_ArrayList {

	public static void main(String[] args) {
		/*
		 * Ejercicio 1: Mediante métodos estáticos. Realiza una llamada desde una clase
		 * externa. Muestra cuántas notas mayores de 5 aparecen en un arrayList de
		 * números enteros. El método debe ser independiente del tamaño de la lista.
		 */

		ArrayList<Integer> notas = new ArrayList<Integer>();

		notas.add(10);
		notas.add(8);
		notas.add(6);
		notas.add(3);

		// METODO PARA MOSTRAR MAYORES
		// RECIBE UN ARRAYLIST Y LA NOTA MAXIMA POR PARAMETROS
		Metodos.muestraMayores(notas, 5);
	}

}
