package day_4_arithmeticOperators;

import java.sql.SQLOutput;

public class task17_AverageNumbers$ {

	public static void main(String[] args) {
		
		
		
		double average;
		
		int num1,num2,num3;
		
		num1=10;
		
		num2=20;
		
		num3=60;
		average = (num1+num2+num3)/3;
		
		System.out.println("Average is "+ average);   //Average is 30.0

		System.out.println(num1+num2+num3/3);   //50            // carpma ve bolmede islem onceligi var




		int pies=10,people=4;
		
		double piecesPerson;
		
		piecesPerson=pies/people;     // 2      int/int=int  kusurat yok olur
		
		System.out.println(piecesPerson);
		
		// Normally answer should be 2.5 but (int) only shows numbers without decimals




				
  //piecesPerson=pies/people+(double)(pies%people)/4;          gercek degeri boyle elde edebiliriz
		
		
		
		
		
		
	}

}
