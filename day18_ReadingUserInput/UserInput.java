package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // We created our object (sc) in the Scanner class

		System.out.println("Enter a byte value:"); // To see a title in the console
		byte b1 = sc.nextByte(); // Scanner class is offering us a method (nextByte) which brings to a data type
		System.out.println("Byte value is " + b1); // In this case it brings to byte data type (we can assign a variable
													// to any
													// type of data)
													// Object name . class name (When we call a method)

		System.out.print("Enter a short value:");
		short s1 = sc.nextShort();
		System.out.println("Short value is " + s1);

		System.out.print("Enter a int value:");
		int i1 = sc.nextInt();
		System.out.println("Int value is " + i1);

		System.out.print("Enter a long value:");
		long l1 = sc.nextLong();
		System.out.println("Long value is " + l1);

		System.out.print("Enter a double value:");
		double d1 = sc.nextDouble();
		System.out.println("Double value is " + d1);

		System.out.print("Enter a boolean value:");
		boolean bool = sc.nextBoolean();
		System.out.println("Boolean value is " + bool);

	}

}
