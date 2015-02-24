package exercise;

//SeparateFour (Exercise1) - Takes a 4 Digit Number and prints out its digits
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Takes ONE INPUT, sends it through a loop that 
//extracts out the individual digits using modulo and integer division,
//then adds them to a list, and prints out a statement with the
//list indices
//
//

import atelier.*;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int moduloFlag = 10000;
		//variable used in modulo division; changes based on digit place
		
		P.ask("Please enter a 4 digit number: "); //personal ask class
		int insertValue = In.getInt(); //four digit integer insert
		int length = String.valueOf(insertValue).length(); //length of integer
		int[] valueArray = new int[4]; //creation of empty array to be filled with digits
		
			if (length == 4 && insertValue >= 1000) {
				//continue if the length is 4 and the integer is greater than 1000
				for (int i=0;i<4;i++) {
					int setValue = (insertValue%moduloFlag)/(moduloFlag/10); 
					//setValue is the individual digit to be added to the array
					//setValue is equal to the integer modulo-div'd by moduloFlag, then divided by 
						//moduloFlag/10
					valueArray[i] = setValue;
					//index i = the digit of the integer acquired
					moduloFlag /= 10;
					// decrease moduloFlag by a factor of 10
				}
				
				System.out.println("The digits of " + insertValue + " are " + valueArray[0] + ", "
						+ valueArray[1] + ", " + valueArray[2] + ", and " + valueArray[3]);
				//output
				
			} else {
				System.out.println("Please enter a valid 4 digit number.");
				//NaN catch; number != 4 digits catch
			}
	}

}
