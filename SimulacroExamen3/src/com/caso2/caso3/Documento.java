package com.caso2.caso3;

public class Documento {

	private int id;
	private String tipo;
	private String contenido;
	private String autor;
	
	
	public Documento() {
		super();
	}

	public Documento(int id, String tipo, String contenido, String autor) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.contenido = contenido;
		this.autor = autor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Documento [id=" + id + ", tipo=" + tipo + ", contenido=" + contenido + ", autor=" + autor + "]";
	}
	

}
