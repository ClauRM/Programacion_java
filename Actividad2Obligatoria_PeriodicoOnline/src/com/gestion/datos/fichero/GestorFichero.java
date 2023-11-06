package com.gestion.datos.fichero;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.logica.Noticia;
import com.logica.Utilidades;

public class GestorFichero {

	private String ruta;

	public GestorFichero() {
		super();
	}

	public GestorFichero(String ruta) {
		this.ruta = ruta;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	@Override
	public String toString() {
		return "Fichero [ruta=" + ruta + "]";
	}

	// METODO PARA ALMACENAR UN STRING EN UN FICHERO
	public void guardarFichero(String dato, String ruta) {
		FileWriter fichero = null;

		try {
			fichero = new FileWriter(ruta, true);// true = agregar los datos al final del fichero
			fichero.write(dato + (char) 13);// escribe dato dentro del fichero y salto de linea
		} catch (IOException e) {
			System.out.println("Error de lectura/escritura");
			e.printStackTrace();// excepcion al escribir o leer un fichero
		} catch (Exception e) {
			System.out.println("Error incontrolado");// cualquier otra excepcion
			e.printStackTrace();
		} finally {// al finalizar, cerrar fichero
			try {
				if (fichero != null) {
					fichero.close();// si falla el codigo, siempre se cerrará el fichero, si ha sido abierto, para
									// no dejarlo bloqueado
				}
			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();// excepcion al escribir o leer un fichero
			}
		}
	}

	// METODO PARA LEER Y VISUALIZAR EL CONTENIDO DEL FICHERO NOTICIAS
	// DEVUELVE EL CONTENIDO DEL FICHERO EN UN ARRAYLIST
	public ArrayList<Noticia> leerNoticiasFichero(String ruta) {
		FileReader fichero = null;// solo permite abrir fichero en modo lectura
		BufferedReader lector = null;// para recorrerlo y leer a su contenido

		Noticia noticiaAux;// objeto noticia para almacenar una noticia
		ArrayList<Noticia> alNoticia = new ArrayList<>(); // ArrayList para almacenar todas las noticias

		String texto; // linea de texto
		String[] noticiaDeLaLinea; // array para separar la linea de texto por atributos

		try {
			fichero = new FileReader(ruta);// abre fichero
			lector = new BufferedReader(fichero);// lee fichero

			while ((texto = lector.readLine()) != null) { // mientras la linea no sea nula
				// leemos la linea que sera una Noticia con atributos separados por ;
				// separamos linea con metodo split por el separador ; y guardamos en array[]
				noticiaDeLaLinea = texto.split(";");
				// ----------------------------------------
				// cada posicion del array va a ser un atributo de Noticia
				// construimos el objeto noticia
				noticiaAux = new Noticia();
				noticiaAux.setFecha(Utilidades.formatearFecha(noticiaDeLaLinea[0]));
				noticiaAux.setTitular(noticiaDeLaLinea[1]);
				noticiaAux.setTexto(noticiaDeLaLinea[2]);
				noticiaAux.setAutor(noticiaDeLaLinea[3]);
				// ----------------------------------------
				// Añadimos el objeto Noticia al ArrayList de Noticias
				alNoticia.add(noticiaAux);
				// sigue ejecutando el bucle para leer todo el fichero y guardar noticias
			}

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero");
			e.printStackTrace(); // excepcion porque no encuentra el fichero a leer
		} catch (IOException e) {
			System.out.println("Error de lectura/escritura");
			e.printStackTrace(); // excepcion de lectura o escritura
		} catch (Exception e) {
			System.out.println("Error incontrolado");
			e.printStackTrace(); // excepcion general
		} finally {
			try {
				if (lector != null) { // si se ha leido, se cierra
					lector.close(); // accion potencialmente peligrosa, rodeada por try-catch
				}
				if (fichero != null) { // si se ha abierto, se cierra
					fichero.close(); // accion potencialmente peligrosa, rodeada por try-catch
				}

			} catch (IOException e) {
				System.out.println("Error al cerrar el fichero");
				e.printStackTrace();// excepcion de lectura o escritura
			}
		}

		return alNoticia; // retorna el arrayList con todas las noticias del fichero
	}

}
