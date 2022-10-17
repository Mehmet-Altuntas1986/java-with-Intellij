package day24_arrays_part1;

import java.util.Scanner;

public class task_86_arrays_month {

	public static void main(String[] args) {

//		Create an array that holds 12 months names
//		User should be able to enter month index and output should be:
//		“The month name is <MonthName>”
		
		
		String[]months=new String[12];
		
		Scanner sc=new Scanner (System.in);
		
		
		
		months[0]="jan";
		months[1]="feb";
		months[2]="march";
		months[3]="april";
		months[4]="may";
		months[5]="june";
		months[6]="july";
		months[7]="august";
		months[8]="sep";
		months[9]="oct";
		months[10]="nov";
		months[11]="dec";

		System.out.println("enter your month index number ");
		int index=sc.nextInt();
		
		System.out.println("the month is "+months[index]);
		
	
		
		
		
		//	System.out.println(months); //referans adresini gosterir @55f96302

		
		
	}

}
