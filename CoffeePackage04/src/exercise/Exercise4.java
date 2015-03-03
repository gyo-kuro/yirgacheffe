// QuadraticCheck (Exercise4)
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes the coefficients a, b, c of a quadratic equation in the form
// ax^2 + bx + c and uses the discriminant and quadratic formula 
// To output how many roots and the roots respectively
//

package exercise;
import atelier.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.ask("Please enter the first coefficient, a: ");
		float numOne = In.getFloat(); // get coefficient a
		P.ask("Please enter the first coefficient, b: ");
		float numTwo = In.getFloat(); // get coefficient b
		P.ask("Please enter the first coefficient, c: ");
		float numThree = In.getFloat(); // get coefficient c
		quad(numOne,numTwo,numThree);
	}
	
	public static void quad(float a, float b, float c) {
		// quadratic formula method
		float denom = 2*a; // denominator value for formula
		float discrim = (float)(Math.pow(b,2) + (-4 * a * c)); // discriminant value 
		
		if (discrim < 0) {
			System.out.println("No real solutions."); // no solutions if discriminant is negative
		} else if (discrim == 0) {
			System.out.println("One solution: "); // one solution if discriminant is 0
			float caseOne = (float)(((0-b)+Math.pow(discrim, 0.5))/denom); // caseOne is the one-solution case
			System.out.println(caseOne); // output
			
		} else {
			System.out.println("Two solutions: "); // two solutions if discriminant is greater than 0
			float caseTwoA = (float)(((0-b)+Math.pow(discrim, 0.5))/denom); // -b + solution calculated
			float caseTwoB = (float)(((0-b)-Math.pow(discrim, 0.5))/denom); // -b - solution calculated
			System.out.println(caseTwoA + "\n" + caseTwoB); //output solutions 
		}
		
	}

}
