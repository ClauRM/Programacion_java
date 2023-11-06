
public class Caso6_validarEmail {

	public static void main(String[] args) {
		// Valida que se trata de una direcci�n de email. Detalles en clase.

		String email = "x@y.zz";

		validaEmail(email);
	}

	public static void validaEmail(String email) {
		// VALIDACIONES:

		// LONGITUD MINIMA 6 CARACTERES x@y.zz
		if (email.length() < 6) {
			System.out.println("ERROR. Longitud de email no v�lida");
		} else {
			System.out.println("Longitud v�lida");
		}
		// CONTIENE ARROBA @
		if (email.contains("@")) {
			System.out.println("Contiene @");
		} else {
			System.out.println("ERROR. No contiene @");
		}
		// @ DEBE ESTAR ENTRE POSICION 1 Y LONGITUD-5
		if (email.indexOf('@') < 1 || email.indexOf('@') > (email.length() - 5)) {
			System.out.println("ERROR. Posici�n de la @");
		} else {
			System.out.println("Posici�n @ correcta");
		}
		// DESPUES DE LA @ DEBE HABER UN .
		if (email.contains(".")) {
			if (email.indexOf('.') > email.indexOf('@')) {
				System.out.println("Contiene . y est� despu�s de la @");
			} else {
				System.out.println("ERROR. El . est� en posici�n incorrecta");
			}
		} else {
			System.out.println("ERROR. No contiene . despu�s de la @");
		}
		// EL . DEBE ESTAR EN POSICION .xx o .xxx
		if (email.indexOf(".") != (email.length() - 3) && email.indexOf(".") != (email.length() - 4)) {
			System.out.println("ERROR. Dominio debe tener formato .xx o .xxx");
		} else {
			System.out.println("Dominio correcto");
		}
		// EMPEZAR EN LETRA
		if (email.toUpperCase().charAt(0) < 65 || email.toUpperCase().charAt(0) > 90) {
			System.out.println("ERROR. Debe empezar por una letra");
		} else {
			System.out.println("Letra inicial correcta");
		}
		// TERMINAR EN LETRA
		if (email.toUpperCase().charAt(email.length()-1) < 65 || email.toUpperCase().charAt(email.length()-1) > 90) {
			System.out.println("ERROR. Debe terminar en letra");
		} else {
			System.out.println("Letra final correcta");
		}
	

	}

}
