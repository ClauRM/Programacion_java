package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import com.modelo.*;

public class ConexionBD {

	private final String URL = "jdbc:mysql://localhost/imf_actividadobligatoria3";
	private final String USUARIO = "root";
	private final String PASS = "";

	private Statement sentenciaSQL; // Sentencia SQL
	private ResultSet rs; // Objeto que almacena el resultado de ejecutar una Sentencia SQL

	private String sql = ""; // almacena la sentencia SQL

	Connection conexion = null;

	// ABRIR CONEXION A LA BD MYSQL
	private void establecerConexion() {
		conexion = null;// Objeto de la clase conexion
		try {
			// Posible error
			Class.forName("com.mysql.jdbc.Driver"); // Establecer el lenguaje para comunicarnos con la bd
			// Establecer una conexión con la URL de la base de datos
			conexion = DriverManager.getConnection(URL, USUARIO, PASS);
			//System.out.println("Hay conexión con la Base de Datos");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("El login es incorrecto o no hay conexión con la base de datos");
		} catch (Exception e) {
			System.out.println("ERROR CONEXION");
			e.printStackTrace();
		}
	}

	// CERRAR CONEXION A LA BD
	private void cerrarConexion(Connection conexion) {
		try {
			sentenciaSQL.close();
			conexion.close();
			//System.out.println("Se ha cerrado la conexión");
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexión");
			e.printStackTrace();
		}
	}

	// NUMERO TOTAL DE PREGUNTAS EXISTENTES EN LA BD COUNT(pregunta)
	public int totalPreguntas() {

		int totalPreguntas = 0;

		try {
			establecerConexion();
			// crear sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();
			// -------------------------------------------------------------
			// almaceno el resultado de la sql en un resulset (conjunto de registros)
			sql = "SELECT COUNT(idpregunta) FROM preguntas";// cuento numero de preguntas en la BD

			rs = sentenciaSQL.executeQuery(sql); // Ejecuta sentencia de tipo SELECT

			while (rs.next()) {
				totalPreguntas = rs.getInt("COUNT(idpregunta)");
				System.out.println(totalPreguntas); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion); // cerrar conexion
		}

		return totalPreguntas;
	}

	// DESORDENA LOS ID DE LAS PREGUNTAS EXISTENTES EN LA BD
	public ArrayList<Integer> ordenIDaleatorio() {

		ArrayList<Integer> idPreguntas = obtenerID();

		Collections.shuffle(idPreguntas);// desordenar arraylist

		return idPreguntas;
	}

	// OBTIENE LOS ID DE LAS PREGUNTAS ACTUALES DE LA BD
	private ArrayList<Integer> obtenerID() {
		ArrayList<Integer> idPreguntas = new ArrayList<Integer>();

		try {
			establecerConexion();
			sentenciaSQL = conexion.createStatement();

			// ejecuto sentencia para buscar todos los id
			sql = "SELECT idpregunta FROM preguntas";
			rs = sentenciaSQL.executeQuery(sql); // ejecuta la sentencia
			while (rs.next()) {
				idPreguntas.add(rs.getInt("idpregunta")); //
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion);
		}

		return idPreguntas;
	}

