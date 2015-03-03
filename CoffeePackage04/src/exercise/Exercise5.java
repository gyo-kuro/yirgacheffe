// RahmaniaPostOffice (Exercise5) 
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes a mass of a package and uses a system of if statements
// To output the cost based on preconceived price states.
//

package exercise;
import atelier.*;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your package mass: ");
		double mass = In.getFloat();
		if (mass <= 30.0) {
			System.out.println("40 sinas.");
		} else if (mass > 30.0 && mass <= 50.0 ) {
			System.out.println("55 sinas.");
		} else if (mass > 50.0 && mass <= 100.0) {
			System.out.println("70 sinas.");
		} else {
			double addition = (int)((mass - 100)/50);
			double addSina = 70 + addition * 25;
			System.out.println(addSina + " sinas.");
		}
	}

}
