package com.test.random.modelo;

import java.util.ArrayList;

public class ObtenerClientes {

	
	public Cliente getCliente() {
		
		return new Cliente();
	}
	
	
	public ArrayList<Cliente> getClientes(){
		
		ArrayList<Cliente> alClientes = new ArrayList<>();
		//crear clientes
		Cliente cliente1 = new Cliente("Mateo", 25,1,2018);
		Cliente cliente2 = new Cliente("Victor", 21,3,2014);

		alClientes.add(cliente1);
		alClientes.add(cliente2);
		
		return alClientes;
	}
	
	
	
	
}