	// OBTIENE DE FORMA TEMPORAL PREGUNTAS Y RESPUESTAS NECESARIAS PARA JUGAR
	public ArrayList<Pregunta> obtenerPreguntas(int numPreguntas) {

		ArrayList<Integer> idPreguntasAzar = ordenIDaleatorio(); // trae los ids de preguntas en orden aleatorio

		Pregunta preguntaAux; // Objeto de la clase pregunta
		Respuestas respuestasAux; // Objeto de la clase respuestas

		// ArrayList para almacenar preguntas y las respuestas asociadas, para tener la
		// conexion a BD abierta durante el juego
		ArrayList<Respuestas> alRespuestas;
		ArrayList<Pregunta> alPreguntas = new ArrayList<>();

		String ids = ""; // almacenar los id aleatorios en String separados por , y utilizarlo para
							// realizar consulta sql

		try {
			establecerConexion();
			sentenciaSQL = conexion.createStatement();

			for (int i = 0; i < numPreguntas; i++) {
				ids += idPreguntasAzar.get(i) + ","; // se incrementa y concatena
			}
			// luego con subsString quitar la ultima coma
			ids = ids.substring(0, ids.length() - 1); // de 0 a length - 1

			// sentencia para buscar las preguntas
			sql = "SELECT * FROM preguntas WHERE idpregunta IN (" + ids + ")";
			rs = sentenciaSQL.executeQuery(sql); // ejecuta la sentencia SQL
			while (rs.next()) {
				// creo objeto pregunta por cada linea
				preguntaAux = new Pregunta(); // Objeto de la clase pregunta
				// seteo las propiedades de la pregunta
				preguntaAux.setIdpregunta(rs.getInt("idpregunta"));
				preguntaAux.setPregunta(rs.getString("pregunta"));
				// Añado el objeto pregunta al ArrayList de Preguntas
				alPreguntas.add(preguntaAux);
			}
			// sigue ejecutando el bucle para leer todo el resultado de la consulta y
			// almacenarlas en arraylist temporal

			for (int i = 0; i < alPreguntas.size(); i++) { // recorre el arraylist de preguntas
				// sentencia para buscar las respuestas asociadas
				sql = "SELECT * FROM respuestas WHERE fidpregunta=" + alPreguntas.get(i).getIdpregunta();
				rs = sentenciaSQL.executeQuery(sql); // ejecuta la sentencia SQL
				// creo un nuevo arraylist de respuestas por cada vuelta del for
				alRespuestas = new ArrayList<>();
				while (rs.next()) {
					// creo un nuevo objeto por cada linea
					respuestasAux = new Respuestas();
					// seteo las propiedades del objeto respuesta
					respuestasAux.setIdrespuesta(rs.getInt("idrespuesta"));
					respuestasAux.setFidpregunta(rs.getInt("fidpregunta"));
					respuestasAux.setRespuesta(rs.getString("respuesta"));
					respuestasAux.setCorrecta(rs.getInt("correcta"));
					// aniado el objeto respuestasAux al ArrayList de Respuestas
					alRespuestas.add(respuestasAux);
				}
				alPreguntas.get(i).setRespuestas(alRespuestas); // seteo la propiedad ArrayList de respuestas

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion);
		}
		return alPreguntas; // arraylist con las preguntas para jugar
	}

