package com.test.random.plantillas;

import java.util.ArrayList;
import java.util.Scanner;

public class UtilClientes {

	public static ArrayList<Cliente> alClientes = new ArrayList<>();// DECLARACION DE ARRAYLIST PARA ALMACENAR CLIENTES
	public static Scanner sc = new Scanner(System.in);// OBJETO DE LA CLASE SCANNER
	public static UtilClientes obClientes;// OBJETO DE LA CLASE CLIENTES

	/**
	 * Metodo para solicitar datos de un nuevo cliente
	 */
	public static Cliente dimeCliente() {

		Cliente cliente = new Cliente();
		String dni, nombre, apellido1, apellido2, email;
		int dia, mes, anio;
		// ----------
		dni = solicitaDni(); // solicita un dni
		cliente.setDni(dni);
		// ----------
		System.out.println("Indique nombre del nuevo cliente:");
		nombre = sc.next().toString();
		if (!esNull(nombre)) {
			cliente.setNombre(limpiaString(nombre));
		}
		// ----------
		System.out.println("Indique primer apellido:");
		apellido1 = sc.next().toString();
		if (!esNull(apellido1)) {
			cliente.setApellido1(limpiaString(apellido1));
		}
		// ----------
		System.out.println("Indique segundo apellido:");
		apellido2 = sc.next().toString();
		if (!esNull(apellido2)) {
			cliente.setApellido2(limpiaString(apellido2));
		}
		// ----------
		do {
			System.out.println("Indique email:");
			email = sc.next().toString();
			if (!esNull(email)) {
				validaEmail(email);
				cliente.setEmail(limpiaString(email));
			}
		} while (email == "" || email == null);

		// ----------
		System.out.println("Indique día de nacimiento:");
		dia = sc.nextInt();
		System.out.println("Indique mes de nacimiento:");
		mes = sc.nextInt();
		if (isValidoDia(dia, mes)) {
			cliente.setDianacimiento(dia);
			cliente.setMesnacimiento(mes);
		} else {
			System.out.println("Fecha no válida");
		}
		// ----------
		System.out.println("Indique año de nacimiento:");
		anio = sc.nextInt();
		anioValido(anio);
		cliente.setAnionacimiento(anio);

		return cliente;

	}

	/**
	 * Metodo que aniade el objeto Cliente al ArrayList en funcion de su es nuevo,
	 * en cuyo caso la posicion a ocupar es la inicial, o la posicion en la que se
	 * encuentra el objeto si es a modificar
	 * 
	 * @param cliente  Objeto de la clase Cliente
	 * @param posicion variable tipo int con la posicion del arrayList
	 */
	public static void aniadeCliente(Cliente cliente, int posicion) {
		if (posicion >= 0) {
			alClientes.set(posicion, cliente); //¿?
			System.out.println(alClientes.get(posicion));
		} else {
			alClientes.add(cliente);
			System.out.println(alClientes.get(alClientes.size()-1));//muestra la ultima posicion del arraylist
		}

	}

	/**
	 * Metodo que solicita el id (dni) de un cliente de la lista y una vez
	 * localizado solicita los nuevos datos y los modifica
	 */
	public static void modificaCliente() {
		int posicion = -1;
		String dni;

		dni = solicitaDni();
		for (int i = 0; i < alClientes.size(); i++) {
			if (alClientes.get(i).getDni().equalsIgnoreCase(dni)) {
				posicion = i;
				System.out.println(alClientes.get(i));
			}
		}
		if (posicion < 0) {
			System.out.println("Cliente no localizado");
		} else {
			aniadeCliente(dimeCliente(), posicion);
			System.out.println(alClientes.get(posicion));
		}
	}

	/**
	 * Metodo para eliminar un cliente de la lista
	 * @param inOpcion variable tipo int con la opcion eliminar
	 */
	public static void eliminaCliente() {
		int posicion = -1;
		String dni;

		dni = solicitaDni();
		for (int i = 0; i < alClientes.size(); i++) {
			if (alClientes.get(i).getDni().equalsIgnoreCase(dni)) {
				posicion = i;
				System.out.println(alClientes.get(i));
			}
		}
		if (posicion < 0) {
			System.out.println("Cliente no localizado");
		} else {
			alClientes.remove(posicion);
			System.out.println("Cliente eliminado");
		}
	}
	
	/**
	 * Metodo para solicitar id (dni) de un cliente
	 * 
	 * @return valor del dni
	 */
	public static String solicitaDni() {
		String dni;
		System.out.println("Indique DNI del cliente:");
		dni = sc.next().toString();
		if (!esNull(dni)) {
			dni = (limpiaString(dni));
		}
		return dni;
	}

