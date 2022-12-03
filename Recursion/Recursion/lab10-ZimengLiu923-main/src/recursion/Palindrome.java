package recursion;

/**
 * The palindrome class can be used to check whether strings are
 * palindromes.
 * 
 * @author jmac
 *
 */
public class Palindrome {
	/**
	 * Determine whether a given string is a palindrome. That is, is the
	 * string the same backwards as forwards?
	 * 
	 * @param s The string to be analyzed.
	 * @return True if s is a palindrome and false otherwise.
	 */
	public static boolean isPalindrome(String s) {
//		String s1;
		int len = s.length();

		// Base cases: strings of length zero or one are always
		// palindromes.
		if (len == 0 || len == 1) {
			return true;
		}
		// Recursive case: If the first and last characters are
		// different, it's definitely not a palindrome. If the first and
		// last characters are the same, remove them and check whether the
		// remaining string is a palindrome.
		else {
			String firstCharacter = s.substring(0, 1);
			String lastCharacter = s.substring(len - 1, len);
			String otherCharacters = s.substring(1, len - 1);
			if (!firstCharacter.equals(lastCharacter)) {
				return false;
			} else {
				return isPalindrome(otherCharacters);
			}
		}
		
//		while(s.charAt(0)==s.charAt(len-1)) {
//			  s1=s.substring(1,len-2);
//			  isPalindrome(s1);
//		}
//		return false;
		
	}
}
