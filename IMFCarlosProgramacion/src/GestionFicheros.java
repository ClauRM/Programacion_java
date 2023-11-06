import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFicheros {

	public static void main(String[] args) {
		// lecto-escritura en ficheros
		String cadena = "pepe";
		String[] alumnos = { "pepe", "lola", "luis" };
		ArrayList<String> listaAlumnos = new ArrayList<String>();

		listaAlumnos.add("maria");
		listaAlumnos.add("Gonzalo");

		escribirFichero("datos/listaAlumnos.txt", listaAlumnos);

		// escribirFichero("datos/alumnos.txt", alumnos);

		leerFichero("datos/listaAlumnos.txt");
		// escribirFichero("datos/datos.txt",cadena);
		// escribirFichero("datos/datos2.txt",cadena);
		// escribirFichero("lola");

	}

	// METODO PARA LEER Y VISUALIZAR EL CONTENIDO DE UN FICHERO
	// RECIBE RUTA COMO PARAMETRO
	private static void leerFichero(String ruta) {

		FileReader fichero = null;
		BufferedReader lector = null;

		try {
			fichero = new FileReader(ruta);// abre fichero
			lector = new BufferedReader(fichero);// lee fichero

			while (lector.readLine() != null) {
				System.out.println(lector.readLine());// lee linea fichero, se mete dentro de un bucle para leer todo el
														// fichero
			}

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error inesperado");
			e.printStackTrace();
		} finally {
			try {
				if (lector != null) {
					lector.close();
				}
				if (fichero != null) {
					fichero.close();
				}

			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();
			}

		}

	}

	// METODO PARA ALMACENAR UN ARRAYLIST DE STRING EN UN FICHERO
	private static void escribirFichero(String ruta, ArrayList<String> datos) {
		FileWriter guardar = null;

		try {
			guardar = new FileWriter(ruta, true);// true = append

			for (String dato : datos) {
				guardar.write(dato + (char) 13);
			}
			// for(int i=0;i<datos.length;i++) {}

		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Un error incontrolado");
		} finally {
			try {
				if (guardar != null) {
					guardar.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	// METODO PARA ALMACENAR UN ARRAY DE STRING EN UN FICHERO
	private static void escribirFichero(String ruta, String[] datos) {
		FileWriter guardar = null;

		try {
			guardar = new FileWriter(ruta, true);// true = append

			for (String dato : datos) {
				guardar.write(dato + (char) 13);
			}
			// for(int i=0;i<datos.length;i++) {}

		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Un error incontrolado");
		} finally {
			try {
				if (guardar != null) {
					guardar.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

	// METODO PARA ALMACENAR UN STRING EN UN FICHERO
	private static void escribirFichero(String ruta, String dato) {
		FileWriter guardar = null;

		try {
			guardar = new FileWriter(ruta, true);// true = append
			guardar.write(dato + (char) 13);

		} catch (IOException e) {

			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Un error incontrolado");
		} finally {
			try {
				if (guardar != null) {
					guardar.close();
				}
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}

}
