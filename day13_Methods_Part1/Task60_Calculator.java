package day13_Methods_Part1;

public class Task60_Calculator {

	public static void main(String[] args) {

		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");

	}

	public static void calculator(int num1, int num2, String operator) {

		switch (operator) {
		case "+":
			System.out.println(num1 + num2);
			break;
		case "-":
			System.out.println(num1 - num2);
			break;
		case "*":
			System.out.println(num1 * num2);
			break;
		case "/":
			System.out.println(num1 / num2);
			break;
		}

	}

}
