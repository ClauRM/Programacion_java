package com.caso1caso2;

public class Figuras extends Coleccion {
	
	private String estado;
	private int peso;
	
	public Figuras(String nombre, String tipo, int numeroElemento, String estado, int peso) {
		super(nombre, tipo, numeroElemento);
		this.estado = estado;
		this.peso = peso;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Figuras [estado=" + estado + ", peso=" + peso + "]";
	}
	
	public void rotar() {
		
	}

	@Override
	public void valorar() {
		// TODO Auto-generated method stub
		
	}

}
