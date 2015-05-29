/* Question 2: Median
*
* Tanuj Kumar (github: gyo-kuro)
* 28 May 15
* 
* Creates an array with the size provided by the user,
* Allows the user to input the values to be checked,
* Sorts the values into an ordered list, and finds the median
* 
*/

package exercise;
import atelier.*;

public class Median {
	
	public static double medianOf (int valueAmount) {
		
		double[] medianArray = new double[valueAmount]; //define an array size by the value amount set
		for (int i=0; i<valueAmount; i++) {
			System.out.println("Index: " + i);
			System.out.println("Insert a value: ");
			medianArray[i] = In.getDouble(); // for each item in the array, prompt for a value
		}
		CocktailShaker.shakerSort(medianArray); // sort into ordered list
		int middle = (valueAmount-1)/2; // the middle index of the array
		if (valueAmount % 2 == 0) {
			return (medianArray[middle] + medianArray[middle+1])/2.0; // if even, use this to find the avg 
		} else {
			return medianArray[middle]; // if odd, just find the middle value
		}
	}
	
	public static void main(String[] args){
		
		System.out.println(medianOf(5));
		
	}

}
