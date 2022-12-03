package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExponentiationTest {

	@Test
	public void testExp() {
		
		assertEquals("Incorrect Exponentiation", 32, Exponentiation.exp(2, 5));
		assertEquals("Incorrect Exponentiation", 64, Exponentiation.exp(2, 6));
		assertEquals("Incorrect Exponentiation", 3, Exponentiation.exp(3, 1));
		assertEquals("Incorrect Exponentiation", 1, Exponentiation.exp(3, 0));
	}
}
