import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	private int a, b, c;
	Calculator cal;
	
		
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		cal = new Calculator();
		a = 4321;
		b = 1234;
		c = 0;
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
				
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
				 
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	@Test
	public void testMultiple() {
		//fail("Not yet implemented");
		int a = 12;
		int b = 12;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		int expected = 144;
		assertEquals(actual, expected);
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 100;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		int expected = 20;
		assertEquals(actual, expected);
	}	
	
	@Test
	public void testDivideWith0Denominator() {
		//fail("Not yet implemented");
		try {
			cal.divide(a, c);
			fail("Expected an IllegalArgumentException to be thrown");
		}
		catch(IllegalArgumentException e) {
			assertEquals("Division by zero is not supported", e.getMessage());
		}
		catch(Throwable t) {
			assertEquals("Expected an IllegalArgumentException to be thrown", t.getMessage());
		}
	}
}
	


