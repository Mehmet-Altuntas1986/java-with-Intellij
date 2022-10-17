package day18_ReadingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of change
		//quarter : 25 cents
		//dimes : 10 cents
		//nickels : 5 cents
		//pennies : 1 cent
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number from 1-99 : ");
		int amount=keyboard.nextInt();
		int originalAmount = amount;
		
		int quarters=amount/25; //   87/25=3
		amount=amount%25; // 12
		int dimes=amount/10;  // 12/10=1 
		amount=amount%10;     // 2
		int nickles=amount/5;  // 2/5 =0
		amount=amount%5;  
		int pennies=amount;  //2
		
		System.out.println(originalAmount + " cents in coins can be given as:" );
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickles + " nickles");
		System.out.println(pennies + " pennies");

	}

}
