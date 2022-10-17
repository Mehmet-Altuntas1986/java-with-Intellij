package LiveReviewWithMuhtar5_24_04_2021;

import java.util.Scanner;

public class Multiplication2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// int n1, n2,
		int result = 0;

		System.out.print("Enter the first number:");

		int num1 = scan.nextInt();

		System.out.print("Enter the second number:");
		int num2 = scan.nextInt();

		for (int i = 0; i < num2; i++) {

			result += num1;
		}
		scan.close();
		System.out.println("The multiplication of " + num1 + " and " + num2 + " is: " + result);

		scan.close();
	}

}
