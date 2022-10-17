package day15_Methods_Part3;

public class Task71_MethodOverloading {

	public static void main(String[] args) {

		calcFeetAndInchesToCentimeters(100);

		calcFeetAndInchesToCentimeters(6, 5);

	}

	public static double calcFeetAndInchesToCentimeters(double feet, double inches) {	 // method-1

		if (feet < 0 || (inches < 0 || inches > 12)) { // inches can be between 0-12
			System.out.println("Invalid feet or inches");
			return -1;
		}

		double centimeters = (feet * 12) * 2.54 + (inches * 2.54);

		System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");

		return centimeters;

	}

	public static double calcFeetAndInchesToCentimeters(double inches) { 				// method-2

		if (inches < 0) {
			System.out.println("Invalid inches");
			return -1;
		}

		double feet = (int) inches / 12;
		double remainingInches = inches % 12;

		System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");

		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}

}
