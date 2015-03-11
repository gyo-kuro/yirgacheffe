// Q3 - NumberRows
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Queries multiple times: takes numbers and outputs their hundreds, tens, and ones.

package questionthree;
import atelier.*;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.ask("Enter the number of repeats: ");
		int numberRepeats = In.getInt(); // how many rounds 
		for (int u = 0; u < numberRepeats; u++) { // repeat the following by number of rounds
			
			P.ask("Enter number:");
			int numExpand = In.getInt(); // get the number to check
			if ((numExpand/1000) > 0) {
				System.out.println("Please use a 1 to 3 digit number."); // error catch if number > 999 or 3 digits
			} else if (numExpand < 10 && numExpand > 0) { // error catch if number is 1 digit
				
				if (numExpand == 1) {
					System.out.println(numExpand + " has " + numExpand + " one.");
				} else {
					System.out.println(numExpand + " has " + numExpand + " ones.");
				}
				
			} else {
			
				int hunds = numExpand/100;
				int tens = (numExpand-((numExpand/100)*100))/10;
				int place = (numExpand/100)*100;
				int ones = ( numExpand%(place + ((numExpand-place)/10)*10) );
				// various mathematics used to isolate for each place
				
				// initialized strings
				String hunText;
				String tenText;
				String oneText;
				
				// HUNDREDS GRAMMAR
				if (hunds == 1) {
					hunText = hunds + " hundred ";
				} else if (hunds == 0) {
					hunText = "";
				} else {
					hunText = hunds + " hundreds ";
				}
				
				// TENS GRAMMAR - multiple cases needed in case hundreds and ones but no tens (fixing grammar)
				if (tens == 1) {
					if (ones != 0) {
						if (hunds == 0) {
							tenText = tens + " ten ";
						} else {
							tenText = "and " + tens + " ten ";
						}
					}
					
					else {
						if (hunds == 0) {
							tenText = tens + " ten ";
						} else {
							tenText = "and " + tens + " ten ";
						}
					}
				} else if (tens == 0) {
					tenText = "";
				} else {
					if (ones != 0) {
						tenText = tens + " tens ";
					}
					
					else {
						
						if (hunds == 0) {
							tenText = tens + " tens ";
						} else {
							tenText = "and " + tens + " tens ";
						}
						
					}
				}
				
				// ONES GRAMMAR				
				if (ones == 1) {
					oneText = "and " + ones + " one";
				} else if (ones == 0) {
					oneText = "";
				} else {
					oneText = "and " + ones + " ones";
				}
							
			
				System.out.println(numExpand + " has " + hunText + tenText + oneText + "."); //output
		}
		
		
		}
	}

}
