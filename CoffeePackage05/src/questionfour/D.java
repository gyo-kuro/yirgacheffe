// Q4 - WaveState
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes a wave height and wave number and outputs waves of the height and number.

package questionfour;
import atelier.*;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P.ask("Please input the WAVE HEIGHT below.");
		int height = In.getInt(); // input height
		P.ask("Please input the NUMBER OF WAVES below.");
		int wave = In.getInt(); // input wave number
		P.ask("Please input the SYMBOL below.");
		String symbol = In.getString(); // input symbol
		
		int y=1; // placeholder variable flag (will increase and decrease per loop)
		
		if (height < 0 || wave < 0) {
			System.out.println("Please enter a valid number."); //error catcher
		} else {
			
		// ENTIRE WAVE (REPEAT BY THE NUMBER OF HEIGHT = HEIGHT = NUMBER OF ROWS OUTPUT)
		
		for (int counter=0; counter<height; counter++) {
			
			String s = ""; //initial single wave row unit
			String repeat = ""; //multiple wave row units repeated together <wave number> times
			
			// UNIT 
			
			for (int i=1; i<(height*2)+1; i++){
				if (i > height-y && i < height+(y+1)) {
					s += symbol; //add a symbol to the empty string if greater than height-y or less than height(y+1)
				} else {
					s += " "; // if not, add a space 
				}
			} // this loop creates the individual units per row
			
			// ROW OF UNITS
			
			for (int j=0; j<wave; j++) {
				repeat += s;
			} // this loop repeats the individual units, forming multiple rows of individual units:  ## ## ## ## for row 1 eg
			
			System.out.println(repeat); // print out the current line of repeated units
			y += 1; // increment the placeholder by 1 (changes how many symbols will be in a unit)
			
		}
		



	}
		
	}

}
