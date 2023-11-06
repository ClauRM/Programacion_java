package com.test.random.plantillas;

import java.util.ArrayList;

/**
 * 
 * @author Claudia Rubio
 * 
 */
public class Cliente {

	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String email;
	private int dianacimiento;
	private int mesnacimiento;
	private int anionacimiento;

	/**
	 * Constructor vacio de la clase Cliente
	 */
	public Cliente() {
		super();
	}

	/**
	 * Contructor Cliente con parametros
	 * 
	 * @param dni            Variable tipo String para almacenar dni
	 * @param nombre         Variable tipo String para almacenar nombre
	 * @param apellido1      Variable tipo String para almacenar primer apellido
	 * @param apellido2      Variable tipo String para almacenar segundo apellido
	 * @param email          Variable tipo String para almacenar dirección de email
	 * @param dianacimiento  Variable int para almacenar el dia de nacimiento
	 * @param mesnacimiento  Variable int para almacenar el mes de nacimiento
	 * @param anionacimiento Variable int para almacenar el aioo de nacimiento
	 */
	public Cliente(String dni, String nombre, String apellido1, String apellido2, String email, int dianacimiento,
			int mesnacimiento, int anionacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.email = email;
		this.dianacimiento = dianacimiento;
		this.mesnacimiento = mesnacimiento;
		this.anionacimiento = anionacimiento;
	}

	/**
	 * Devuelve el valor que tiene el dni del objeto Cliente
	 * 
	 * @return String con el dni del cliente
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Modifica el valor que tiene el dni en el objeto Cliente
	 * 
	 * @param String dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Devuelve el valor del nombre del Cliente
	 * 
	 * @return String con el nombre del cliente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el valor del nombre del Cliente
	 * 
	 * @param String nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve el valor del primer apellido del Cliente
	 * 
	 * @return String con el primer apellido del cliente
	 */
	public String getApellido1() {
		return apellido1;
	}

	/**
	 * Modifica el valor del primer apellido del Cliente
	 * 
	 * @param String apellido1
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	/**
	 * Devuelve el valor del segundo apellido del Cliente
	 * 
	 * @return String con el segundo apellido del cliente
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 * Modifica el valor del segundo apellido del Cliente
	 * 
	 * @param String apellido2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 * Devuelve el valor del email del Cliente
	 * 
	 * @return String con el email del cliente
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Modifica el valor del email del Cliente
	 * 
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Devuelve el valor del dia de la fecha de nacimiento del Cliente
	 * 
	 * @return Variable tipo int con el dia de la fecha de nacimiento del Cliente
	 */
	public int getDianacimiento() {
		return dianacimiento;
	}

	/**
	 * Modifica el dia de la fecha de nacimiento del Cliente
	 * 
	 * @param int dianacimiento
	 */
	public void setDianacimiento(int dianacimiento) {
		this.dianacimiento = dianacimiento;
	}

	/**
	 * Devuelve el valor del mes de la fecha de nacimiento del Cliente
	 * 
	 * @return Variable tipo int con el mes de la fecha de nacimiento del Cliente
	 */
	public int getMesnacimiento() {
		return mesnacimiento;
	}

	/**
	 * Modifica el mes de la fecha de nacimiento del Cliente
	 * 
	 * @param int mesnacimiento
	 */
	public void setMesnacimiento(int mesnacimiento) {
		this.mesnacimiento = mesnacimiento;
	}

	/**
	 * Devuelve el valor del anio de la fecha de nacimiento del Cliente
	 * 
	 * @return Variable tipo int con el anio de la fecha de nacimiento del Cliente
	 */
	public int getAnionacimiento() {
		return anionacimiento;
	}

	/**
	 * Modifica el anio de la fecha de nacimiento del Cliente
	 * 
	 * @param int anionacimiento
	 */
	public void setAnionacimiento(int anionacimiento) {
		this.anionacimiento = anionacimiento;
	}

	@Override
	public String toString() {
		return "DNI: " + dni + "\t" + nombre + ", " + apellido1 + " " + apellido2 +"\t"+ "Email: " + email +"\t"+ "Fecha nacimiento: "
				+ dianacimiento + "/" + mesnacimiento + "/" + anionacimiento;
	}

	/**
	 * Metodo que recibe tres parametros de tipo entero con una fecha (dia, mes y
	 * anio) y comprueba si algun cliente ha nacido en la fecha sorteada. Devuelve
	 * true si hay ganador y false sino lo hay
	 *
	 * @param int dia
	 * @param int mes
	 * @param int anio
	 * @return Variable booleana true si hay ganador o false si no lo hay
	 */
	public static boolean calcularSiPremiado(int dia, int mes, int anio) {
		boolean isGanador = false;

		ArrayList<Cliente> alClientes = UtilClientes.getClientes();

		if (alClientes != null) {
			for (int i = 0; i < alClientes.size(); i++) {
				// comprobamos anio
				// alClientes.get(i) = alClientes[i]
				// alClientes.get(i) devuelve un Cliente en la posicion ni del arraylist

				// validamos el anio
				if (alClientes.get(i).getAnionacimiento() == anio) {
					// validamos el mes
					if (alClientes.get(i).getMesnacimiento() == mes) {
						// validamos el dia
						if (alClientes.get(i).getDianacimiento() == dia) {
							// WIN
							System.out.println("El ganador es: " + alClientes.get(i).toString());
							isGanador = true;
						}
					}
				}
			}

			if (!isGanador) {
				System.out.println("No hay ganador...");
			}
		} else {
			System.out.println("No hay clientes para el sorteo...");
		}

		return isGanador;

	}

}
