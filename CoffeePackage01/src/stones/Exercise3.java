// ReportCard - A Quartet of Four Marks and a Blinding Average
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes FOUR NUMERICAL INPUTS ("marks") and CALCULATES THE AVERAGE
// 
// extraneous notes:
// No rounding due to exercise 4. Vocabulary here uses mark-related words
// 

package stones;

import atelier.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input four marks.");
		double numOne = In.getDouble();
		double numTwo = In.getDouble();
		double numThree = In.getDouble();
		double numFour = In.getDouble();
		double markAvg = ((numOne + numTwo + numThree + numFour)/4);
		
		System.out.println("Your mark average is " + markAvg);
		
	}

}
