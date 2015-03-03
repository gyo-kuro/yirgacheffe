// ModuloTest (Exercise2) 
//
// Tanuj Kumar (github: gyo-kuro)
// 03 Mar 15
// 
// Takes three numbers: two numbers to compare and an answer
// The program uses modulo division to check and see if the answer is the modulo quotient
// Of the first two numbers
// If correct, prints congratulations
// If not, prints the answer and a reminder
//

package exercise;
import atelier.*;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P.ask("Please enter your first number: ");
		int numOne = In.getInt(); // enters first integer
		P.ask("Please enter your second number: ");
		int numTwo = In.getInt(); // enters second integer
		P.ask("Good! What is the answer?");
		int numAns = In.getInt(); // enters predicted answer
		P.flavo("Testing ...");
		testModulo(numOne,numTwo,numAns);

	}
	
	public static String testModulo( int num1, int num2, int num3 ) {
		// method checking the modulo value 
		int modValue = num1 % num2;
		if (modValue == num3) {
			// if the third variable equals the modulo quotient of the first and second variable
			// output and return message with the modulo value
			String good = "Congratulations! " + modValue + " is the answer!";
			System.out.println(good);
			return good;
		} else {
			// else output and return a consolation message
			// include modulo value and how to do modulo division
			// return value
			String bad = "Sorry! That is not correct. The actual answer is " + modValue + ". \nRemember that modulo is finding the REMAINDER.";
			System.out.println(bad);
			return bad;
		}
		
		
	}

}
