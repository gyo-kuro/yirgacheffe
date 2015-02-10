// MeanTrinity (Exercise2) - The Average of Three
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes THREE NUMERICAL INPUTS and OUTPUTS THEIR MEAN (AVERAGE)
//
// extraneous notes: 
// No rounding of values: this is due to rounding being a component of Exercise 4.
// 

package stones;

import atelier.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input three decimal numbers.");
		double numOne = In.getDouble();
		double numTwo = In.getDouble();
		double numThree = In.getDouble();
		
		double numAvg = ((numOne + numTwo + numThree)/3);
		
		System.out.println("The average is " + numAvg);
		
	}

}
