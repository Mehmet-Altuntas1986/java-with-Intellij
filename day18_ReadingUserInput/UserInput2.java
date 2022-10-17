package day18_ReadingUserInput;

import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Provide a sentence and I will Repeat it:");

		// String str = sc.next();		//If there is no space between we can use use .next

		// System.out.println(str);

		String str2 = sc.nextLine();    //If there is a space between we need to use .nextLine

		System.out.println(str2);

	}

}
