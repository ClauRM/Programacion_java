package com.caso1caso2;

public abstract class Coleccion {

	private String nombre;
	private String tipo;
	private int numeroElemento;
	
	public Coleccion(String nombre, String tipo, int numeroElemento) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.numeroElemento = numeroElemento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumeroElemento() {
		return numeroElemento;
	}

	public void setNumeroElemento(int numeroElemento) {
		this.numeroElemento = numeroElemento;
	}

	@Override
	public String toString() {
		return "Coleccion [nombre=" + nombre + ", tipo=" + tipo + ", numeroElemento=" + numeroElemento + "]";
	}
	
	public abstract void valorar();
}
