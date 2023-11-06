
/**
 * 
 * Esta es la clase donde se harán todas las operaciones del programa.
 * 
 * Contiene métodos que serán llamados desde la clase Principal.
 * 
 * @author cristianfuertesantas
 * 
 * @see Principal
 *
 */

public class Operaciones {

	/**
	 * Este método recibe por parámetro un número.
	 * 
	 * Imprime por consola si es par o no es par.
	 * 
	 * Además, devuelve un booleano, el cual dirá true si es par, y false si es
	 * impar.
	 * 
	 * @param numerointroducido 
	 * 
	 * @return par
	 */
	public static boolean edadEsPar(int numerointroducido) {

		boolean par = false;

		if (numerointroducido % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("No es par");
		}

		return par;

	}

	/**
	 * 
	 * Este método recibe por parámetro un String.
	 * 
	 * Si la primera letra es "a", imprime por pantalla "La primera letra es 'a'".
	 * 
	 * Si la primera letra no es "a", imprime por pantalla, "Sigue buscando, por
	 * favor".
	 * 
	 * @param nombreintroducido
	 */
	public static void nombreEmpiezaPorA(String nombreintroducido) {

		if (nombreintroducido.charAt(0) == 'a') {
			System.out.println("La primera letra es 'a'");
		} else {
			System.out.println("Sigue buscando, por favor");
		}

	}

}
