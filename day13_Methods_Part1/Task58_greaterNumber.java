package day13_Methods_Part1;

public class Task58_greaterNumber {

	public static void main(String[] args) {

		greaterNumber();

	}

	public static void greaterNumber() {

		int num1 = 10;
		int num2 = 5;

		if (num1 > num2) {
			System.out.println("num1 is greater than num2");
		} else if (num2 > num1) {
			System.out.println("num1 is greater than num2");

		} else {
			System.out.println("num1 and num2 are equal");
		}

	}

}
