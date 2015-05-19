/*
 * Title: SupplyScore
 * 
 * Tanuj Kumar (github: gyo-kuro)
 * 19 May 15
 * 
 * Takes an indefinite amount of inputs and then records the frequencies of these scores while 
 * calculating the overall mean
 */

package exercise;

import atelier.*;

public class SupplyScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * basic variables
		 */
		
		int[] scoreArray = new int[11]; //init array of 11 elements (0 to 10 inclusive)
		double count = 0.0; //mean divisor based on total scores
		double sum = 0.0; //total sum
		
		/*
		 * frequency iteration
		 */
		
		System.out.println("Enter.");
		int i = In.getInt(); //initial value
		
		while (i >= 0) { //indefinite input 
			if (i > 10) { //if i greater than 10, score not possible
				System.out.println("Not a possible score.");
				i = In.getInt();
			} else { 
				scoreArray[i] = scoreArray[i] + 1; //increase frequency of score "i" showing up in array
				count++; //increase counter by one
				System.out.println("Enter.");
				i = In.getInt();
			}
			
		}
		
		/*
		 * total sum iteration
		 */
		
		for (int k = 0; k < scoreArray.length; k++) {
			sum = sum + (scoreArray[k]*k);
		}
		
		/*
		 * table constructor
		 */
		
		System.out.println("score              # of Occurrences:");
		System.out.println("0                  "+scoreArray[0]+"\n"+
							"1                  "+scoreArray[1]+"\n"+
							"2                  "+scoreArray[2]+"\n"+
							"3                  "+scoreArray[3]+"\n"+
							"4                  "+scoreArray[4]+"\n"+
							"5                  "+scoreArray[5]+"\n"+
							"6                  "+scoreArray[6]+"\n"+
							"7                  "+scoreArray[7]+"\n"+
							"8                  "+scoreArray[8]+"\n"+
							"9                  "+scoreArray[9]+"\n"+
							"10                 "+scoreArray[10]+"\n"); 
		
		/*
		 * mean output
		 */
		
		System.out.println("Mean score: " + Rounder.roundOne((double)(sum/count)));

	}

}
