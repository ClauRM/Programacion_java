package com.usuario;

import com.logica.Acciones;

public class Menu {

	Acciones acciones = new Acciones();

	public void muestraMenu() {
		System.out.println("====== PERIODICO ONLINE ====== ");
		System.out.println("1. Insertar Noticia");
		System.out.println("2. Buscar Noticias por fecha");
		System.out.println("3. Buscar Noticias por autor");
		System.out.println("4. Buscar Noticias por palabras");
		System.out.println("5. Muestra Todas las noticias");
		System.out.println("6. Salir");
		System.out.println("==============================");
		System.out.println("Teclee una opción del menú:");
	}

	// SWITCH-CASE PARA EJECUTAR UNA ACCION EN FUNCION DE LA OPCION MARCADA
	public void ejecutaOpcion(int inOpcion) {
		switch (inOpcion) {
		case 1:
			acciones.insertarNoticias();
			break;
		case 2:
			acciones.buscarNoticias(2);
			break;
		case 3:
			acciones.buscarNoticias(3);
			break;
		case 4:
			acciones.buscarNoticias(4);
			break;
		case 5:
			acciones.verNoticias();
			break;
		case 6:
			System.out.println("Ha salido correctamente.");
			break;
		default:
			System.out.println("« No existe esa opción en el menú »"); // ERROR SI TECLEA CUALQUIER OTRA COSA
			break;
		}
	}

}
