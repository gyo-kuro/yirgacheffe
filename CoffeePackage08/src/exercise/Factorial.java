/* Question 4: Recursion
*
* Tanuj Kumar (github: gyo-kuro)
* 28 May 15
* 
* Defines a factorial through a recursive method 
* Also defines it using a conventional for loop
* 
*/

package exercise;

public class Factorial {
	
	public static long FactorNonRecursive (int n) { // non-recursive
		
		if (n < 0 || n > 20) {
			throw new RuntimeException("Invalid parameters."); // exception throw
		} else if (n == 0) {
			
			return 1; // zero case
		}
		
		else {
			
			long nonproduct = 1;
			
			for (int i = 2; i <= n; i++) {
				
				nonproduct *= i; // for-loop continually multiplies existing variable 
			}
			
			return nonproduct;
		}
	}
	
	public static long FactorRecursive (int n) { // recursive
		
		if (n < 0 || n > 20) {
			throw new RuntimeException("Invalid parameters."); // exception throw
			
		} else if (n == 0) {
			return 1; // base case, zero
		} else {
			return n * FactorRecursive(n-1); // multiply the integer by the function
			// which contains the integer minus one and continue this recursive execution
			// until n = 0 which returns 1 and executes a return pathway backward
			
			
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(FactorRecursive(6));
		System.out.println(FactorNonRecursive(6));
	}

}
