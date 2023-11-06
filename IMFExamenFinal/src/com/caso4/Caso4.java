package com.caso4;

import java.util.ArrayList;

import com.caso1caso2.Baraja;
import com.caso1caso2.Cartas;

public class Caso4 {

	public static void main(String[] args) {

		// Objeto Cartas(st nombre, st tipo, int numeroElemento, int orden, int valor)
		Cartas carta1 = new Cartas("as de espadas", "carta", 1, 1, 1);
		Cartas carta2 = new Cartas("sota de oros", "carta", 2, 3, 10);
		Cartas carta3 = new Cartas("as de bastos", "carta", 3, 2, 1);
		Cartas carta4 = new Cartas("4 de oros", "carta", 4, 4, 4);
		
		Baraja baraja;

		// Lista de cartas
		ArrayList<Cartas> alCartas = new ArrayList<>();

		// Agrego cartas a la lista
		alCartas.add(carta1);
		alCartas.add(carta2);
		alCartas.add(carta3);
		alCartas.add(carta4);

		baraja = new Baraja("española",alCartas);
		
		posicionPrimerAs(alCartas);
		paloOros(alCartas);
		
	}

// Caso 4: Indica posicion (int numeroElemento) del primer as
	private static void posicionPrimerAs(ArrayList<Cartas> alCartas) {
		int i = 0;
		boolean localizado = false;
		do {
			if (alCartas.get(i).getNombre().contains("as")) {
				System.out.println("El primer AS se encuentra en la posición: " + alCartas.get(i).getNumeroElemento());
				localizado = true;
			}
			i++;

		} while (!localizado && i < alCartas.size());

	}

	// Caso 4: Cuantas cartas del palo oros hay
	private static void paloOros(ArrayList<Cartas> alCartas) {
		int oros = 0;

		for (int i = 0; i < alCartas.size(); i++) {
			if (alCartas.get(i).getNombre().contains("oros")) {
				oros++;
			}
		}
		System.out.println("\nHay " + oros + " cartas del palo de oros");
	}

}
