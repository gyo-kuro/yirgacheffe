// TrinitySum (Exercise1) - Summing Three
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes THREE NUMERICAL INPUTS and OUTPUTS THEIR SUM
//
// extraneous notes: 
// brackets not required: order of operations not affected
// 

package stones;

import atelier.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input three numbers.");
		double numOne = In.getDouble();
		double numTwo = In.getDouble();
		double numThree = In.getDouble();
		double numSum = numOne + numTwo + numThree;
		System.out.println(numSum);
	}

}

