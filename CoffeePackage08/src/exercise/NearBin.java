/* Question 1: NearBin
*
* Tanuj Kumar (github: gyo-kuro)
* 28 May 15
* 
* Takes the existing binary sort algorithm and adds the conditions
* that outputs the closest index value to a number not in the list
* 
*/

package exercise;

public class NearBin {
	
public static int binary ( double[] list, double item ) {
		
		int bottom = 0;
		int top = list.length - 1;
		int middle;
		boolean found = false;
		
		int location = -1; // location checker if item not in list
		
		double[] tempArray = new double[list.length]; // array for abs(differences)
		int temp = 0; //temp holder
		
		while (bottom <= top && !found) {
			
			middle = (bottom + top)/2; // middle assigned to the middle index of list
			
			if (list[middle] == item) {
				location = middle; // if found, break while loop
				found = true;
			} else if (list[middle] < item) {
				bottom = middle + 1; // move bottom up by the middle + 1: exclude the lessers
			} else {
				top = middle - 1; // move top down by the middle - 1: exclude the greaters
			}
		}
		
		if (location == -1) { // condition defining when item nto found
			
			for (int i=0; i < list.length; i++ ) {
				tempArray[i] = Math.abs(list[i] - item);
			} // adds the abs(differences) of the list's original items and the missing item

			
			for (int j=0; j <list.length; j++) {
				if (tempArray[j] <= tempArray[j+1] ) { 
					temp = j;
					break;
				} 
			}
			// go through the list of abs(differences), and compare two values at once
			// the minute that the value to the right of the current value is greater
			// this means the difference is greater
			// since this is an ordered list, it means the minimum difference is currently j
			// therefore the closest value to the missing value is equivalent to the index j
			// set temp to j and break
			
			location = temp; // location is now the closest value to the missing value

		}
		
		return location;
		
}

public static void main(String[] args) {
	
	double[] testlist = {16, 19, 22, 24, 27, 29, 37, 40, 43, 44, 45, 47, 52, 56, 60, 64};
	
	System.out.println(binary(testlist,46));
}

}
