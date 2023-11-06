package com.logica;

import java.util.Scanner;

public class Utilidad {
	public Scanner sc = new Scanner(System.in);

	//validar opcion numerica
	public void validaOpcion() {
		while (!sc.hasNextInt()) {// mientras que lo siguiente no sea un int, repetir
			System.out.println("Debe ser un número...");
			sc.next();// limpiar buffer
		}
	}
}