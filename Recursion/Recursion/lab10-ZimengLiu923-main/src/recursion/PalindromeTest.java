package recursion;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testIsPalindrome() {
		assertEquals("Failed",false, Palindrome.isPalindrome("father"));
		assertEquals("Failed",true, Palindrome.isPalindrome("dad"));
		assertEquals("Failed",true, Palindrome.isPalindrome("a"));
		assertEquals("Failed",true, Palindrome.isPalindrome(""));
	}

}
