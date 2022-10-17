package LiveReviewWithMuhtar5_24_04_2021;

import java.util.Scanner;

public class Format_First_and_Last_Names_2 {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String firstName = scn.nextLine();
		System.out.println("Enter your last name: ");
		String lastName = scn.nextLine();
		scn.close();

		firstName = firstName.substring(0, 1).toUpperCase().concat(firstName.substring(1));
		lastName = lastName.substring(0, 1).toUpperCase().concat(lastName.substring(1));
		System.out.println("Full name: " + firstName + " " + lastName);
		String fullnameInitial = firstName.substring(0, 1).concat(lastName.substring(0, 1));
		System.out.println("Initials are: " + fullnameInitial);
		
	}

}
