package fermat;

//DegreeDisintegration (Exercise7) - Takes a decimal degree and converts it to equivalent degrees/minutes/seconds
//
//Tanuj Kumar (github: gyo-kuro)
//24 Feb 15
//
//Takes a degree, uses rounding and integer output 
//Outputs degrees, minutes, seconds
//


import atelier.*;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.ask("Enter degree: "); //personal ask class
		float degreeNum = In.getFloat(); //take degree
		int degree = (int)degreeNum; //degree number = whole number degree (integer)
		int minute = (int)Rounder.roundOne((Rounder.roundTwo(degreeNum - degree) * 60)); 
			//minute number = subtracts decimal section from degree and rounds
			//multiplies by 60 and rounds before converting to int
		int second = (int)Rounder.roundOne(((Rounder.roundTwo(degreeNum - degree) * 60) - minute) * 60);
			//second number = subtracts decimal section from degree and rounds then multiplies by 60
			//subtracts minute for this and multiplies again by 60 before rounding and converts to int
		
		System.out.println(degree + " degrees " + minute + " minutes " + second + " seconds "); //output 
	}

}
