package day23_String_manipulation;

import java.util.*;

public class task_83 {

	public static void main(String[] args) {

		int dice1;
		int dice2;
		String again="y";
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		while(again.equalsIgnoreCase("y")) {
			
			
			System.out.println("Rolling the dice....");
			dice1=rn.nextInt(6)+1;        //zar atiyor , 1 ve 6 dahil   , 7 dahil degil , nekadar atacagi belli degil, yazan kisin no diyene kadar surec devam eder, for loop kullanilamaz
			dice2=rn.nextInt(6)+1;
			
			System.out.println("Their values are:");
			System.out.println(dice1 + " " + dice2);
			
			System.out.print("Roll them again (y=yes)?");
			again = sc.nextLine(); //y Y n
			
		}
		
		
		
		
		
	    //i dont know how many times he will do it, so i can t use for loop
	}

}
//Dr. Kimuta teaches an introductory statics class and has asked you to write a program
//that he can use in class to simulate the rolling dice. The program should randomly
//generate two numbers in the range of 1 through 6 and display them. In your interview
//with Dr. Kimura, you learn that he would like to use the program to simulate several
//rolls of the dice, one after the other.
//
//     rolling the dice....
//     their values are 6 2
//     roll them again (y=yes)? y
//		rolling the dice..
//		their values are 2 6
//		roll them again (y=yes)? y
//				rolling the dice..
//				their values are 3  6
//				roll them again (y=yes)? n