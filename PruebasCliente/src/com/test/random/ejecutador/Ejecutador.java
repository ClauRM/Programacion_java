package com.test.random.ejecutador;

import com.test.random.plantillas.*;

public class Ejecutador {

	public static void main(String[] args) {

		int inOpcion = 0;
		do {// SE REPITE EL MENU MIENTRAS NO SE MARQUE LA OPCION SALIR

			MenuCliente.muestraMenu();// MUESTRA LAS OPCIONES DEL MENU

			do {
				while (!UtilClientes.sc.hasNextInt()) {// METODO DEL SCANNER SI LO ESPERADO NO ES UN ENTERO
					System.out.println("Teclee una opción del menú...");
					UtilClientes.sc.next();// LIMPIO EL SCANNER
				}
				inOpcion = UtilClientes.sc.nextInt(); // ATRAPA LA OPCION TECLEADA POR CONSOLA
			} while (inOpcion < 1 && inOpcion > 7);// SE REPITE MIENTRAS EL VALOR NO ESTE ENTRE LAS OPCIONES DEL MENU

			MenuCliente.ejecutaOpcion(inOpcion);// METODO QUE EJECUTA LA OPCION MARCADA

		} while (inOpcion != 7); // SIGUE REPITIENDO EL BUCLE MIESTRAS NO SE PULSE SALIR

	}

}
