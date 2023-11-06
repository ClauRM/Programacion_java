import java.util.ArrayList;

public class Metodos {

	public static void muestraMayores(ArrayList<Integer> notas, int mayorque) {
		int contador = 0;

		// RECORRE EL ARRAYLIST HASTA EL FINAL DE SU TAMAÑO E INCREMENTA UNA VARIABLE
		// CADA VEZ QUE ENCUENTRA UNA POSICION MAYOR QUE LA INDICADA POR PARAMETRO
		for (int i = 0; i < notas.size(); i++) {
			if (notas.get(i) >= mayorque) {
				contador++;
			}
		}

		// SI HAY ALGUNA MAYOR INDICA CUANTAS
		// SINO HAY, INDICA QUE NO HA LOCALIZADO NINGUNA
		if (contador > 0) {
			System.out.printf("Hay %d notas mayores que 5", contador);
		} else {
			System.out.println("No hay notas superiores a 5");
		}

	}
}
