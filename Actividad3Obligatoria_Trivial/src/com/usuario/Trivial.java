package com.usuario;

import com.logica.Utilidad;

public class Trivial {

	public static void main(String[] args) {

		int opcion;
		int salir = 3;
		
		Utilidad utilidad = new Utilidad();
		Menu menu = new Menu();

		do {
			menu.inicio();
			utilidad.validaOpcion();
			opcion = utilidad.sc.nextInt();
			menu.mostrarSeleccion(opcion);
		} while (opcion != salir);

	}

}
