// ProblemGauntlet (Exercise6) - Five Math Questions, or "A ~Method~ to the Madness"
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Generates 4 RANDOM VALUES (1 to 1000) and asks the user to answer five different
// equation arrangements with these 4 random values. The user inputs an answer and
// the computer will output their answer alongside the user's answer, showing whether
// or not the user was correct.
//
// extraneous notes: 
// + the special class Rounder was created in the atelier (import) package to help with rounding 
//   DecimalFormat converted to a String primitive type, which did not mesh with the numerical types
// + A METHOD TO THE MADNESS - this exercise's answer is a complex network of intertwined methods
//   was attempted as method practice (alongside the development of the Rounder class)
// + rest in peace
// 

package stones;

import atelier.*;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double randa = Rounder.roundTwo(Math.random() * 1000 + 1);
		double randb = Rounder.roundTwo(Math.random() * 1000 + 1);
		
		double randc = Rounder.roundTwo(Math.random() * 1000 + 1);
		double randd = Rounder.roundTwo(Math.random() * 1000 + 1);
		
		System.out.println("PLEASE ROUND TO ONE DECIMAL PLACE.");
		
		boolean resultOne = eqnOne(randa, randb);
		System.out.println(truthCheck(resultOne));
		boolean resultTwo = eqnTwo(randc, randd);
		System.out.println(truthCheck(resultTwo));
		boolean resultThree = eqnThree(randa, randd);
		System.out.println(truthCheck(resultThree));
		boolean resultFour = eqnFour(randb, randc);
		System.out.println(truthCheck(resultFour));
		boolean resultFive = eqnFive(randd, randb);
		System.out.println(truthCheck(resultFive));
		
		System.out.println("CONGRATULATIONS.");
		System.out.println("THANK YOU FOR PLAYING. ");

	}
	
	public static boolean eqnOne(double xPlace, double yPlace) {
		double eqnOneRx = xPlace + yPlace + (yPlace/2);
		System.out.println(xPlace + " + " + yPlace + " + " + "(" + (yPlace + "/2" ) + ")");
		double eqnResult = In.getDouble();
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnOneRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnOneRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnOneRx));
			return false;
		}
		
	}
	
	public static boolean eqnTwo(double xPlace, double yPlace) {
		double eqnTwoRx = (xPlace * yPlace) + (xPlace * yPlace);
		System.out.println("( " + xPlace + " * " + yPlace + " )" + " + " + "( " + xPlace +  " * " + yPlace + " )");
		double eqnResult = In.getDouble();
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnTwoRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnTwoRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnTwoRx));
			return false;
		}
	}
	
	public static boolean eqnThree(double xPlace, double yPlace) {
		double eqnThreeRx = (xPlace/yPlace) + yPlace;
		System.out.println("( " + xPlace + " / " + yPlace + " )" + " + " + yPlace);
		double eqnResult = In.getDouble();
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnThreeRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnThreeRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnThreeRx));
			return false;
		}
	}
	
	public static boolean eqnFour(double xPlace, double yPlace) {
		double eqnFourRx = ((xPlace - yPlace)/xPlace) * (yPlace);
		System.out.println("( " + "( " + xPlace + " - " + yPlace + " )" + " / " + xPlace + " )" + " * " + "( " + yPlace +  " )");
		double eqnResult = In.getDouble();
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnFourRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnFourRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnFourRx));
			return false;
		}
	}
	
	public static boolean eqnFive(double xPlace, double yPlace) {
		double eqnFiveRx = (xPlace + yPlace);
		System.out.println("( " + xPlace + " + " + yPlace + " )");
		double eqnResult = In.getDouble();
		if (Rounder.roundOne(eqnResult) == Rounder.roundOne(eqnFiveRx)){
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnFiveRx));
			return true;
		} else {
			System.out.println(Rounder.roundOne(eqnResult));
			System.out.println(Rounder.roundOne(eqnFiveRx));
			return false;
		}
	}
	
	public static String truthCheck(boolean result) {
		if (result == true) {
			return "That is correct.";
		} else {
			return "That is incorrect.";
		}
	}

}
