package com.usuario;

import com.logica.Administrador;
import com.logica.Juego;
import com.logica.Utilidad;

public class Menu {

	Juego juego = new Juego();
	Administrador administrador = new Administrador();
	Utilidad utilidad = new Utilidad();

	public void inicio() {
		System.out.println("\n---------------------------------------------");
		System.out.println("¿Deseas jugar o entrar como Administrador?");
		System.out.println("1. Jugar");
		System.out.println("2. Administrador");
		System.out.println("3. Salir\n");
		System.out.println("Indique una opción:");
	}

	public void pantallaJugador() {
		System.out.println("\n*************************************");
		System.out.println("** ¿CUANTO SABES DEL MUNDO MAGICO? **");
		System.out.println("*************************************\n");
	}

	public void pantallaAdministrador() {
		System.out.println("\n¿Qué acción desea realizar?");
		System.out.println("1. Buscar una pregunta");
		System.out.println("2. Insertar nueva pregunta");
		System.out.println("3. Modificar pregunta existente");
		System.out.println("4. Eliminar pregunta y sus respuestas\n");
		System.out.println("Indique una opción:");
	}

	public void opcionesBuscar() {
		System.out.println("\n¿Cómo localizar la pregunta?");
		System.out.println("1. Por su número de identificador");
		System.out.println("2. Por parte de su contenido");
		System.out.println("Indique opción:");
	}

	public void mostrarSeleccion(int opcion) {
		int accion = 0;

		switch (opcion) {
		case 1:
			pantallaJugador();
			juego.jugarTrivial();
			break;
		case 2:
			pantallaAdministrador();
			utilidad.validaOpcion(); // pregunta accion a ejecutar de la pantalla administrador
			accion = utilidad.sc.nextInt();
			administrador.accionAdministrador(accion);
			break;
		case 3:
			System.out.println("\nHa salido correctamente.");
			break;
		default:
			System.out.println("\nOpción incorrecta");
			break;
		}
	}
}
