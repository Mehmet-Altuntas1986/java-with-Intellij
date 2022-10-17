package day18_ReadingUserInput;

import java.util.Scanner;

public class task74_positiveNumberTotal {

	public static void main(String[] args) {
		
		
		int sum = 0;
		int num = 0;
		
		Scanner sc = new Scanner (System.in);
		
		do {
			
			System.out.println("Enter your number: ");
			
			num = sc.nextInt();
			
			if(num < 0) {
				break;
			}else {
				sum = sum + num;
			}
			
			
		}while(true);
		
		System.out.println("Total is: " + sum);

	}

}
