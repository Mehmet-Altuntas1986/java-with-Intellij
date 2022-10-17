package day13_Methods_Part1;

public class PassArg {

	public static void main(String[] args) {

		int x= 10;
		
		displayValue(5);
		displayValue(x);
		displayValue(x*4);
		displayValue();

	}

	public static void displayValue(int num) {

		System.out.println("The value is " + num);
	}
		
	public static void displayValue() {

			System.out.println("The value is " + 12345);
	
	}

}
