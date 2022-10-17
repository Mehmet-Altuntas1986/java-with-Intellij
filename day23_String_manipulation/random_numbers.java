package day23_String_manipulation;

import java.util.Random;

public class random_numbers {   //rastgele degerler veriyor belirli degerler arasinda

	public static void main(String[] args) {

     Random rn  = new Random();
		
		System.out.println(rn.nextInt());
		
		System.out.println(rn.nextDouble());
		
		System.out.println(rn.nextFloat());
		
		System.out.println(rn.nextBoolean());
		
		
		System.out.println(rn.nextInt(50)); //0-49    -->50 not included
		
		System.out.println(rn.nextInt(10)+5); //  5 - 14   --->15 not included
	}

}

//In work enviroment , we use mostly nextint