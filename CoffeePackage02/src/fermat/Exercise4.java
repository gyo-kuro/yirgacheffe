package fermat;

//TimeSets (Exercise4) - Takes hours, minutes, seconds, and outputs the result as hours
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Input hours, minutes, and seconds
//Divide minutes by 60 and seconds by 3600 and sum with hours
//Output the hours
//


import atelier.*;

public class Exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		P.ask("Enter hours: "); //personal ask class
		double hour = In.getDouble(); //input hours
		P.ask("Enter minutes: ");
		double min = In.getDouble(); //input minutes
		P.ask("Enter seconds: ");
		double sec = In.getDouble(); //input seconds
		
		double hourOutput = hour + (min/60) + (sec/3600); //total sum
		
		System.out.println(Rounder.roundTwo(hourOutput) + " hours"); //output
	}

}
