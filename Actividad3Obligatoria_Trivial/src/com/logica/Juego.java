package com.logica;

import java.util.ArrayList;
import com.conexion.ConexionBD;
import com.modelo.Pregunta;

public class Juego {

	private int numPreguntas = 3; // numero de preguntas aleatorias para el juego

	ConexionBD conexion = new ConexionBD();
	Utilidad utilidad = new Utilidad();

	// muestra bloque de preguntas, una a una, de forma aleatoria
	public void jugarTrivial() {

		ArrayList<Pregunta> alPreguntas = conexion.obtenerPreguntas(numPreguntas);

		int respuestaUser;
		int aciertos = 0;
		int fallos = 0;

		for (int i = 0; i < alPreguntas.size(); i++) {
			alPreguntas.get(i).mostrar(); // pregunta
			respuestaUser = dimeRespuesta(); // indique su respuesta
			// evaluo si la respuesta esta dentro de las opciones
			if (respuestaUser >= 1 && respuestaUser <= 4) {
				// reviso si la posicion respuestaUser-1 tiene indicador 1 como correcta
				if (alPreguntas.get(i).getRespuestas().get(respuestaUser - 1).getCorrecta() == 1) {
					System.out.println("Muy bien!");
					aciertos++;
				} else {
					System.out.println("Has fallado");
					fallos++;
				}
			} else {
				// si la respuesta no esta dentro de las opciones
				System.out.println("No has dado ni de cerca");
				fallos++;
			}
		}
		System.out.println("\n------------------------------------");
		System.out.println("Fallos: " + fallos);
		System.out.println("Aciertos: " + aciertos);
		System.out.println("------------------------------------");

		if (aciertos >= 2) {
			System.out.println("\nBUENA PARTIDA!!\nRealmente eres un Muggle?");
		} else {
			System.out.println("\nmmm... En fin, otra vez será");
		}
	}

	// pregunta al usuario cual es su respuesta
	private int dimeRespuesta() {
		int respuesta = 0;

		System.out.println("Indica el número de la respuesta:");
		utilidad.validaOpcion();
		respuesta = utilidad.sc.nextInt();

		return respuesta;
	}

}