	/**
	 * Metodo para localizar un cliente solicitando su id (dni)
	 */
	public static void buscarCliente() {
		int posicion = -1;
		String dni;

		dni = solicitaDni();
		for (int i = 0; i < alClientes.size(); i++) {
			if (alClientes.get(i).getDni().equalsIgnoreCase(dni)) {
				posicion = i;
				System.out.println(alClientes.get(i));
			}
		}
		if (posicion < 0) {
			System.out.println("Cliente no localizado");
		}
	}

	/**
	 * Metodo para validar si el dia y mes se corresponde
	 * 
	 * @param dia Variable tipo int que almacena el dia de entrada
	 * @param mes Variable tipo int que almacena el mes de entrada
	 * @return Variable booleana true si es valido, o false si es incorrecto
	 */
	public static boolean isValidoDia(int dia, int mes) {
		boolean isValido = true;
		ArrayList<Integer> diasMeses = getMesesDias();

		for (int i = 0; i < diasMeses.size(); i += 2) {
			if (diasMeses.get(i) == mes) {
				if (dia > diasMeses.get(i + 1)) {
					isValido = false;
				}
			}
		}
		return isValido;
	}

	/**
	 * Metodo que revisa si una cadena de caracteres es nula o vacia
	 * 
	 * @param cadena Variable tipo String que almacena la cadena de caracteres
	 * @return Variable booleana true si esta vacia o nula, y false si la cadena
	 *         tiene datos
	 */
	public static boolean esNull(String cadena) {// METODO PARA REVISAR QUE EL STRING NO SEA VACIO
		boolean esNull = true; // INICIALIZAMOS CADENA COMO VACIA/NULA
		if (cadena != null && cadena.length() > 0) { // SI LA CADENA NO ES NULA NI VACIA
			esNull = false; // MODIFICAMOS VARIABLE A FALSE PARA QUE SALGA DEL BUCLE
		}
		return esNull; // RETORNA FALSE SI NO ES NULA NI VACIA
	}

	/**
	 * Metodo que limpia los espacios de una cadena de caracteres
	 * 
	 * @param cadena Variable tipo String que almacena la cadena de caracteres
	 * @return Variable String con la cadena limpia de espacios
	 */
	public static String limpiaString(String cadena) {// METODO PARA LIMPIAR LOS ESPACIOS DE UN STRING
		String retorno = "";
		if (!esNull(cadena)) { // SI LA CADENA NO ES NULA NI VACIA CONTINUA
			retorno = cadena.trim(); // LIMPIA LOS ESPACIOS
		}
		return retorno; // DEVUELVE LA CADENA LIMPIA DE ESPACIOS
	}

	/**
	 * Metodo para validar que un anio sea valido
	 * 
	 * @param anio Variable tipo int con el anio de entrada
	 * @return Variable booleana true si el anio es valido, o false si no es
	 *         coherente
	 */
	public static boolean anioValido(int anio) {// METODO PARA VALIDAR QUE EL AÑO SEA VALIDO
		boolean anioValido = true;

		if (anio < 1900 || anio > 2022) { // VALIDAR QUE EL AÑO DE NACIMIENTO SEA COHERENTE
			System.out.println("Teclee año coherente, formato aaaa:");
			anioValido = false;
		}
		return anioValido;
	}

	/**
	 * Metodo con las validaciones minimas de una direccion de email: longitud
	 * minima, caracteres arroba y punto, dominio, letras al inicio y al final de la
	 * cadena de caracteres
	 * 
	 * @param email Variable tipo String con la direccion de email por entrada
	 */
	public static void validaEmail(String email) {// METODO QUE VALIDA UNA DIRECCION DE EMAIL
		// VALIDACIONES:

		// LONGITUD MINIMA 6 CARACTERES x@y.zz
		if (email.length() < 6) {
			System.out.println("Error. Teclee dirección de email correcta");
		} else {
			// CONTIENE ARROBA @
			if (!email.contains("@")) {
				System.out.println("Error. No contiene @");
			} else {
				// @ DEBE ESTAR ENTRE POSICION 1 Y LONGITUD-5
				if (email.indexOf('@') < 1 || email.indexOf('@') > (email.length() - 5)) {
					System.out.println("Error. Posición de la @");
				}
			}
			// DESPUES DE LA @ DEBE HABER UN .
			if (email.contains(".")) {
				if (email.indexOf('.') < email.indexOf('@')) {
					System.out.println("Error. El . está en posición incorrecta");
				} else {
					// EL . DEBE ESTAR EN POSICION .xx o .xxx
					if (email.indexOf(".") != (email.length() - 3) && email.indexOf(".") != (email.length() - 4)) {
						System.out.println("Error. Dominio debe tener formato .xx o .xxx");
					}
				}
			} else {
				System.out.println("Error. No contiene . después de la @");
			}
			// EMPEZAR EN LETRA
			if (email.toUpperCase().charAt(0) < 65 || email.toUpperCase().charAt(0) > 90) {
				System.out.println("Error. Debe empezar por una letra");
			}
			// TERMINAR EN LETRA
			if (email.toUpperCase().charAt(email.length() - 1) < 65
					|| email.toUpperCase().charAt(email.length() - 1) > 90) {
				System.out.println("Error. Debe terminar en letra");
			}
		}
	}

