package fermat;

//DecimalRounder (Exercise2) - Rounds a number to a particular decimal place
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Inputs any number, (preferably a decimal)
//Uses integer division and Math.round to round
//Checked with the normal rounder class
//


import atelier.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter your number: ");
		double toRound = In.getDouble(); //entered number
		System.out.println("Enter how many decimal values you want to round to: ");
		long initialDecim = In.getLong(); //number of decimal places to round to
		double basedDecim = Math.pow(10, initialDecim); //10 to the power of the number of decimals wanted
		
		double roundDecim = (double)(Math.round(toRound * basedDecim))/(basedDecim);
		//rounded number outputs as a double after being rounded and divided by the 10^initialDecim power
		
		System.out.println("Rounded value is: " + roundDecim + 
				" rounded to " + initialDecim + " decimal places."
				); 
		//normal output
		
		System.out.println("The system is verifying with Rounder . . .");
		//personal class: rounder verification
		
		double roundCheck = Rounder.roundMulti(toRound,initialDecim); //personal class: rounder
		System.out.println("Rounder's output was: " + roundCheck);
		
		if (roundCheck == roundDecim) {
			System.out.println("The rounding was successful."); //if rounding succeeds
		} else {
			System.out.println("The rounding was unsuccessful."); //if rounding fails
		}

	}

}
