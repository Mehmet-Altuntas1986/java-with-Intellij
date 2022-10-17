package day17_classObjects_Part2;

import java.util.Scanner;

public class UserInput_Scanner_Class {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); //We created our object (sc) in the Scanner class
		
		System.out.println("Enter a byte value:"); //To see a title in the console
		
		byte b1 = sc.nextByte();   // Scanner class is offering us a method (nextByte) which brings to a data type
								   // In this case it brings to byte data type (we can assign a variable to any type of data)
								  // Object name . class name	(When we call a method)
		
		//int b1 = sc.nextInt();	// we can make different data types
		
		System.out.println(b1);
		System.out.println(b1*4);
		System.out.println(b1%3);
		
		
		
		System.out.println("Enter another byte value:");
		byte b2 = sc.nextByte();
		System.out.println(b2);
		System.out.println(b2*4);
		System.out.println(b2%3);
		
		

	}

}
