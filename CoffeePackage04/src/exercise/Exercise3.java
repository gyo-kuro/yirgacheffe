// ThreeSorter (Exercise3) 
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes three integers a, b, c
// Uses a system of if-then-else statements to add the integers
// Into an array in lowest-to-highest order,
// Then loops through the array and prints out the numbers.
//

package exercise;
import atelier.*;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.ask("Please enter the first number: ");
		int a = In.getInt(); // enter first integer
		P.ask("Please enter the second number: ");
		int b = In.getInt(); // enter second integer
		P.ask("Please enter the third number: ");
		int c = In.getInt(); // enter third integer
		threeSorter(a,b,c);
	} 
	
	public static void threeSorter(int num1, int num2, int num3) {
		// sorting method that orders three numbers from lowest to highest
		if (num1 == num2 || num1 == num3 || num2 == num3) {
			System.out.println("Please use three different numbers!");
			// if any numbers are same, redo
		}
		int[] threeArray = new int[3]; // create an array for the three numbers
 		if (num1 < num2 && num1 < num3) {
			threeArray[0] = num1;
			// if num1 < 2 and 3 then num1's value goes first in array
			if (num2 < num3) {
				threeArray[1] = num2;
				threeArray[2] = num3;
			} else {
				threeArray[1] = num3;
				threeArray[2] = num2;
			} // other two numbers are sorted based on if the other is greater/lesser
 		} else if ((num1 < num2 && num1 > num3) || (num1 < num3 && num1 > num2) ) {
 			threeArray[1] = num1; // add num1 to the middle if greater than one but less than the other
 			if ((num2 < num3) && (num2 < num1)) {
 				threeArray[0] = num2;
 				threeArray[2] = num3;
 			} else {
 				threeArray[0] = num3;
 				threeArray[2] = num2;
 			} // other two numbers are sorted based on if number 2 is less than either
		} else {
			threeArray[2] = num1;
			// if no other criteria fit, number 1 must be greatest, thus goes last
			if (num2 < num3) {
				threeArray[0] = num2;
				threeArray[1] = num3;
			} else {
				threeArray[0] = num3;
				threeArray[1] = num2;
			} // other two numbers sorted based on which one is lesser
		}
 		
 		for (int i=0;i<3;i++) {
 			System.out.println(threeArray[i]);
 		} // loop through the array and output the values
		
	}

}
