package fermat;

//TenValues (Exercise1) - Takes a 4 Digit Number and prints out its digits
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Directly outputs combinations of 1, 6, 7, 8 that equal all numbers from 0 to 10
//


public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(
				
				"(6/8) + (1/7) = " + ((6/8)+(1/7)) + "\n" +
				"(8/6) + (1/7) = " + ((8/6)+(1/7)) + "\n" +
				"(8+6) / (7/1) = " + ((8+6)/(7/1)) + "\n" +
				"6 / ((8-7)+1) = " + (6 / ((8-7) + 1)) + "\n" +
				"(6-1) - (8/7) = " + ((6-1)-(8/7)) + "\n" + 
				"(6*1) - (8-7) = " + ((6*1)-(8-7)) + "\n" +
				"(6*1) * (8-7) = " + ((6*1)*(8-7)) + "\n" +
				"(6/8) + (7/1) = " + ((6/8)+(7/1)) + "\n" +
				"(8/6) + (7/1) = " + ((8/6)+(7/1)) + "\n" +
				"(7/6) + (8/1) = " + ((7/6)+(8/1)) + "\n" +
				"(7/6) + (8+1) = " + ((7/6)+(8+1)) 
				
				); //prints out all equations and associated answers
		
	}

}