	/**
	 * ArrayList de clientes por defecto para pruebas
	 * 
	 * @return ArrayList con los clientes existentes
	 */
	public static ArrayList<Cliente> getClientes() {// RETORNA LA LISTA DE CLIENTES EXISTENTE

		// CREAMOS CLIENTES DE PRUEBA
		Cliente cliente1 = new Cliente("11111111A", "Mateo", "García", "Pérez", "mateogp@email.com", 25, 1, 2018);
		Cliente cliente2 = new Cliente("22222222B", "Victor", "García", "Pérez", "victorgp@email.com", 21, 3, 2014);
		Cliente cliente3 = new Cliente("33333333C", "Marcos", "Ruíz", "Mercado", "marcosgm@email.com", 12, 1, 2000);
		Cliente cliente4 = new Cliente("44444444D", "Karla", "Merlano", "Soria", "karlams@email.com", 14, 4, 1980);
		Cliente cliente5 = new Cliente("55555555E", "Maria", "Ponce", "Martinez", "mariapm@email.com", 1, 6, 1974);
		Cliente cliente6 = new Cliente("66666666F", "Pablo", "Moreno", "Osco", "pablomo@email.com", 27, 9, 1995);
		Cliente cliente7 = new Cliente("77777777G", "Jenn", "Palomo", "Rubio", "jennpru@email.com", 30, 10, 1991);

		// AÑADIMOS CLIENTES AL ARRAYLIST
		alClientes.add(cliente1);
		alClientes.add(cliente2);
		alClientes.add(cliente3);
		alClientes.add(cliente4);
		alClientes.add(cliente5);
		alClientes.add(cliente6);
		alClientes.add(cliente7);

		return alClientes; // RETORNA LA LISTA DE CLIENTES
	}

	/**
	 * ArrayList con los dias maximos por cada mes
	 * 
	 * @return ArrayList con todos los datos de dias y meses
	 */
	public static ArrayList<Integer> getMesesDias() {// ARRAYLIST QUE CONTIENE LOS MESES Y SUS DIAS

		ArrayList<Integer> diasMeses = new ArrayList<>();
		diasMeses.add(1);
		diasMeses.add(31);
		diasMeses.add(2);
		diasMeses.add(28);
		diasMeses.add(3);
		diasMeses.add(31);
		diasMeses.add(4);
		diasMeses.add(30);
		diasMeses.add(5);
		diasMeses.add(31);
		diasMeses.add(6);
		diasMeses.add(30);
		diasMeses.add(7);
		diasMeses.add(31);
		diasMeses.add(8);
		diasMeses.add(31);
		diasMeses.add(9);
		diasMeses.add(30);
		diasMeses.add(10);
		diasMeses.add(31);
		diasMeses.add(11);
		diasMeses.add(30);
		diasMeses.add(12);
		diasMeses.add(31);

		return diasMeses;
	}

	/**
	 * Metodo que solicita una fecha para el sorteo
	 * 
	 * @return Array de enteros (int) con los tres datos: dia, mes, anio
	 */
	public static int[] getFechaPremio() {
		int[] fechas = new int[3];

		System.out.println("Indique día de nacimiento:");
		int dia = sc.nextInt();
		System.out.println("Indique mes de nacimiento:");
		int mes = sc.nextInt();
		if (isValidoDia(dia, mes)) {
			fechas[0] = dia;
			fechas[1] = mes;

		} else {
			System.out.println("Fecha no válida");
		}
		// ----------
		System.out.println("Indique año de nacimiento:");
		int anio = sc.nextInt();
		anioValido(anio);
		fechas[2] = anio;

		return fechas;
	}

	/**
	 * Metodo para verificar si hay algun ganador que coincida con la fecha premiada
	 */
	public static void getGanador() {
		// primero obtener fechas para el sorteo desde la consola
		int[] fechas = UtilClientes.getFechaPremio();
		// llamamos a calcularSiPremiado con las fechas recibidas por copnsola
		Cliente.calcularSiPremiado(fechas[0], fechas[1], fechas[2]);
	}

	/**
	 * Metodo que muestra todos los clientes existentes en la Lista de clientes
	 */
	public static void getObtenerClientes() {

		ArrayList<Cliente> alClientes = getClientes();
		for (int i = 0; i < alClientes.size(); i++) {
			System.out.println(alClientes.get(i));
		}
	}

}


