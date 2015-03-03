// ProblemGauntlet2 (Exercise1) 
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Generates 4 RANDOM VALUES (1 to 1000) and asks the user to answer five different
// equation arrangements with these 4 random values. The user inputs an answer and
// the computer will output their answer alongside the user's answer, showing whether
// or not the user was correct.
//


package exercise;

import atelier.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double randa = Rounder.roundTwo(Math.random() * 1000 + 1); // random number generator
		double randb = Rounder.roundTwo(Math.random() * 1000 + 1); // random number generator
		
		double randc = Rounder.roundTwo(Math.random() * 1000 + 1); // random number generator
		double randd = Rounder.roundTwo(Math.random() * 1000 + 1); // random number generator
		
		System.out.println("PLEASE ROUND TO ONE DECIMAL PLACE."); // to prevent insanity
		
		boolean resultOne = eqnOne(randa, randb); // result one method
		System.out.println(truthCheck(resultOne)); // result one check
		boolean resultTwo = eqnTwo(randc, randd); // result two method
		System.out.println(truthCheck(resultTwo)); // result two check
		boolean resultThree = eqnThree(randa, randd); // result three method
		System.out.println(truthCheck(resultThree)); // result three check
		
		System.out.println("CONGRATULATIONS.");
		System.out.println("THANK YOU FOR PLAYING. ");
		// end

	}
	
	public static boolean eqnOne(double xPlace, double yPlace) {
		double eqnOneRx = xPlace + yPlace + (yPlace/2); // first equation
		System.out.println(xPlace + " + " + yPlace + " + " + "(" + (yPlace + "/2" ) + ")"); // printed values
		double eqnResult = In.getDouble(); // get result 
		// check result
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnOneRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnOneRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnOneRx));
			return false;
		}
		// returns true or false based on if-else
	}
	
	public static boolean eqnTwo(double xPlace, double yPlace) {
		double eqnTwoRx = (xPlace * yPlace) + (xPlace * yPlace); // second equation
		System.out.println("( " + xPlace + " * " + yPlace + " )" + " + " + "( " + xPlace +  " * " + yPlace + " )"); // printed values
		double eqnResult = In.getDouble(); // get result
		// check result
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnTwoRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnTwoRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnTwoRx));
			return false;
		}
		// returns true or false based on if-else
	}
	
	public static boolean eqnThree(double xPlace, double yPlace) {
		double eqnThreeRx = (xPlace/yPlace) + yPlace; // third equation
		System.out.println("( " + xPlace + " / " + yPlace + " )" + " + " + yPlace); // printed values
		double eqnResult = In.getDouble(); // get result
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnThreeRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnThreeRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnThreeRx));
			return false;
		}
		// returns true or false based on if-else
	}
	
	public static String truthCheck(boolean result) {
		// takes in a true/false based on the other three methods
		if (result == true) {
			return "That is correct.";
		} else {
			return "That is incorrect.";
		}
		// returns a string defining if it is correct or incorrect 
	}

}
