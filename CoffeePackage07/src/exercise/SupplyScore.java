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
import java.util.*;


public class SupplyScore {
	
	public static void main(String[] args) {
		
		List<Integer> markList = new ArrayList<Integer>();
		
		System.out.println("Input your integer.");
		int mark = In.getInt();
		
		while (mark >= 0) {
			if (mark > 10) {
				System.out.println("Input your integer.");
				mark = In.getInt();
			} else {
				markList.add(new Integer(mark));
				System.out.println("Input your integer.");
				mark = In.getInt();
			}
		}
		
		int[] markArray = new int[markList.size()];
		
		for (int i = 0; i < markList.size(); i++ ) {
			
			markArray[i] = markList.get(i);
			
		}
		
		int zero = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int seven = 0;
		int eight = 0;
		int nine = 0;
		int ten = 0;
		
		for (int j = 0; j < markArray.length; j++) {
			
			switch(markArray[j]) {
			
			case 0: zero++;
				break;
				
			case 1: one++;
				break;
				
			case 2: two++;
				break;
				
			case 3: three++;
				break;
				
			case 4: four++;
				break;
				
			case 5: five++;
				break;
				
			case 6: six++;
				break;
				
			case 7: seven++;
				break;
				
			case 8: eight++;
				break;
				
			case 9: nine++;
				break;
	
			default: ten++;
				break;
					
			}
			
			
		}
		
		double count = 0;
		
		for (int k = 0; k < markArray.length; k++) {
			count = count + markArray[k];
		}
		
		System.out.println("score              # of Occurrences:");
		System.out.println("0                  "+zero+"\n"+
							"1                  "+one+"\n"+
							"2                  "+two+"\n"+
							"3                  "+three+"\n"+
							"4                  "+four+"\n"+
							"5                  "+five+"\n"+
							"6                  "+six+"\n"+
							"7                  "+seven+"\n"+
							"8                  "+eight+"\n"+
							"9                  "+nine+"\n"+
							"10                 "+ten+"\n");
		
		System.out.println("Mean Score: " + Rounder.roundOne((double)(count/markArray.length)));
		
	}


}
