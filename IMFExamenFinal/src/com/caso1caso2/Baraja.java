package com.caso1caso2;

import java.util.ArrayList;
import java.util.Collections;

public class Baraja {

	// Aunque el diagrama indica que son atributos públicos, siempre deben ser
	// atributos privados

	private String tipo;
	private ArrayList<Cartas> cartas = new ArrayList<>();

	public Baraja(String tipo, ArrayList<Cartas> cartas) {
		super();
		this.tipo = tipo;
		this.cartas = cartas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Cartas> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Cartas> cartas) {
		this.cartas = cartas;
	}

	@Override
	public String toString() {
		return "Baraja [tipo=" + tipo + ", cartas=" + cartas + "]";
	}

	// Caso3: punto 3: implementar mezclar y mostrar elementos
	public void mezclar() {

		Collections.shuffle(cartas);// desordena arraylist
		toString();//mustrar los elementos
	}

	// Caso2: punto 1: implementar metodo extraer carta
	public void extraerCarta() {
		System.out.println(cartas.get(0).toString());// extrae la primera carta y la muestra
	}

	// Caso2: punto 2: implementar metodo que muestre tipo de baraja y numero total
	// recibe como parametro el tipo de baraja
	public void numeroCartas(String tipo) {

		int total = 0;

		for (int i = 0; i < cartas.size(); i++) {
			// si tipo que viene por parametro es igual al tipo de la posicion del arraylist
			if (tipo.equalsIgnoreCase(cartas.get(i).getTipo())) {
				total++; // suma uno al total
			}
		}

		System.out.println("El total de cartas de tipo " + tipo + " es " + total);

	}

}
