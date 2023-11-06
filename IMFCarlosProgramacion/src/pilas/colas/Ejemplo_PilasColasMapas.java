package pilas.colas;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Ejemplo_PilasColasMapas {

	public static void main(String[] args) {
		// Ejercicios con Pila-Cola-Map

		// Crear pila
		Stack<Integer> pila = new Stack<Integer>();

		// Crear cola
		Queue<Integer> cola = new LinkedList<Integer>();

		// Crear map
		Map<Integer, Integer> mapa = new HashMap<Integer, Integer>();

		// Agregar datos a la pila
		System.out.println(pila.size() + " tamaño inicial de la pila");

		for (int i = 1; i <= 3; i++) {
			pila.push(i);
		}
		System.out.println("\n" + pila.size() + " tamaño de la pila tras añadir datos");// ver tamaño pila
		System.out.println(cola.size() + " tamaño inicial de la cola"); // ver tamaño cola

		// Pasar de pila a cola
		cola.offer(pila.pop());
		cola.offer(pila.pop());
		cola.offer(pila.pop());

		System.out.println("\n" + pila.size() + " pila.size Pasar de pila a cola");// ver tamaño pila
		System.out.println(cola.size() + " cola.size Pasar de pila a cola"); // ver tamaño cola

		// Pasar de cola a pila
		pila.push(cola.poll());
		pila.push(cola.poll());
		pila.push(cola.poll());

		System.out.println("\n" + pila.size() + " pila.size Pasar de cola a pila");// ver tamaño pila
		System.out.println(cola.size() + " cola.size Pasar de cola a pila"); // ver tamaño cola

		// Pasar de pila a map
		mapa.put(1, pila.pop());
		mapa.put(2, pila.pop());
		mapa.put(3, pila.pop());

		System.out.println("\n" + pila.size() + " pila.size Pasar de pila a map");// ver tamaño pila
		System.out.println(mapa.size() + " mapa.size Pasar de pila a map");

		// Pasar de map a cola
		for (int j = 1; j <= mapa.size(); j++) {
			cola.offer(mapa.get(j));
		}
		mapa.clear(); // borra todo

		System.out.println("\n" + mapa.size() + " mapa.size Pasar de map a cola");// ver tamaño pila
		System.out.println(cola.size() + " cola.size Pasar de map a cola");

		// Pasar de cola a map
		mapa.put(1, cola.poll());
		mapa.put(2, cola.poll());
		mapa.put(3, cola.poll());

		System.out.println("\n" + mapa.size() + " mapa.size Pasar de cola a map");// ver tamaño pila
		System.out.println(cola.size() + " cola.size Pasar de cola a map");

		// Pasar de map a pila
		for (int k = 1; k <= mapa.size(); k++) {
			pila.push(mapa.get(k));
		}
		mapa.clear(); // borra todo

		System.out.println("\n" + mapa.size() + " mapa.size Pasar de map a pila");// ver tamaño pila
		System.out.println(pila.size() + " pila.size Pasar de map a pila");

	}

}
