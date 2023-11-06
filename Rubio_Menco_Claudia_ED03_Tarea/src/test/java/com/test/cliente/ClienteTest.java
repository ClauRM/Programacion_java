/**
 * 
 */
package com.test.cliente;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Claudia Rubio
 *
 */
class ClienteTest {

	// Declaracion del objeto cliente
	Cliente cliente;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
	}

	/**
	 * @throws java.lang.Exception Instancia objeto cliente para las pruebas del
	 *                             metodo CalculaSiPremiado()
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
		cliente = new Cliente("Nombre", "Apellido1", "Apellido2", "email@email.com", 21, 3, 2014);
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice el dia con la fecha
	 * premiada
	 */
	@Test
	@DisplayName("Salida correcta -> dia Ko, mes y anio Ok")
	void testCalcularSiPremiado_1() {
		System.out.println("testCalcularSiPremiado_1()");
		int dia = 22;
		int mes = 3;
		int anio = 2014;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice el dia ni el mes con
	 * la fecha premiada
	 */
	@Test
	@DisplayName("Salida correcta -> dia y mes Ko, anio Ok")
	void testCalcularSiPremiado_2() {
		System.out.println("testCalcularSiPremiado_2()");
		int dia = 22;
		int mes = 4;
		int anio = 2014;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice dia, mes ni anio con
	 * la fecha premiada
	 */
	@Test
	@DisplayName("Salida correcta -> dia, mes y anio Ko")
	void testCalcularSiPremiado_3() {
		System.out.println("testCalcularSiPremiado_3()");
		int dia = 22;
		int mes = 4;
		int anio = 2015;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice mes con la fecha
	 * premiada
	 */
	@Test
	@DisplayName("Salida correcta -> mes Ko, dia y anio Ok")
	void testCalcularSiPremiado_4() {
		System.out.println("testCalcularSiPremiado_4()");
		int dia = 21;
		int mes = 4;
		int anio = 2014;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice mes ni el anio con
	 * la fecha premiada
	 */
	@Test
	@DisplayName("Salida correcta -> mes y anio Ko, dia Ok")
	void testCalcularSiPremiado_5() {
		System.out.println("testCalcularSiPremiado_5()");
		int dia = 21;
		int mes = 4;
		int anio = 2015;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice el anio con la fecha
	 * premiada
	 */
	@Test
	@DisplayName("Salida correcta -> anio Ko, dia y mes Ok")
	void testCalcularSiPremiado_6() {
		System.out.println("testCalcularSiPremiado_6()");
		int dia = 21;
		int mes = 3;
		int anio = 2015;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando no coindice el dia ni el anio
	 * con la fecha premiada
	 */
	@Test
	@DisplayName("Salida correcta -> anio y dia Ko, mes Ok")
	void testCalcularSiPremiado_7() {
		System.out.println("testCalcularSiPremiado_7()");
		int dia = 22;
		int mes = 3;
		int anio = 2015;

		boolean esperado = false;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	// ---------------------------------------------------------
	/**
	 * Test method for
	 * {@link com.test.cliente.Cliente#calcularSiPremiado(com.test.cliente.Cliente, int, int, int)}.
	 * Prueba el metodo CalcularSiPremiado() cuando la fecha de nacimiento del
	 * cliente coincide con todos los campos de la fecha premiada
	 */
	@Test
	@DisplayName("Salida correcta -> dia, mes y anio Ok")
	void testCalcularSiPremiado_8() {
		System.out.println("testCalcularSiPremiado_8()");
		int dia = 21;
		int mes = 3;
		int anio = 2014;

		boolean esperado = true;
		assertEquals(esperado, Cliente.calcularSiPremiado(cliente, dia, mes, anio));
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		System.out.println("@AfterEach");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterAll");
	}
}
