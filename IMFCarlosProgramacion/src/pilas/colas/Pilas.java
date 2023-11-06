package pilas.colas;

import java.util.Stack;

public class Pilas {

	public static void main(String[] args) {
		// PILA DE PLATOS
		// secuencia de elementos del mismo tipo en la que el acceso a la misma se
		// realiza por un único lugar denominado cima

		// agregar valores sobre la cima (push)
		// extraer el elemento situado en la cima (pop)

		Stack<Integer> pila = new Stack<Integer>();

		pila.push(10);
		pila.push(23);
		pila.push(31);

		System.out.println(pila.size()); // tamaño

		System.out.println(pila.peek()); // muestra el ultimo valor añadido, cima

		if (!pila.empty()) { //la pila no esta vacia // pila.isEmpty
			System.out.println(pila.pop()); // muestra el ultimo valor y lo elimina
		}

		System.out.println(pila.peek()); // muestra el ultimo valor despues de eliminar un registro

	}

}
