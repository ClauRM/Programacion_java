package com.logica;

import java.time.LocalDate;
import java.util.ArrayList;

import com.gestion.datos.fichero.GestorFichero;

public class Acciones {

	private static final String RUTA = "datos/fichero.txt"; // variable fija (final)
	private GestorFichero gestorFichero = new GestorFichero();// objeto fichero
	private ArrayList<Noticia> alNoticias = gestorFichero.leerNoticiasFichero(RUTA); // ArrayList con las noticias del
																						// fichero

	// METODO PARA ALMACENAR UNA NUEVA NOTICIA
	public void insertarNoticias() {
		Noticia noticia; // Objeto noticia
		LocalDate ldFecha; // Objeto LocalDate
		String stTitulo, stTexto, stAutor;
		// -------------------------------------
		ldFecha = Utilidades.dimeFecha();
		stTitulo = Utilidades.dimeDatoString("Indique Título de la noticia:");
		stTexto = Utilidades.dimeDatoString("Indique Texto de la noticia:");
		stAutor = Utilidades.dimeDatoString("Indique Autor de la noticia:");
		// -------------------------------------
		noticia = new Noticia(ldFecha, stTitulo, stTexto, stAutor); // Nuevo objeto noticia con parametros
		System.out.println(noticia.toString());// Mostrar la nueva noticia
		alNoticias.add(noticia);// aniade la noticia al ArrayList

		// preguntar si quiere guardar en fichero.txt
		preguntaGuardar(noticia);

	}

	// METODO PARA PREGUNTAR SI LO QUIERE GUARDAR PERMANENTEMENTE
	public void preguntaGuardar(Noticia noticia) {
		char chRespuesta;
		// realizar pregunta
		System.out.println("¿Desea guardar la noticia en fichero permanente? S/N");
		chRespuesta = Character.toUpperCase(Utilidades.sc.next().charAt(0)); // pasar carater a mayusculas
		// validar respuesta
		switch (chRespuesta) {
		case 'S':
			gestorFichero.guardarFichero(noticia.toStringFichero(), RUTA); // guarda la noticia como String en fichero
			break;
		case 'N':
			System.out.println("La noticia se perderá al salir");
			break;
		default:
			System.out.println("Debe teclear S o N");
			break;
		}
	}

	// BUSCAR NOTICIAS POR FECHA
	public boolean noticiasxFecha() {
		LocalDate ldFecha;
		boolean hayNoticia = false; // variable local para controlar si hay alguna noticia

		ldFecha = Utilidades.dimeFecha();

		for (int i = 0; i < alNoticias.size(); i++) { // recorre todo el ArrayList
			if (ldFecha.compareTo(alNoticias.get(i).getFecha()) == 0) { // metodo compareTo si la fecha coincide con la
																		// fecha de la posicion devuelve cero
				System.out.println("Hemos encontrado las siguiente/s Noticias con fecha: " + ldFecha);
				System.out.println(alNoticias.get(i).toString());// muestra el dato de la posicion
				hayNoticia = true;// hay noticia
			}
		}
		return hayNoticia;
	}

	// BUSCAR NOTICIAS POR FECHA, AUTOR O PALABRAS
	public void buscarNoticias(int opcion) {

		boolean hayNoticia = false;

		switch (opcion) {
		case 2:
			hayNoticia = noticiasxFecha();
			break;
		case 3:
			hayNoticia = dondeBuscar(opcion);
			break;
		case 4:
			hayNoticia = dondeBuscar(opcion);
			break;
		default:
			System.out.println("Error opción");
			break;
		}

		if (!hayNoticia) { // si al terminar la busqueda no hay noticia
			System.out.println("No se ha localizado ninguna noticia");// indica que no se han localizado
		}
	}

	// METODO CAMPO A BUSCAR
	private boolean dondeBuscar(int opcion) {

		boolean localizado = false;
		String datoBuscar;

		switch (opcion) {// dependiendo de la opcion busca en un campo o en otro
		case 3:
			datoBuscar = Utilidades.dimeDatoString("Indique Autor a buscar:");
			for (int i = 0; i < alNoticias.size(); i++) { // recorre todo el ArrayList

				if (alNoticias.get(i).getAutor().contains(datoBuscar)) { // contains, si la posicion contiene autor
					System.out.println("Hemos encontrado las siguiente/s Noticias del Autor: " + datoBuscar);
					System.out.println(alNoticias.get(i).toString());// muestra la noticia localizada
					localizado = true;// hay noticia
				}
			}
			break;
		case 4:
			datoBuscar = Utilidades.dimeDatoString("Indique palabras a buscar:");
			for (int i = 0; i < alNoticias.size(); i++) { // recorre todo el ArrayList

				if (alNoticias.get(i).getTexto().contains(datoBuscar)) { // contains, si la posicion contiene palabras
					System.out.println("Hemos encontrado las siguiente/s Noticias con las palabras: " + datoBuscar);
					System.out.println(alNoticias.get(i).toString());// muestra la noticia localizada
					localizado = true;// hay noticia
				}
			}
			break;
		default:
			System.out.println("Error opcion");
			break;
		}

		return localizado;
	}

	// METODO IMPRIME TODAS LAS NOTICIAS
	public void verNoticias() {
		for (int i = 0; i < alNoticias.size(); i++) {
			System.out.println(alNoticias.get(i).toString());
		}

	}

}
