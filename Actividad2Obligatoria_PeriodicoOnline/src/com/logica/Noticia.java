package com.logica;

import java.time.*;

public class Noticia {

	private LocalDate fecha;
	private String titular;
	private String texto;
	private String autor;

	public Noticia() {
		super();
	}

	public Noticia(LocalDate fecha, String titular, String texto, String autor) {
		super();
		this.fecha = fecha;
		this.titular = titular;
		this.texto = texto;
		this.autor = autor;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "----------------------------------" + "\n" + "Fecha Noticia: " + fecha + "\n" + "Títular Noticia: "
				+ titular.toUpperCase() + "\n" + "Cuerpo Noticia: " + texto + "\n" + "Autor Noticia: " + autor + "\n"
				+ "----------------------------------";
	}

	public String toStringFichero() {
		return fecha + ";" + titular + ";" + texto + ";" + autor;
	}


}
