package atelier;

public class Convert {
	
	// convert an integer to an array list
	
	public static void array( int testNum, int checkNum ) {
		int caseHolder = (int)Math.pow(10, (String.valueOf(testNum).length())-1);
		// STATIC: variable that takes an integer of the 10s power equal to the test number
		int caseTest; int caseDiv; 
		int minusHolder = String.valueOf(testNum).length();
		int caseMinusOne = caseHolder;
		// ALTER: value changes based on the initial caseHolder value
		int[] arrayRep= new int[String.valueOf(testNum).length()];
		// added to this array
		
		while (caseMinusOne > 0) {
			caseTest = testNum % (caseMinusOne * 10);
			// remainder of the test number and 10 times its multiple of 10
			caseDiv = caseTest/caseMinusOne;
			// empty variable caseDiv is now int quotient of the remainder and caseMinusOne
			arrayRep[(String.valueOf(caseMinusOne).length())-(minusHolder)] = caseDiv; 
			// added to array in appropriate place
			caseMinusOne /= 10;
			// change 10s
			minusHolder -= 2;
			// changes value subtracted by to alter position in list; must always be 2
		}
		
		System.out.println(arrayRep[checkNum]);
	}

}
