/**
 * <h2>Clase Menú, muestra y ejecuta una opción dentro del menú, según la opción
 * marcada por el usuario</h2>
 * 
 * Opciones
 * <ul>
 * <li></li> Añadir nuevo coche
 * <li></li> Modificar datos de coche existente
 * <li></li> Eliminar coche existente
 * <li></li> Buscar un coche por modelo, serie o año
 * <li></li> Listar todos los modelos de coches
 * <li></li> Listar todas las series de coches
 * <li></li> Listar coches por año de forma ordenada
 * <li></li> Listar todos los elementos de la colección
 * <li></li> Salir del programa
 * </ul>
 * 
 * @author claudia rubio
 * @version 03-2022
 *
 */
public class Menu {

	/**
	 * Método muestraMenu(), no recibe parámetros y muestra las opciones del
	 * programa.
	 */
	public static void muestraMenu() {
		System.out.println("");
		System.out.println("--------- COLECCION DE COCHES DE HOTWHEELS ---------");
		System.out.println("Teclee opción del menú...");
		System.out.println("1. Añadir coche");
		System.out.println("2. Modificar coche");
		System.out.println("3. Eliminar coche");
		System.out.println("4. Buscar coche");
		System.out.println("5. Listar por modelo");
		System.out.println("6. Listar por serie");
		System.out.println("7. Listado ordenado por año");
		System.out.println("8. Listar todos los datos de la colección");
		System.out.println("9. Salir");
		System.out.println("----------------------------------------------------");
		Acciones.muestraNumeroElementos();
		System.out.println("----------------------------------------------------");
	}

	/**
	 * Método ejecutaOpcion(), recibe variable tipo int como parámetro, y ejecuta
	 * una opción del menú
	 * 
	 * @param inOpcion, variable tipo int con la opción del menú
	 */
	public static void ejecutaOpcion(int inOpcion) {
		switch (inOpcion) {
		case 1:
			Acciones.opcion1Aniadir();
			break;
		case 2:
			Acciones.opcion2Modificar();
			break;
		case 3:
			Acciones.opcion3Eliminar();
			break;
		case 4:
			Acciones.opcion4BuscarCoche();
			break;
		case 5:
			Acciones.opcion5ListarModelos();
			break;
		case 6:
			Acciones.opcion6ListarSeries();
			break;
		case 7:
			Acciones.opcion7ListarAniosOrdenado();
			break;
		case 8:
			Acciones.opcion8MostrarTodo();
			break;
		case 9:
			System.out.println("Sayonara!");
			break;
		default:
			System.out.println("« No existe esa opción en el menú »"); // ERROR SI TECLEA CUALQUIER OTRA COSA
			break;
		}

	}

}
