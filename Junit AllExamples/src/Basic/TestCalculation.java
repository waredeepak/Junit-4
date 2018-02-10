package Basic;

import static org.junit.Assert.*;

import org.junit.*;

public class TestCalculation {

	Calculator calculator;

	@Before
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void testSum() {
		int a = 20;
		int b = 30;
		int result = calculator.sum(a, b);
		System.out.println(result);
		assertNotNull(result);
		assertEquals(50, result);
	}

	@Test
	public void testMul() {
		int a = 10;
		int b = 20;
		int actual = calculator.multiply(a, b);
		System.out.println(actual);
		assertNotNull(actual);
		assertEquals(200, actual);
	}

	@Test
	public void testDiv() {
		int a = 20;
		int b = 10;
		int actual = calculator.divide(a, b);
		System.out.println(actual);
		assertNotNull(actual);
		assertEquals(" Div",2, actual);
	}

	/*@Test
	public void tetSub() {
		int a = 10;
		int b = 5;
		int actual = calculator.minus(a, b);
		System.out.println(actual);
		assertNotNull(actual);
		assertEquals(5, actual); // Error
	}*/

	@Test
	public void tetSub() {
		int a = 10;
		int b = 5;
		int actual = calculator.minu(a, b);
		System.out.println(actual);
		assertNotNull(actual);
		assertEquals(5, actual);
	}
	
	/*Output
	2
	200
	50
	5*/

}
