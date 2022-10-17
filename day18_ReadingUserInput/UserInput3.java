package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		sc.nextLine();	//Whenever we are using primitive data types before String;
						// We need to add one more .nextLine between them.
						//There is no problem with .next but we can not type something with space.
		System.out.print("Enter a string: ");
		String str = sc.nextLine();

		System.out.println("Output: " + num1 + " : " + num2 + " : " + str);
	}

}
