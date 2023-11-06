package com.caso3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Caso3 {

	public static void main(String[] args) {

		Stack<Integer> pila = new Stack<Integer>();
		Queue<Integer> cola = new LinkedList<Integer>();
		int[] array = new int[3];

		int pilasize;
		int mayor = 0;
		int menor = 0;

		// Agregar 7 numeros consecutivos (incluir valores 500-600)
		pila.push(450);
		pila.push(475);
		pila.push(510);
		pila.push(595);
		pila.push(600);
		pila.push(525);
		pila.push(650);

		System.out.println("\nTamaño pila al inicio: " + pila.size()); // pruebas
		System.out.println("Tamaño cola al inicio: " + cola.size()); // pruebas

		pilasize = pila.size();

		// Pasar a una cola todos los numeros entre 500 y 600
		for (int i = 0; i < pilasize; i++) {
			if (pila.peek() >= 500 && pila.peek() <= 600) {
				cola.offer(pila.pop()); // si esta entre los valores lo agrega a la cola
			} else {
				pila.pop();
			}
		}

		System.out.println("\nTamaño pila al final: " + pila.size()); // pruebas
		System.out.println("Tamaño cola al final: " + cola.size()); // pruebas

		// Extrae los 3 primeros a un Array
		System.out.println("\nDatos en el Array:");
		for (int i = 0; i < 3; i++) {
			array[i] = cola.poll();
			System.out.println(array[i]); // pruebas
		}

		// Muestra el mayor y el menor de ellos
		if (array[0] > array[1] && array[0] > array[2]) {
			mayor = array[0];
		} else if (array[1] > array[0] && array[1] > array[2]) {
			mayor = array[1];
		} else {
			mayor = array[2];
		}

		if (array[0] < array[1] && array[0] < array[2]) {
			menor = array[0];
		} else if (array[1] < array[0] && array[1] < array[2]) {
			menor = array[1];
		} else {
			menor = array[2];
		}

		System.out.println("\nEl mayor es " + mayor);
		System.out.println("El menor es " + menor);
	}

}
