package day25_arrays_continue_to_learn;

import java.util.Scanner;

public class pay_array {

	public static void main(String[] args) {
		//This program stores in an array the hours worked for by 5 employees who all make the same hourly wage (ucret)
		//display their gross pay
		
		final int EMPLOYEES = 5;
		double payRate;
		double grossPay;
		
		//Create a scanner object for input
		Scanner sc  = new Scanner(System.in);
		
		//create any array to hold employee hours
		int[] hours = new int[EMPLOYEES];
		
		//Get the hours worked by each employee   //kac saat her biri calisti yaz
		System.out.println("Enter the hours worked by " + EMPLOYEES  + " employees who all earn the same hourly wage");
		
		for(int i=0;i<EMPLOYEES;i++) {
			hours[i] = sc.nextInt();
		}
		
		//Get the hourly pay rate     //herbiri saat basi nekadar ucret aliyor , yaz
		System.out.print("Enter the hourly rate for each employee:");
		payRate = sc.nextDouble();
		
		
		//Display each employee's gross pays   (toplamda nekadar ucret almislar ,hesapla)
		for(int i=0;i<EMPLOYEES;i++) {
			
			grossPay = hours[i]*payRate;
			
			System.out.println("Employee #" + (i+1) + ": $ " + grossPay);   //i index numarasi
			
		}
			
		
	}

}
