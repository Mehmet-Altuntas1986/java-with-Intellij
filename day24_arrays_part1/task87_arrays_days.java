package day24_arrays_part1;

import java.util.Scanner;

public class task87_arrays_days {

	public static void main(String[] args) {

//		Task-87
//		Create an array that holds the days
//		User should be able to enter the day index and output should be:
//		“Today is Monday”
		
		
		String [] ArrayDays = new String[7];
		
		
		ArrayDays[0]="monday";
		ArrayDays[1]="tuesday";
		ArrayDays[2]="teusday";
		ArrayDays[3]="wednesday";
		ArrayDays[4]="thursday";
		ArrayDays[5]="friday";
		ArrayDays[6]="saturday";

		Scanner sc= new Scanner(System.in);
		
	System.out.println("enter your day index number");
		int index= sc.nextInt();
		
		System.out.println("the day is "+ArrayDays[index]);       //  [] square brackets
		
		
		
		
		
		
		
		
	}

}
