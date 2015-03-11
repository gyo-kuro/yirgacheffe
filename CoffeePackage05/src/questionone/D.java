// Q1 - SymbolRepeat
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes a number and a symbol and outputs the symbol <number> times, and the number

package questionone;
import atelier.*;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = ""; //empty string
		P.ask("Number of symbols?");
		int symbolNum = In.getInt(); //get number of symbols
		P.ask("Symbol to use?");
		String symbolType = In.getString(); //get symbol type
		if (symbolType.length() != 1) {
			System.out.println("Please enter one symbol."); //prevent multiple symbol entrance
		} else {
			for (int i=0;i<symbolNum;i++) {
				s += symbolType; //concatenate looped symbol to string symbolNum number of times
			}
			
			System.out.println(symbolNum + " " + s); // output
		}
	}

}
