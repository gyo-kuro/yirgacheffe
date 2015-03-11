package atelier;

// Number rounding class
// Personal creation of T Kumar (github: gyo-kuro) for exercise pack 1
// 09 Feb 2015

public class Rounder {
	
	public static double roundOne( double x ){
		double roundedOne = Math.round(x * 10)/10d;
		return roundedOne;
	}
	
	public static double roundTwo( double x ){
		double roundedTwo = Math.round(x * 100)/100d;
		return roundedTwo;
	}
	
	public static double roundThree( double x ){
		double roundedThree = Math.round(x * 1000)/1000d;
		return roundedThree;
	}
	
	public static double roundFour( double x ){
		double roundedFour = Math.round(x * 10000)/10000d;
		return roundedFour;
	}
	
	public static double roundMulti( double x, double y ){
		double roundPower = Math.pow(10, y);
		double roundedMulti = (double)Math.round(x * roundPower)/(roundPower);
		return roundedMulti;
	}

}
