package fermat;

//DecimalRounder2 (Exercise3) - Rounds a number to a particular decimal place with additions
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Equivalent to exercise 2 but including rounding before the decimal
//

import atelier.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your number: ");
		double toRound = In.getDouble(); //number to round 
		System.out.println("If you wish to round to a decimal: \n"
				+ "Before the decimal (e.g. hundreds), type 1 \n"
				+ "After the decimal (e.g. tenths), type 0");
		int check = In.getInt(); //takes 0 or 1 on the decision path to decide whether to round before/after decimal
		
		System.out.println("Enter how many decimal values you want to round to: ");
		long initialDecim = In.getLong(); //same as ex 2 (number of values)
		long rounderDecim = initialDecim; //needed for the before-decimal case
		double basedDecim = 1; //initiated variable, defined at 1 by default for error check
		
		switch (check) {
			case 0: //if after the decimal, the 10^initialDecim case is the dividing factor
				basedDecim = Math.pow(10, initialDecim);
				break;
			case 1: //if before the decimal, rounderDecim is set to -1 and 10^rounderDeci is the dividing factor
				rounderDecim = 0 - initialDecim;
				basedDecim = Math.pow(10, rounderDecim);
				break;
			default: //if not 0 or 1
				System.out.println("Type 0 or 1.");
				break;
	}

		
		double roundDecim = (double)(Math.round(toRound * basedDecim))/(basedDecim); //rounded number; same as ex2
		
		System.out.println("Rounded value is: " + roundDecim + 
				" rounded to " + initialDecim + " decimal places."
				); 
		
		System.out.println("The system is verifying with Rounder . . .");
		//same verification process as ex2
		
		double roundCheck = Rounder.roundMulti(toRound,rounderDecim);
		System.out.println("Rounder's output was: " + roundCheck);
		
		if (roundCheck == roundDecim) {
			System.out.println("The rounding was successful.");
		} else {
			System.out.println("The rounding was unsuccessful.");
		}

	}

}
