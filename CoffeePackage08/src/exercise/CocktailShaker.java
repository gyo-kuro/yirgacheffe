/* Question 3: CocktailShaker
*
* Tanuj Kumar (github: gyo-kuro)
* 28 May 15
* 
* Cocktail Shaker Sort algorithm:
* an improvement on the Bubble Sort that sorts forward and backward
* 
*/

package exercise;

public class CocktailShaker {
	
	public static void shakerSort (double[] list) {
		
		boolean sorted = false; // boolean checker
		int topOrig = list.length-1; // the original top length as reference
		
		for (int top = list.length-1; top > 0 && sorted == false; top-- ) {
			
			sorted = true; // auto set to true, if all sorted then the loop stops
			
			/* LEFT TO RIGHT */
			
			for (int i = Math.abs(topOrig-top); i < top; i++) { 
				// for loop will start an index more each time to compensate for the 
				// right-left sort's additions
				
				if (list[i] > list[i+1]) {
					
					// if greater than the next, switch values
					
					sorted = false; // not sorted
					
					// switcheroo:
					
					double tempOne = list[i];
					list[i] = list[i+1];
					list[i+1] = tempOne;
				}
			}
			
			/* RIGHT TO LEFT */
			
			for (int j = top-1; j > Math.abs(topOrig-top); j-- ) {
				// for loop starts at the top, and the top will decrease each time 
				// to compensate for the left-right sort's additions
				
				if (list[j] < list[j-1]) {
					
					// start from greatest, if right greater than left, switch
					
					sorted = false; // not sorted
					
					// switcheroo:
					
					double tempTwo = list[j];
					list[j] = list[j-1];
					list[j-1] = tempTwo;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		double[] newlist = {3, 7, 2, 9, 1};
		shakerSort(newlist);
		for (int x = 0; x < newlist.length; x++) {
			System.out.println(newlist[x]);
		}
		
	}

}
