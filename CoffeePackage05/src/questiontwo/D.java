// Q2 - Stairway to Heaven
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes an icon, an end, and a start, and outputs vertical ascending columns

package questiontwo;
import atelier.*;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inputs
		P.ask("Icon? ");
		String icon = In.getString(); //icon 
		P.ask("End?");
		int n = In.getInt(); //end point
		P.ask("Start? ");
		int start = 0; //placeholder
		int actualStart = In.getInt(); //start point
		
		//constants
		int z = 0;
		int y = n; //y is equal to the end point
		int checkStart = actualStart-1;
		String[] stringArray = new String[n+1]; //array to produce
		String s = ""; //empty string 
		
		if (start > n || n < start || start < 0 || n < 0) {
			System.out.println("Range issue.");
		} else {
			for (int i=0; i<n+1;i++) {
				
				for (int x=0; x<y; x++) {
					s+= " "; //add a space if not a symbol to be added
				}
				
				for (int j=0; j<z; j++) {
					s += icon; //add an icon if a symbol to be added
					
				}
				stringArray[i] = s;
				s = ""; //set index of the array to the current string 
				z += 1; //increment z
				y -= 1; //decrement y
			}
			
			String test = ""; //test string
			
			for (int w=0; w<checkStart; w++) {
				test += " "; //add spaces per the number of rows
			}
			
			for (int l=0; l<n-checkStart; l++) {
				test += icon; //add icons per the number of rows - 1
			}
			
			for (int q=start;q<n+1;q++) {
				if (q>=(n-(actualStart-1))) {
					System.out.println(test); //print out the test string
				} else {
					System.out.println(stringArray[q]); //loop through array and print out the strings in order
				}
				
			}
		}
		
		
	}

}
