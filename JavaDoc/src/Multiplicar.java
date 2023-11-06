
public class Multiplicar {
	/**
	 * Multiplica dos números con varios métodos
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		System.out.println(multiplica(3, 5));
		System.out.println(multiplica_int(3, 5));
		System.out.println(cuadrado(5));

	}

	/**
	 * Esta función multiplica dos números a través de la operación proporcionada
	 * por java
	 * 
	 * @param numero1, el primero número debe ser un entero
	 * @param numero2, el segundo número debe ser un entero
	 * @return el producto (multiplicación) que es un entero
	 */
	public static int multiplica(int numero1, int numero2) {
		return numero1 * numero2;
	}

	/**
	 * Esta función multiplica a través de la suma iterada del segundo parámetro el
	 * numero de veces introducido por el primer parámetro
	 * 
	 * @param numero1, debe ser un número entero
	 * @param numero2, debe ser un número entero
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
	 * Esta funcion realiza el cuadrado a través de la multiplicación de un número
	 * por sí mismo
	 * 
	 * @param numero1, debe ser un número entero
	 * @return el cuadrado, que es un numero entero
	 */
	public static int cuadrado(int numero1) {
		return multiplica(numero1, numero1);
	}

}
