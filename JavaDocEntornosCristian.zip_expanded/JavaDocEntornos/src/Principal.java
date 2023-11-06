
/**
 * Esta es la clase principal, donde se ejecutará todo el programa.
 * 
 * Es un código muy simple, simplemente para practicar el uso de la
 * documentación.
 * 
 * Usaramos las clases Personas y Operaciones para trabajar en él.
 * 
 * @author cristianfuertesantas
 * 
 * @see Personas
 * 
 * @see Operaciones
 */

public class Principal {

	public static void main(String[] args) {

		// Declaramos 2 objetos de la clase Personas, y los inicializamos

		Personas persona1 = new Personas("ana", 18);

		Personas persona2 = new Personas("pepe", 31);

		// Probamos los 2 métodos de la clase Operaciones con la persona número 1

		Operaciones.edadEsPar(persona1.getEdad());

		Operaciones.nombreEmpiezaPorA(persona1.getNombre());

		// Probamos los 2 métodos de la clase Operaciones con la persona número 2

		Operaciones.edadEsPar(persona2.getEdad());

		Operaciones.nombreEmpiezaPorA(persona2.getNombre());

	}

}
