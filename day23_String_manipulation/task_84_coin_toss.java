package day23_String_manipulation;

import java.util.*;

public class task_84_coin_toss {

	public static void main(String[] args) {

		
		
	Random rn = new Random();    //we import scanner and random methods from the same package which is util
		
		for(int i=0;i<10;i++) {
			
			if(rn.nextInt(2)==0) {    //0 ile 2 arasinda  ,2 dahil degil
				
				System.out.println("Tails");    //Tail=0 Heads=1
			}else {
				System.out.println("Heads");
			}
			
			
			
		}
		
		
		
		
		
		
		
	}

}
//Dr. Kimuta was so happy with the dice rolling simulator that you wrote for him, he has
//asked you to write one more program. He would like a program that he can use to
//simulate ten coin tosses, one after the after. Each time the program simulates a coin
//toss, it should randomly display either “Heads” or “Tails

//
// tails
// heads
// deads                rondomly
// heads
// tails
// heads
// tails
// heads
// tails