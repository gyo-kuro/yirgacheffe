package fermat;

//RunwayNumber (Exercise5) - Takes a bearing and gives the runway number
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Inputs a degree between 0 or 360
//Outputs the corresponding runway number (integer division by 10)
//


import atelier.*;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P.ask("Enter the bearing, in degrees: ");
		float degree = In.getFloat(); //input degrees
		
		if (degree < 0 || degree > 360) {
			System.out.println("Please enter a valid bearing."); //no degrees smaller or larger than 0/360 as necessary
		} else {
			double roundDegree = Rounder.roundMulti(degree,-1); //personal rounder class to round degree to whole tens
			System.out.println("Runway number: " + (int)(roundDegree/10)); //integer divide by 10 and output
		}

		
	}

}