	// INSERTAR PREGUNTAS Y RESPUESTAS EN LA BD
	// recibe un objeto pregunta con el arraylist de respuestas
	public void insertarRegistros(Pregunta pregunta) {
		// rellenar con sentencia, no hace falta poner la id porque es autonumerico
		int resultado, resultado2 = 0;

		String sql2 = "";

		try {
			establecerConexion();
			// crear sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// escribir la sentencia para insertar la pregunta
			sql = "INSERT INTO preguntas (pregunta) VALUES ('" + pregunta.getPregunta() + "');";
			// ejecutar la sentencia de insercion
			resultado = sentenciaSQL.executeUpdate(sql);

			// recorrer el arraylist de respuestas para insertarlas en la BD
			for (int i = 0; i < pregunta.getRespuestas().size(); i++) {
				// escribir la sentencia de insercion
				sql2 = "INSERT INTO respuestas (fidpregunta, respuesta, correcta) VALUES  ((select idpregunta from preguntas where pregunta = '"
						+ pregunta.getPregunta() + "'),  '" + pregunta.getRespuestas().get(i).getRespuesta() + "',"
						+ pregunta.getRespuestas().get(i).getCorrecta() + ");";
				// ejecutar la sentencia de insercion
				resultado2 = sentenciaSQL.executeUpdate(sql2);
			}

			if (resultado >= 1 && resultado2 >= 1) { // se ha insertado correctamente
				System.out.println("Se han insertado registros correctamente.");
			}
		} catch (SQLException e) {
			System.out.println("Error al crear sentencia en la conexion a la BD");
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion);
		}
	}

	// MODIFICAR PREGUNTAS Y RESPUESTAS EN LA BD
	// recibe el objeto pregunta con los datos a modificar
	public void modificarRegistros(Pregunta pregunta) {
		int resultado, resultado2 = 0;

		String sql2 = "";

		try {
			establecerConexion();
			// crear sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// escribir la sentencia para modificar la pregunta
			sql = "UPDATE preguntas SET pregunta='" + pregunta.getPregunta() + "' WHERE idpregunta="
					+ pregunta.getIdpregunta();
			// ejecutar la sentencia de modificacion
			resultado = sentenciaSQL.executeUpdate(sql);

			// recorro arraylist de respuestas para modificarlas en la BD
			for (int i = 0; i < pregunta.getRespuestas().size(); i++) {
				// sentencia de modificacion
				sql2 = "UPDATE respuestas SET respuesta='" + pregunta.getRespuestas().get(i).getRespuesta()
						+ "',correcta=" + pregunta.getRespuestas().get(i).getCorrecta() + " WHERE idrespuesta ="
						+ pregunta.getRespuestas().get(i).getIdrespuesta();
				// ejecutar la sentencia de modificacion
				resultado2 = sentenciaSQL.executeUpdate(sql2);
			}

			if (resultado >= 1 && resultado2 >= 1) { // se ha modificado correctamente
				System.out.println("Se han modificado registros correctamente.");
			}
		} catch (SQLException e) {
			System.out.println("Error al crear sentencia en la conexion a la BD");
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion);
		}

	}

	// ELIMINAR PREGUNTAS Y RESPUESTAS EN CASCADA EN LA BD
	// recibe un objeto pregunta
	public void eliminarRegistros(Pregunta pregunta) {
		int resultado = 0;

		try {
			establecerConexion();
			// crear sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();

			// escribir la sentencia para eliminar la pregunta
			sql = "DELETE FROM preguntas WHERE idpregunta=" + pregunta.getIdpregunta();
			// ejecutar la sentencia de eliminacion en cascada
			resultado = sentenciaSQL.executeUpdate(sql);

			if (resultado >= 1) { // se ha eliminado correctamente
				System.out.println("Se han eliminado registros correctamente.");
			}
		} catch (

		SQLException e) {
			System.out.println("Error al crear sentencia en la conexion a la BD");
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion);
		}
	}

	// BUSCAR UNA PREGUNTA POR TEXTO O ID EN BD
	// recibe un dato String, un id y una opcion a evaluar
	// retorna un objeto Pregunta con todos sus parmetros
	public Pregunta buscarRegistro(String dato, int id, int opcion) {

		Pregunta preguntaAux = new Pregunta(); // Objeto de la clase pregunta
		Respuestas respuestasAux = null; // Objeto de la clase respuestas

		ArrayList<Respuestas> alRespuestas = new ArrayList<>();// ArrayList para almacenar las respuestas asociadas

		try {
			establecerConexion();

			sentenciaSQL = conexion.createStatement();

			// evalua opcion de busqueda, por id 1, por texto 2
			switch (opcion) {
			case 1:
				// sentencia para buscar la pregunta por id
				sql = "SELECT * FROM preguntas WHERE idpregunta =" + id;
				rs = sentenciaSQL.executeQuery(sql); // ejecuta la sentencia SQL
				while (rs.next()) {
					// seteo las propiedades de la pregunta
					preguntaAux.setIdpregunta(rs.getInt("idpregunta"));
					preguntaAux.setPregunta(rs.getString("pregunta"));
				}
				break;
			case 2:
				// sentencia para buscar la pregunta por texto
				sql = "SELECT * FROM preguntas WHERE pregunta LIKE '%" + dato + "%'";
				rs = sentenciaSQL.executeQuery(sql); // ejecuta la sentencia SQL
				while (rs.next()) {
					// seteo las propiedades de la pregunta
					preguntaAux.setIdpregunta(rs.getInt("idpregunta"));
					preguntaAux.setPregunta(rs.getString("pregunta"));
				}
				break;
			default:
				System.out.println("Opción incorrecta");
				break;
			}

			// sentencia para buscar las respuestas asociadas
			sql = "SELECT * FROM respuestas WHERE fidpregunta=" + preguntaAux.getIdpregunta();
			rs = sentenciaSQL.executeQuery(sql); // ejecuta la sentencia SQL

			while (rs.next()) {
				respuestasAux = new Respuestas();
				// seteo las propiedades del objeto respuesta
				respuestasAux.setIdrespuesta(rs.getInt("idrespuesta"));
				respuestasAux.setFidpregunta(rs.getInt("fidpregunta"));
				respuestasAux.setRespuesta(rs.getString("respuesta"));
				respuestasAux.setCorrecta(rs.getInt("correcta"));
				// aniado el objeto respuestasAux al ArrayList de Respuestas
				alRespuestas.add(respuestasAux);

				preguntaAux.setRespuestas(alRespuestas); // seteo la propiedad ArrayList de respuestas

			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion);
		}
		return preguntaAux;

	}

	// LISTA DE PREGUNTAS DE LA BD CON SUS ID
	// retorna un ArrayList de preguntas
	public ArrayList<Pregunta> listarRegistros() {

		Pregunta pregunta;
		ArrayList<Pregunta> alPreguntas = new ArrayList<>();

		try {
			establecerConexion();
			// crear sentencias ejecutables sobre esa conexión
			sentenciaSQL = conexion.createStatement();
			// consulta para buscar todos los registros
			sql = "SELECT * FROM preguntas";

			rs = sentenciaSQL.executeQuery(sql); // Ejecuta sentencia de tipo SELECT

			while (rs.next()) {// leer todas los registros
				pregunta = new Pregunta(); // nuevo objeto pregunta por cada linea
				pregunta.setIdpregunta(rs.getInt("idpregunta"));
				pregunta.setPregunta(rs.getString("pregunta"));
				alPreguntas.add(pregunta); // aniade el objeto pregunta al arraylist
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			cerrarConexion(conexion); // cerrar conexion
		}
		return alPreguntas; // retorna arraylist
	}

}
