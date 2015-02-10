// RectCalcs - Calculating the Perimeter and Area of Rectangles
//
// Tanuj Kumar (github: gyo-kuro)
// 09 Feb 15
// 
// Takes TWO INPUTS length and width, uses these to calculate the area and perimeter 
// Of the associated rectangle
//
// extraneous notes: 
// "get rekt"
//

package stones;

import atelier.*;

public class RectCalcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the length: ");
		double length = In.getDouble();
		System.out.println("Enter the width: ");
		double width = In.getDouble();
		
		double perimeter = (2 * length) + (2 * width);
		double area = (length * width);
		
		System.out.println("The perimeter of the rectangle is: " + Rounder.roundTwo(perimeter) + " units");
		System.out.println("The area of the rectangle is: " + Rounder.roundTwo(area) + " units squared");
	}

}
