/**
 * <h2>Clase Principal, Gestor de Coches Hotwheels, únicamente utilizando
 * arrays</h2>
 * 
 * @author claudia rubio
 * @version 03-2022
 *
 */
public class GestorHotwheels {

	public static void main(String[] args) {
		// CONTROL DE UNA COLECCION DE MAX. COCHES DE HOTWHEELS

		/**
		 * Variable tipo int inOpcion, para almacenar una opción del menú principal
		 */
		int inOpcion = 0;

		/**
		 * Variable tipo boolean, para preguntar si desea añadir datos de prueba
		 * 
		 * <ul>
		 * <li>true: si desea añadir datos de prueba</li>
		 * <li>false: no desea añadir datos de prueba</li>
		 * </ul>
		 */
		boolean test = true;

		if (test) { // PARA AÑADIR LOS DATOS DE PRUEBA
			Acciones.ejemploInsert();
		}

		do {// MOSTRAR EL MENU MIENTRAS NO SE MARQUE LA OPCION 9 SALIR

			Menu.muestraMenu();// MUESTRA LAS OPCIONES DEL MENU

			do {
				while (!Util.sc.hasNextInt()) {// METODO DEL SCANNER SI LO ESPERADO NO ES UN ENTERO
					System.out.println("Teclee una opción del menú...");
					Util.sc.next();// LIMPIO EL SCANNER
				}
				inOpcion = Util.sc.nextInt(); // ATRAPA LA OPCION TECLEADA POR CONSOLA
			} while (inOpcion < 1 && inOpcion > 9);// SE REPITE MIENTRAS EL VALOR NO ESTE ENTRE 1 Y 9

			Menu.ejecutaOpcion(inOpcion);// METODO QUE EJECUTA LA OPCION MARCADA

		} while (inOpcion != 9); // SIGUE REPITIENDO EL BUCLE MIESTRAS NO SE PULSE 9 SALIR

	}
}