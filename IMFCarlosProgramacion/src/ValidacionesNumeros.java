public class ValidacionesNumeros {

	public static String limpiar(String cadena) {

		return cadena.trim();

	}

	public static boolean esNumero(String cadena) {
		// " 123,345 "

		boolean valido = true;
		int i = 0;

		if (cadena.length() == 0) {
			valido = false;
		} else {
			do {
				if ((int) cadena.charAt(i) < 48 || (int) cadena.charAt(i) > 57) {
					valido = false;
				}
				i++;
			} while (i < cadena.length() && valido);
		}

		return valido;
	}

	public static boolean esNumeroOtro(String cadena) {
		// " 123,345 "

		boolean valido = true;
		String numeros = "0123456789";
		int i = 0;

		if (cadena.length() == 0) {
			valido = false;
		} else {
			do {
				if (numeros.indexOf(cadena.charAt(i)) == -1) {
					valido = false;
				}
				i++;
			} while (i < cadena.length() && valido);
		}

		return valido;
	}

	public static boolean esNumeroArray(String cadena) {
		// " 123,345 "

		boolean valido = true;
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int i = 0;

		if (cadena.length() == 0) {
			valido = false;
		} else {
			do {
				// if()==-1) {
				valido = false;
				// }
				i++;
			} while (i < cadena.length() && valido);
		}

		return valido;
	}

}
