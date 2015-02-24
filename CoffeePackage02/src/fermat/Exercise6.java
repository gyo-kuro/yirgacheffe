package fermat;

//ThreeDigitSum (Exercise6) - Gives sum of three digits in a three-digit-number
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Takes three digit number, checks length and sign
//Extracts digits and sums them then outputs this
//


import atelier.*;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.ask("Please enter a positive integer of 3 digits long. Decimals will be automatically truncated out."); //personal ask class
		int threeDigit = In.getInt(); //input 3 digit number
		int length = String.valueOf(threeDigit).length(); //length of digit variable
		if (length == 3 && threeDigit > 0) { //continues if length = 3 and not negative
			int hunDigit = threeDigit / 100; //hundreds digit extraction
			int tenDigit = (threeDigit % 100)/10; //tens digit
			int oneDigit = threeDigit - ((hunDigit*100) + (tenDigit*10)); //ones digit extraction
			
			System.out.println("The sum of digits is: " + (hunDigit + tenDigit + oneDigit)); //output sum

		} else {
			P.flavo("Please retry and enter a positive integer of 3 digits."); //personal flavour text class; NaN catch else statement
		}

	}

}
