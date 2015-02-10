// Decimalization (Exercise4) - Taking 2 and 3 and Rouding to 1
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Combines the methods of Exercises 2 and 3 and presents them with a single 
// decimal digit rounding
//
// extraneous notes: 
// Rounder class was not used here because it had not been invented yet
// Unlike Exercise6, DecimalFormat works fine here because the output uses it
// in a concatenation of strings
// 

package stones;

import java.text.DecimalFormat;
import atelier.*;

public class Exercise4 {

	public static void main(String[] args) {
		DecimalFormat decim = new DecimalFormat("####.#");
		
		System.out.println("Please input three decimal numbers.");
		double numOne = In.getDouble();
		double numTwo = In.getDouble();
		double numThree = In.getDouble();
		
		double numAvg = ((numOne + numTwo + numThree)/3);
		
		
		System.out.println("The average of the three numbers is " + decim.format(numAvg));
		System.out.println("Please input your four marks.");
		
		double markOne = In.getDouble();
		double markTwo = In.getDouble();
		double markThree = In.getDouble();
		double markFour = In.getDouble();
		double markAvg = ((markOne + markTwo + markThree + markFour)/4);
		
		System.out.println("Your mark average is " + decim.format(markAvg));
		
	}

}
