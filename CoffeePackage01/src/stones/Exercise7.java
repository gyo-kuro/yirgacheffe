// AgeCalculator (Exercise7) - Calculates the Year at 25, 50, 75
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes a NAME, AGE, and CURRENT YEAR as INPUT
// Uses these to calculate BIRTH YEAR and YEAR AT WHICH ONE IS 25, 50, AND 75
// Delivers a PERSONALIZED MESSAGE using the NAME
//
// extraneous notes: 
// s-senpai
// 

package stones;

import atelier.*;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("H-hello!! /// I can t-tell you what year it will be when \nyou are 25, 50, and 75 years old!");
		System.out.println("P-please input your name!");
		String name = In.getString();
		System.out.println("T-thank you! \nPlease input your age!!");
		long age = In.getLong();
		System.out.println("You're so young!! Thank you!");
		System.out.println("I- I don't remember what the year is right now ... what is it?");
		long currentYear = In.getLong();
		
		long birthYear = currentYear - age;
		System.out.println(name + " will be 25 in " + (birthYear + 25) + "! Seize your youth!");
		System.out.println(name + " will be 50 in " + (birthYear + 50) + "! Try to hide in the bunkers!");
		System.out.println(name + " will be 75 in " + (birthYear + 75) + "! You might be a robotic consciousness by then!");
	}

}
