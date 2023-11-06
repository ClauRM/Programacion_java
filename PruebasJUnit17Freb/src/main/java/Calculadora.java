/**
 * 
 */

/**
 * @author Eduardo
 *
 */
public class Calculadora {

	/**
	 * 
	 */
	public Calculadora() {

	}

	public boolean aMayorB(int a, int b) {
		boolean salida = false;
		// si los son iguales el cliente me dice que error
		if (a != b) {
			if (a > b) {
				salida = true; // a > b
			} else {
				salida = false; // a < b
			}
		} else {
			throw new Error("Numeros iguales");
		}
		return salida;
	}


	
	public double dividir(double a, double b) {
		double resultado = 0;
		try {
			resultado = a/b;
		} catch(ArithmeticException ex) {
			ex.printStackTrace();
		}
		return resultado;
	}
}
