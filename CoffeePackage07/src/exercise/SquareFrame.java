/*
 * Title: SquareFrame
 * 
 * Tanuj Kumar (github: gyo-kuro)
 * 19 May 15
 * 
 * Finds all possible 3 x 3 squares out of the 7 x 7 sequential square,
 * Retrieves the sum then if the sum is 279, outputs the middle number
 * 
 */

package exercise;

public class SquareFrame {
	
	public static void main(String[] args) {
		
		// beginning square
		// find the sum
		// if not, iterate each item by one
		
		/*
		 * initial three rows
		 */
		
		int[] rowOne = {1, 2, 3};
		int[] rowTwo = {8, 9, 10};
		int[] rowThree = {15, 16, 17};
		int sum = 0; //initial sum
		int count = 0; //counter flag on/off
		
		while (count == 0) {
			
			/*
			 * find sum
			 */
			
			for (int i=0; i < 3; i++) {
				sum = sum + rowOne[i] + rowTwo[i] + rowThree[i];
			}
			
			//System.out.println(sum);
			
			/*
			 * checksum if 279
			 */
			
			if (sum == 279) {
				System.out.println("The middle number:");
				System.out.println(rowTwo[1]); //if sum 279, output center number
				sum = 0; //reset sum
				if (rowOne[2] == 35) {
					
					count = 1; //flag off terminate while when at the final 3 x 3 grid
					System.out.println("Terminated.");
					
				} else if (rowOne[2] % 7 == 0) {

					for (int j = 0; j < 3; j++) {
						rowOne[j] = rowOne[j] + 3;
						rowTwo[j] = rowTwo[j] + 3;
						rowThree[j] = rowThree[j] + 3;
					} //add 3 to each to move 3 x 3 grid if on right edge
					
				} else {
					
					for (int k = 0; k < 3; k++) {
						rowOne[k] = rowOne[k] + 1;
						rowTwo[k] = rowTwo[k] + 1;
						rowThree[k] = rowThree[k] + 1;
					
					} //add 1 to each to move 3 x 3 grid once to the right
				
				}
			} else {
				sum = 0; //reset sum 
				if (rowOne[2] == 35) {
					
					count = 1; //terminate while when at the final 3 x 3 grid
					System.out.println("Terminated.");
					
				} else if (rowOne[2] % 7 == 0) {

					for (int j = 0; j < 3; j++) {
						rowOne[j] = rowOne[j] + 3;
						rowTwo[j] = rowTwo[j] + 3;
						rowThree[j] = rowThree[j] + 3;
					} //add 3 to each to move 3 x 3 grid if at the edge
					
				} else {
					
					for (int k = 0; k < 3; k++) {
						rowOne[k] = rowOne[k] + 1;
						rowTwo[k] = rowTwo[k] + 1;
						rowThree[k] = rowThree[k] + 1;
					
					} //add 1 to each to move 3 x 3 grid once to the right
				
				}
			
		}
		

		}
		
		
		
	}

}
