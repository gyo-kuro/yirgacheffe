// FiveRounds (Exercise5) - Takes Two Numbers and Sends Them Through a Math Tumbler
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes TWO INPUTS, numONE and numTWO, and then applies and outputs the
// following operations to them:
// Addition (numOne + numTwo)
// Subtraction (numOne - numTwo)
// Multiplication (numOne * numTwo)
// Division (numOne / numTwo) (with special clauses for indeterminate/undefined forms)
// Exponentation (numOne ^ numTwo) 
//
// extraneous notes: 
// java's symbols for && and || are really quite elegant! 
// 

package stones;

import atelier.*;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter two numbers. ");
		double numOne = In.getDouble();
		double numTwo = In.getDouble();
		
		System.out.println("Sum: " + (numOne + numTwo));
		System.out.println("Difference: " + (numOne - numTwo));
		System.out.println("Product: " + (numOne * numTwo));
		if (numTwo == 0 || (numOne == 0 && numTwo == 0)) {
			System.out.println("Difference: undefined or indeterminate");
		} else {
			System.out.println("Difference: " + (numOne / numTwo));
		}
		System.out.println("Exponent: " + (Math.pow(numOne, numTwo)));
	}

}
