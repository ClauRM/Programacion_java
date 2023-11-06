package pilas.colas;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {

	public static void main(String[] args) {
		// COLA: se añaden desde la parte de atrás o la parte final de la cola, sin
		// embargo la información se extrae desde el frente, es decir, los elementos que
		// se añadieron primero serán los primeros en salir, esto se conoce como
		// estructura FIFO

		// el primero en entrar es el primero en salir

		Queue<Integer> cola = new LinkedList<Integer>();

		cola.offer(14);
		cola.offer(24);
		cola.offer(31);

		System.out.println(cola.size()); // tamaño

		System.out.println(cola.peek()); // muestra el primer valor añadido, cola

		if (!cola.isEmpty()) { // si no esta vacia
			System.out.println(cola.poll()); // muestra y elimina el primer valor añadido
		}

		System.out.println(cola.peek()); // muestra el primer valor de la cola despues de haber eliminado un registro

	}

}
