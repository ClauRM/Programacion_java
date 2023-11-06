package pilas.colas;

import java.util.LinkedList;
import java.util.Queue;

public class Colas {

	public static void main(String[] args) {
		// COLA: se a�aden desde la parte de atr�s o la parte final de la cola, sin
		// embargo la informaci�n se extrae desde el frente, es decir, los elementos que
		// se a�adieron primero ser�n los primeros en salir, esto se conoce como
		// estructura FIFO

		// el primero en entrar es el primero en salir

		Queue<Integer> cola = new LinkedList<Integer>();

		cola.offer(14);
		cola.offer(24);
		cola.offer(31);

		System.out.println(cola.size()); // tama�o

		System.out.println(cola.peek()); // muestra el primer valor a�adido, cola

		if (!cola.isEmpty()) { // si no esta vacia
			System.out.println(cola.poll()); // muestra y elimina el primer valor a�adido
		}

		System.out.println(cola.peek()); // muestra el primer valor de la cola despues de haber eliminado un registro

	}

}
