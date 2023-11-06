/**
 * 
 */
package prt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Eduardo
 *
 */
class Calculadora {

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
	}

	/**
	 * Test method for {@link Calculadora#Calculadora()}.
	 */
	@Test
	void testCalculadora() {
		System.out.println("mi test");
		fail("Not yet implemented");		
	}
	/**
	 * Test method for {@link Calculadora#Calculadora()}.
	 */
	@Test
	void testCalculadora1() {
		System.out.println("mi test 1");
		fail("Not yet implemented");
		
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
