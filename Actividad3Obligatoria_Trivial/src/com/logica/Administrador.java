package com.logica;

import java.util.ArrayList;
import com.conexion.ConexionBD;
import com.modelo.Pregunta;
import com.modelo.Respuestas;
import com.usuario.Menu;

public class Administrador {

	Utilidad utilidad = new Utilidad();
	ConexionBD conexion = new ConexionBD();

	private Pregunta pregunta = null;
	private Respuestas respuesta = null;

	private ArrayList<Respuestas> alRespuestas = null;

	public void accionAdministrador(int accion) {

		switch (accion) {
		case 1: // SELECT*FROM
			buscarPregunta();
			break;
		case 2: // INSERT
			insertarPregunta();
			break;
		case 3: // UPDATE
			modificarPregunta();
			break;
		case 4: // DELETE
			eliminarPregunta();
			break;
		default:
			System.out.println("Acción no válida");
			break;
		}
	}

	// LISTAR
	private ArrayList<Pregunta> muestraListado() {
		ArrayList<Pregunta> alPregunta = conexion.listarRegistros();

		for (int i = 0; i < alPregunta.size(); i++) {
			System.out.println((i + 1) + ". " + alPregunta.get(i).getPregunta());
		}
		return alPregunta;
	}

	// BUSCAR REGISTRO
	private void buscarPregunta() {
		// localizar una pregunta por su identificador y por parte de su contenido
		Menu menu = new Menu();
		int opcion, id;
		String dato;

		menu.opcionesBuscar();
		utilidad.validaOpcion();
		opcion = utilidad.sc.nextInt();// opcion del menu buscar
		utilidad.sc.nextLine(); // absorbe el intro despues de int

		switch (opcion) {
		case 1:
			System.out.println("\nIndique id de la pregunta:");
			utilidad.validaOpcion();
			id = utilidad.sc.nextInt();
			utilidad.sc.nextLine();
			// buscar todo el objeto pregunta en la BD correspondiente ese id
			pregunta = conexion.buscarRegistro(null, id, 1);
			break;

		case 2:
			System.out.println("\nIndique contenido de la pregunta:");
			dato = utilidad.sc.nextLine();
			pregunta = conexion.buscarRegistro(dato, 0, 2);
			break;
		default:
			System.out.println("\nOpción incorrecta");
			break;
		}

		if (pregunta.getPregunta() == null) {
			System.out.println("No se han localizado registros");
		} else {
			System.out.println("\nSe ha localizado el siguiente registro:");
			pregunta.mostrar();
		}
	}

	// INSERTAR REGISTRO
	private void insertarPregunta() {

		alRespuestas = new ArrayList<>();
		pregunta = new Pregunta();
		respuesta = new Respuestas();

		System.out.println("\nEscriba enunciado de la nueva pregunta:");
		pregunta.setPregunta(utilidad.sc.nextLine().trim()); // seteo atributo pregunta libre de espacios

		// Pregunto cual sera la respuesta correcta
		System.out.println("\nEscriba la respuesta correcta: ");
		respuesta.setRespuesta(utilidad.sc.nextLine().trim());
		respuesta.setCorrecta(1); // seteo atributo correcta = 1
		alRespuestas.add(respuesta);

		// Pregunto cuales seran las demas respuestas
		for (int i = 2; i < 5; i++) {
			respuesta = new Respuestas(); // creo nueva respuesta por cada vuelta
			System.out.println("\nEscriba la respuesta " + i + ":");
			respuesta.setRespuesta(utilidad.sc.nextLine().trim()); // seteo atributo respuesta libre de espacios
			respuesta.setCorrecta(0); // seteo atributo correcta = 0
			alRespuestas.add(respuesta);
		}

		pregunta.setRespuestas(alRespuestas); // aniado las respuestas a la pregunta
		conexion.insertarRegistros(pregunta); // inserto la nueva pregunta en la BD
	}

	// MODIFICAR REGISTRO
	private void modificarPregunta() {

		ArrayList<Pregunta> alPregunta = new ArrayList<>();
		pregunta = new Pregunta();
		respuesta = new Respuestas();
		alRespuestas = null;

		int posicion = 0;
		int id = 0;

		alPregunta = muestraListado();

		System.out.println("\n¿Cuál vas a modificar?");
		utilidad.validaOpcion();
		posicion = utilidad.sc.nextInt(); // posicion de la pantalla muestraListado
		utilidad.sc.nextLine(); // absorbe el intro despues de int

		// el id de la pregunta sera el que coincida con la posicion-1 del arrayList
		id = alPregunta.get(posicion - 1).getIdpregunta();

		// buscar todo el objeto pregunta en la BD correspondiente ese id
		pregunta = conexion.buscarRegistro(null, id, 1);

		// solicito la nueva pregunta que reemplaza la existente
		System.out.println("\nEscriba el enunciado modificado de la pregunta:");
		pregunta.setPregunta(utilidad.sc.nextLine().trim()); // seteo con el nuevo valor

		// arraylist de respuestas = al arraylist asociado a la pregunta traida de la BD
		alRespuestas = pregunta.getRespuestas();

		// Pregunto cual sera la respuesta correcta
		System.out.println("\nEscriba la respuesta correcta modificada: ");
		alRespuestas.get(0).setRespuesta(utilidad.sc.nextLine().trim());
		alRespuestas.get(0).setCorrecta(1); // seteo atributo correcta = 1

		// Pregunto cuales seran las demas respuestas
		for (int i = 2; i < 5; i++) {
			System.out.println("\nEscriba la respuesta " + i + " modificada:");
			alRespuestas.get(i - 1).setRespuesta(utilidad.sc.nextLine().trim()); // seteo atributo respuesta sin
																					// espacios
			alRespuestas.get(i - 1).setCorrecta(0); // seteo atributo correcta = 0
		}
		// pregunta.setRespuestas(alRespuestas); // aniado las respuestas a la pregunta

		conexion.modificarRegistros(pregunta); // modifico la pregunta en la BD
	}

	// BORRAR REGISTRO
	private void eliminarPregunta() {

		ArrayList<Pregunta> alPregunta = new ArrayList<>();
		int posicion, id;

		alPregunta = muestraListado();

		System.out.println("\n¿Qué pregunta quieres eliminar?");
		utilidad.validaOpcion();
		posicion = utilidad.sc.nextInt(); // posicion de la pantalla muestraListado
		utilidad.sc.nextLine(); // absorbe el intro despues de int

		// el id de la pregunta sera el que coincida con la posicion-1 del arrayList
		id = alPregunta.get(posicion - 1).getIdpregunta();

		// buscar todo el objeto pregunta en la BD correspondiente ese id
		pregunta = conexion.buscarRegistro(null, id, 1);

		conexion.eliminarRegistros(pregunta);

	}
}
