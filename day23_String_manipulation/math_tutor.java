package day23_String_manipulation;

import java.util.*;

public class math_tutor {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int sum;
		int userAnswer;
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		number1 = rn.nextInt(100);  //0 ile 100 arasi, 0 dahil ,100 dahil degil  ,rondomly a number
		number2 = rn.nextInt(100);
		
		System.out.println("What is the answer to the following problem?");
		System.out.print(number1 + "+" + number2 + " = ?");   //"+" demeseydik , iki sayiyi ayri ayri gostermezdi, direkt toplardi
		
		userAnswer = sc.nextInt();
		
		sum = number1 + number2;
		
		if(userAnswer == sum) {
			System.out.println("Correct,you got it!");
		}else {
			System.out.println("Sorry,wrong answer. The correct answer is " + sum );
		}
	}

}
