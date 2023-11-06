package com.menu;

import java.util.Scanner;

import com.operaciones.Restar;
import com.operaciones.Sumar;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Sumar sumar = new Sumar();
	Restar restar = new Restar();
	int numero1 = 0;
	int numero2 = 0;
	
	public void menu() {
		
		System.out.println("Ingresa una opcion..."
				+ "\n 1-Sumar"
				+ "\n 2-Restar");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1: {
			pedirNumero();
			System.out.println("La suma de tus numeros es: " + sumar.sumar(numero1,numero2)); 
			break;
		}
		
		case 2: {
			pedirNumero();
			restar.restar(numero1,numero2);
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
		
		
	}
	
	
	private void pedirNumero() {
		System.out.println("Ingrese un numero...");
		numero1 = sc.nextInt();
		System.out.println("Ingrese el segundo numero...");
		numero2 = sc.nextInt();
	}
	
	
}
