package com.test.random.modelo;

public class Cliente {

	private String nombre;
	private int dia, mes, anio;
	
	public Cliente() {
		
	}
	
	public Cliente(String nombre, int dia, int mes, int anio) {
		super();
		this.nombre = nombre;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}



	
	
	
}
