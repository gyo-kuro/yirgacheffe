package exercise;

//MixedFraction (Exercise4) - Takes a 4 Digit Number and prints out its digits
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Takes TWO INPUTS, numerator and denominator
//Outputs the integer quotient (whole number) and the modulo quotient
//Over the denominator number. Uses a try/catch to error-proof.
//
//

import atelier.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			P.ask("Please enter the numerator: "); //personal ask class
			long numer = Long.parseLong(In.getString()); //takes string and parses to long (to catch NaN exceptions)
			P.ask("Please enter the denominator: ");
			long denom = Long.parseLong(In.getString()); //same as above with denom
			
			System.out.println(numer + "/" + denom + " is equal to "
					+ (numer/denom) + " and "
					+ (numer%denom) + "/" + (denom)); //output with direct integer/modulo division
			
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero occurred. Please retry.");
			//catches arithmetic exceptions: divisions by 0
		} catch (NumberFormatException e) {
			System.out.println("Error: A valid number was not entered. Please try again.");
			//catches number format exceptions: using an input that is not a number (NaN)
		}

	}

}
