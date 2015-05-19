/*
 * Title: Fraction
 * 
 * Tanuj Kumar (github: gyo-kuro)
 * 19 May 2015
 * 
 * Code fragment that creates an array of Fraction type with 100 elements,
 * and adds an object of type Fraction with properties num = x den = x + 1 to the array
 * 
 */

package exercise;

public class Fraction { //default class 

	private int num;
	private int den;
	
	public Fraction(int n, int d) { //basic constructor
		num = n;
		den = d;
	}
	
	public static void main(String[] args) {
		
		Fraction[] multiFract = new Fraction[100]; // fraction array with 100 elements
		
		for (int i = 0; i < multiFract.length; i++) { 
			multiFract[i] = new Fraction(i, i+1); 
			/*
			 * iterate through array
			 * each element "i" of multiFract[i] now references a Fraction object 
			 * i/i+1
			 */
		}
	}
}
