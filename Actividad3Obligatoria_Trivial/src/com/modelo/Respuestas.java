package com.modelo;

public class Respuestas {
	private int idrespuesta;
	private int fidpregunta;
	private String respuesta;
	private int correcta; // 1 si es la respuesta correcta

	public Respuestas() {
		super();
	}

	public Respuestas(int idrespuesta, int fidpregunta, String respuesta, int correcta) {
		super();
		this.idrespuesta = idrespuesta;
		this.fidpregunta = fidpregunta;
		this.respuesta = respuesta;
		this.correcta = correcta;
	}

	public Respuestas(String respuesta, int correcta) {
		super();
		this.respuesta = respuesta;
		this.correcta = correcta;
	}

	public int getIdrespuesta() {
		return idrespuesta;
	}

	public void setIdrespuesta(int idrespuesta) {
		this.idrespuesta = idrespuesta;
	}

	public int getFidpregunta() {
		return fidpregunta;
	}

	public void setFidpregunta(int fidpregunta) {
		this.fidpregunta = fidpregunta;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	public int getCorrecta() {
		return correcta;
	}

	public void setCorrecta(int correcta) {
		this.correcta = correcta;
	}

	@Override
	public String toString() {
		return "Respuestas [idrespuesta=" + idrespuesta + ", fidpregunta=" + fidpregunta + ", respuesta=" + respuesta
				+ ", correcta=" + correcta + "]";
	}

}
