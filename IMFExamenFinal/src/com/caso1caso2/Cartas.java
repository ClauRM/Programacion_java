package com.caso1caso2;

public class Cartas extends Coleccion implements Manipular {

	private int orden;
	private int valor;

	public Cartas(String nombre, String tipo, int numeroElemento, int orden, int valor) {
		super(nombre, tipo, numeroElemento);
		this.orden = orden;
		this.valor = valor;
	}

	public int getOrden() {
		return orden;
	}

	public void setOrden(int orden) {
		this.orden = orden;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Cartas [orden=" + orden + ", valor=" + valor + ", nombre=" + getNombre() + ", tipo=" + getTipo()
				+ ", NumeroElemento=" + getNumeroElemento();
	}

	public void recuperar() {

	}

	@Override
	public void voltear() {

	}

	@Override
	public void descartar() {

	}

	@Override
	public void usar() {

	}

	@Override
	public void valorar() {
		// TODO Auto-generated method stub

	}

}
