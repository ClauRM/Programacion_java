package com.usuario;

import com.logica.Utilidades;

public class GestionNoticias {

	public static void main(String[] args) {

		int inOpcion = 0;
		int salir = 6; // numero de la opcion salir del menu
		Menu menu = new Menu(); // objeto menu

		do {// MOSTRAR EL MENU MIENTRAS NO SE MARQUE LA OPCION SALIR
			menu.muestraMenu();// MUESTRA LAS OPCIONES DEL MENU
			do {
				while (!Utilidades.sc.hasNextInt()) {// METODO DEL SCANNER SI LO ESPERADO NO ES UN ENTERO
					System.out.println("Teclee una opción del menú...");
					Utilidades.sc.next();// LIMPIO EL SCANNER
				}
				inOpcion = Utilidades.sc.nextInt(); // ATRAPA LA OPCION TECLEADA POR CONSOLA
			} while (inOpcion < 1 && inOpcion > salir);// SE REPITE MIENTRAS NO SE TECLEE VALOR DEL MENU
			menu.ejecutaOpcion(inOpcion);// METODO QUE EJECUTA LA OPCION MARCADA
		} while (inOpcion != salir); // SIGUE REPITIENDO EL BUCLE MIESTRAS NO SE PULSE SALIR
	}

}
