
public class Multiplicar {
	/**
	 * Multiplica dos n�meros con varios m�todos
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println(multiplica(3, 5));
		System.out.println(multiplica_int(3, 5));
		System.out.println(cuadrado(5));

	}

	/**
	 * Esta funci�n multiplica dos n�meros a trav�s de la operaci�n proporcionada
	 * por java
	 * 
	 * @param numero1, el primero n�mero debe ser un entero
	 * @param numero2, el segundo n�mero debe ser un entero
	 * @return el producto (multiplicaci�n) que es un entero
	 */
	public static int multiplica(int numero1, int numero2) {
		return numero1 * numero2;
	}

	/**
	 * Esta funci�n multiplica a trav�s de la suma iterada del segundo par�metro el
	 * numero de veces introducido por el primer par�metro
	 * 
	 * @param numero1, debe ser un n�mero entero
	 * @param numero2, debe ser un n�mero entero
	 * @return el resultado de sumar reiteradamente un numero
	 */
	public static int multiplica_int(int numero1, int numero2) {
		int resultado = 0;

		for (int i = 0; i < numero2; i++) {
			resultado += numero1;
		}
		return resultado;
	}

	/**
	 * Esta funcion realiza el cuadrado a trav�s de la multiplicaci�n de un n�mero
	 * por s� mismo
	 * 
	 * @param numero1, debe ser un n�mero entero
	 * @return el cuadrado, que es un numero entero
	 */
	public static int cuadrado(int numero1) {
		return multiplica(numero1, numero1);
	}

}
