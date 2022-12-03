package recursion;

/**
 * Recursive computation of x^n.
 *
 * @author (YOUR NAME HERE)
 * @version (PUT DATE HERE)
 */
public class Exponentiation {
	static int result;

    /**
     * Compute the value of x^n.
     * 
     * @param x the base (non-negative integer)
     * @param n the exponent (non-negative integer)
     * @return x^n
     */
    public static long exp(int x, int n) {
    	if (n == 0) {
    		result = 1;}
    		else {
    			if (n>0 && n%2==0) {
    				result= (int) (Math.pow(x, n/2)*Math.pow(x, n/2));}
    			else {
    					result= (int) ((int)(x*exp(x,n-1)));
    				}
    			}
    			return result;
    }
}
