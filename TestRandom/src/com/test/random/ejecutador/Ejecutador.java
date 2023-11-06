package com.test.random.ejecutador;

import java.util.ArrayList;
import java.util.Iterator;

import com.test.random.generate.RandomDate;
import com.test.random.modelo.*;

public class Ejecutador {
	
	private static RandomDate randomDate;
	private static ObtenerClientes obClientes;
	
	

	public static void main(String[] args) {
		
		getFechaRandom();
		getObtenerClientes();
		
	}
	
	
	private static void getFechaRandom() {
		 try {
			randomDate = new RandomDate();
			
		} catch (Exception e) {
			
			System.out.println("Error en la generación de fechas random: + " + e);		
		}
		 
		 System.out.println(randomDate);

	}
	
	
	private static void getObtenerClientes() {
		obClientes = new ObtenerClientes();
		
		ArrayList<Cliente> alClientes = obClientes.getClientes();
		
		for (int i = 0; i < alClientes.size(); i++) {

			System.out.println(alClientes.get(i));
		}
			
		
	}
	
	

}
