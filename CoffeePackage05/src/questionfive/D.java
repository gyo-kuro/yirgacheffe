// Q5 - RabbitPop
//
// Tanuj Kumar (github: gyo-kuro)
// 11 Mar 15
// 
// Takes an initial population, doubling time, and day to check, and outputs the population
// on the day checked.

package questionfive;
import atelier.*;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// break down the formula A = A0 * 2^(t/d) 
		
		P.ask("Please enter the initial population. ");
		long islandPop = In.getLong(); // A0
		P.ask("Please enter the day number when the population will double. ");
		double doubleDay = In.getDouble(); // d
		P.ask("Please enter the day to check the population. ");
		double dayFinal = In.getDouble(); // t
		
		
		double dummyDouble = (Math.pow(2,(dayFinal/doubleDay))); // 2^(t/d)
		double finalPop = 0; // final population placing variable -- counter (A - final pop)
		
		for (double day=0; day<(islandPop); day++) {
			finalPop += dummyDouble; // counting summation
		} // add dummyDouble to this islandPop times; add 2^(t/d) by A0 times; A0 * 2^(t/d) = A
		
		System.out.println("The population is " + Rounder.roundTwo(finalPop) + " individuals.");
	}

}
