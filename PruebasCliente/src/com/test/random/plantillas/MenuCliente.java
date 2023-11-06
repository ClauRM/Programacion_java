package com.test.random.plantillas;

public class MenuCliente {

	/**
	 * Metodo para muestra las opciones del menu principal del programa
	 */
	public static void muestraMenu() {
		System.out.println("");
		System.out.println("-------- SUPERMARKET --------");
		System.out.println("Teclee opción del menú...");
		System.out.println("1. Añadir nuevo Cliente");
		System.out.println("2. Modificar Cliente");
		System.out.println("3. Eliminar Cliente");
		System.out.println("4. Listar datos de un cliente");
		System.out.println("5. Listar todos los clientes");
		System.out.println("6. Buscar un Ganador");
		System.out.println("7. Salir");
		System.out.println("-------------------------------");

	}

	/**
	 * Metodo que ejecuta una opcion del menu en funcion de la opcion tecleada como
	 * parametro
	 * 
	 * @param inOpcion Variable tipo int con la opcion del menu que se desea
	 *                 ejecutar
	 */
	public static void ejecutaOpcion(int inOpcion) {
		switch (inOpcion) {
		case 1:
			//UtilClientes.dimeCliente();
			UtilClientes.aniadeCliente(UtilClientes.dimeCliente(), -1); //objeto Cliente y posicion 0 porque es nuevo
			break;
		case 2:
			UtilClientes.modificaCliente();
			break;
		case 3:
			UtilClientes.eliminaCliente();
			break;
		case 4:
			UtilClientes.buscarCliente();
			break;
		case 5:
			UtilClientes.getObtenerClientes();
			break;
		case 6:
			UtilClientes.getGanador();
			break;
		case 7:
			System.out.println("--------- FIN ---------");
			break;
		default:
			System.out.println("« No existe esa opción en el menú »"); // ERROR SI TECLEA CUALQUIER OTRA OPCION
			break;
		}

	}

}
