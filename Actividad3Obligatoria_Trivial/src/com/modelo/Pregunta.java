package com.modelo;

import java.util.ArrayList;
import java.util.Collections;

public class Pregunta {

	private int idpregunta;
	private String pregunta;
	private ArrayList<Respuestas> respuestas = new ArrayList<>();

	public Pregunta() {
		super();
	}

	public Pregunta(int idpregunta, String pregunta, ArrayList<Respuestas> respuestas) {
		super();
		this.idpregunta = idpregunta;
		this.pregunta = pregunta;
		this.respuestas = respuestas;
	}

	public int getIdpregunta() {
		return idpregunta;
	}

	public void setIdpregunta(int idpregunta) {
		this.idpregunta = idpregunta;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public ArrayList<Respuestas> getRespuestas() {
		return respuestas;

	}

	public void setRespuestas(ArrayList<Respuestas> respuestas) {
		Collections.shuffle(respuestas); // desordena el arraylist de respuestas
		this.respuestas = respuestas;
	}

	@Override
	public String toString() {
		return "Pregunta [idpregunta=" + idpregunta + ", pregunta=" + pregunta + ", respuestas=" + respuestas + "]";
	}

	public void mostrar() {
		System.out.println("\n------------------------------------");
		System.out.println("Pregunta: " + pregunta);
		for (int i = 0; i < respuestas.size(); i++) {
			System.out.println((i + 1) + ". " + respuestas.get(i).getRespuesta());
		}
		System.out.println("------------------------------------");
	}

}
