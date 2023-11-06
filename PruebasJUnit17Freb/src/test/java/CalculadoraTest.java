import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class CalculadoraTest {
	Calculadora calculadora;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeAll");
	}


	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("@BeforeEach");
		calculadora = new Calculadora();
	}

	@Disabled
	@Test
	void testCalculadora() {
		System.out.println("TestCalculadora()");
		fail("no terminado");
	}

	@Test
	@DisplayName("salida correcta por que 1 > 0")
	void testAMayorB() {
		System.out.println("testAMayorB()");
		int a = 1;
		int b = 0;
		
		boolean esperado = true;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertEquals(esperado, calculadora.aMayorB(a,b));
	}
	
	@Test
	@DisplayName("salida correcta por que 2 > 1")
	void testAMayorA2B1() {
		System.out.println("testAMayorB_1()");
		int a = 2;
		int b = 1;
		
		boolean esperado = true;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertEquals(esperado, calculadora.aMayorB(a,b));
	}
	
	@Test
	@DisplayName("salida correcta por que 2 > 0")
	void testAMayorA2B0() {
		System.out.println("testAMayorB_1()");
		int a = 2;
		int b = 0;
		
		boolean esperado = true;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertEquals(esperado, calculadora.aMayorB(a,b));
	}
	
//=============================================
	
	@Test
	@DisplayName("salida correcta por que 0 > 1")
	void testAMayorA0B1() {
		System.out.println("testAMayorB_1()");
		int a = 0;
		int b = 1;
		
		boolean esperado = false;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertEquals(esperado, calculadora.aMayorB(a,b));
	}
	
	@Test
	@DisplayName("salida correcta por que 1 > 2")
	void testAMayorA1B2() {
		System.out.println("testAMayorB_1()");
		int a = 1;
		int b = 2;
		
		boolean esperado = false;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertEquals(esperado, calculadora.aMayorB(a,b));
	}
	
	@Test
	@DisplayName("salida correcta por que 0 > 2")
	void testAMayorA0B2() {
		System.out.println("testAMayorB_1()");
		int a = 0;
		int b = 2;
		
		boolean esperado = false;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertEquals(esperado, calculadora.aMayorB(a,b));
	}
	
	//=============================================
	
	@Test
	@DisplayName("salida correcta por que 2")
	void testAMayorBIguales() {
		System.out.println("testAMayorB_1()");
		int a = 2;
		int b = 2;
		
		//boolean esperado = false;
		//boolean esperado = 0 < 1;
		
		//assertEquals(esperado, metodoCalculado);
		assertThrows(Error.class, () -> calculadora.aMayorB(a,b));
	}
	
	/*
	Function nombreF(a,b,c) {
	//codigo
	}
	
	(a,b,c) -> { //codigo}
	*/
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
