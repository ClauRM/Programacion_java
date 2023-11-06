package com.caso1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilasColas {

	public static void main(String[] args) {
		// Caso 1. Hay 10 números desordenados en una pila. Insértalos ordenados de
		// mayor a menor en una cola.

		Stack<Integer> pila = new Stack<Integer>(); // declaracion de la pila
		Queue<Integer> cola = new LinkedList<Integer>(); // declaracion de la cola

		int[] arrayAux = new int[10]; // declaro array auxiliar

		int numeroAux, numeroAuxMayor, sizePila;

		// añadimos numeros desordenados
		pila.push(8);
		pila.push(10);
		pila.push(1);
		pila.push(3);
		pila.push(6);
		pila.push(2);
		pila.push(9);
		pila.push(5);
		pila.push(7);
		pila.push(4);

		System.out.println(pila.size()); // ver el tamaño de la pila
		sizePila = pila.size(); // almaceno el tamaño en una variable porque al eliminar registros, el tamaño va
								// disminuyendo

		// saco los elementos de la pila y los almaceno en un array auxiliar
		for (int i = 0; i < sizePila; i++) { // recorrer la pila
			numeroAux = pila.pop(); // pila.pop() sacar
			arrayAux[i] = numeroAux; // almaceno el numero en la posicion i del array
		}

		System.out.println(Arrays.toString(arrayAux)); // visualiza el array con los elementos que estaban en la pila

		// metodo de la burbuja para ordenar el array
		for (int i = 0; i < arrayAux.length; i++) {

			for (int j = 0; j < (arrayAux.length - 1); j++) { // comparo un valor contra todas las posiciones

				if (arrayAux[j] > arrayAux[j + 1]) { // si una posicion es mayor a la siguiente, se cambian de orden
					// almaceno valores en variables auxiliares
					numeroAuxMayor = arrayAux[j];
					numeroAux = arrayAux[j + 1];
					// intercambio valores para pasar el mayor al fondo
					arrayAux[j] = numeroAux;
					arrayAux[j + 1] = numeroAuxMayor;
				}
			}
		}

		System.out.println(Arrays.toString(arrayAux)); // visualizo el array ordenado

		// lleno la cola con los valores del array, recorriendo de mayor a menor
		for (int i = (arrayAux.length - 1); i >= 0; i--) {
			cola.offer(arrayAux[i]);
		}

		System.out.println(cola.toString()); // conseguido!!

	}

}
