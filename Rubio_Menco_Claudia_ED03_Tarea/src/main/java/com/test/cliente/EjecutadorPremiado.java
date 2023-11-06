package com.test.cliente;
import java.util.ArrayList;

public class EjecutadorPremiado {

	public static void main(String[] args) {

		/**
		 * Variables tipo int con la fecha que sera premiada y una variable contador
		 * para verificar si hay o no ganadores. Se inicializa a cero, sin ganadores
		 */
		int diaWin = 25;
		int mesWin = 1;
		int anioWin = 2018;
		int ganador = 0;

		/**
		 * Creamos ArrayList alClientes para almacenar clientes de prueba
		 */
		ArrayList<Cliente> alClientes = new ArrayList<>();

		/**
		 * Instancia y objetos clientes para pruebas
		 */
		Cliente cliente1 = new Cliente("Mateo", "García", "Pérez", "mateogp@email.com", 25, 1, 2018);
		Cliente cliente2 = new Cliente("Victor", "García", "Pérez", "victorgp@email.com", 25, 1, 2018);
		Cliente cliente3 = new Cliente("Marcos", "Ruíz", "Mercado", "marcosgm@email.com", 12, 1, 2000);
		Cliente cliente4 = new Cliente("Karla", "Merlano", "Soria", "karlams@email.com", 14, 4, 1980);
		Cliente cliente5 = new Cliente("Maria", "Ponce", "Martinez", "mariapm@email.com", 1, 6, 1974);
		Cliente cliente6 = new Cliente("Pablo", "Moreno", "Osco", "pablomo@email.com", 27, 9, 1995);
		Cliente cliente7 = new Cliente("Jenn", "Palomo", "Rubio", "jennpru@email.com", 30, 10, 1991);
		Cliente cliente8 = new Cliente("Mario", "Bros", "Super", "mario@nintendo.com", 13, 9, 1985);

		/**
		 * Se aniaden clientes de prueba al ArrayList
		 */
		alClientes.add(cliente1);
		alClientes.add(cliente2);
		alClientes.add(cliente3);
		alClientes.add(cliente4);
		alClientes.add(cliente5);
		alClientes.add(cliente6);
		alClientes.add(cliente7);
		alClientes.add(cliente8);

		/**
		 * Bucle for para recorrer el ArrayList de Clientes y localizar o no un ganador
		 * Se incrementa la variable tipo int ganador si localiza uno dentro de la lista
		 */
		for (int i = 0; i < alClientes.size(); i++) {
			if (Cliente.calcularSiPremiado(alClientes.get(i), diaWin, mesWin, anioWin)) {
				System.out.println("¡Tenemos un ganador!");
				ganador++;
			}
		}

		/**
		 * Si no se localizan ganadores dentro de la lista, la variable tipo int ganador
		 * no se incrementa e imprime el mensaje indicando que no hay ganadores
		 */
		if (ganador == 0) {
			System.out.println("No hay ganadores...");
		}

	}

}
