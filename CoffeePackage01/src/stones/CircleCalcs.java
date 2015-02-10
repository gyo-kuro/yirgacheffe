// CircleCalcs - Calculating the Circumference and Area of Circles
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes ONE INPUT radius, uses this to calculate the circumference and area
// Of the associated circle
//
// extraneous notes: 
// eclipse's extreme bolding of math.PI looks like it is going to kill me
// 


package stones;

import atelier.*;

public class CircleCalcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the radius: ");
		double radius = In.getDouble();
		
		double circ = 2 * Math.PI * radius;
		double area = Math.PI * Math.pow(radius, 2);
		
		System.out.println("The circumference of the circle is: " + Rounder.roundTwo(circ) + " units");
		System.out.println("The area of the circle is: " + Rounder.roundTwo(area) + " units squared");
		
	}

}
