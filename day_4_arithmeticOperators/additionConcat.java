package day_4_arithmeticOperators;

public class additionConcat {

	public static void main(String[] args) {
		
		
		
		//  + (PLUS Sign) We have to check whether it's a addition or Concatenation
		
		//Number + Number :Addition
		System.out.println(2+2);
		System.out.println(20+200);
		
		//Number+String : Concatenation
		System.out.println(5 + " hello");
		
		//String+Boolean : Concatenation
		System.out.println("hello " + true);
		
		//String+String : Concatenation
		System.out.println("hello" + " world");
		
		//Boolean+Number
		//System.out.println(true+1);

		//*** soldan saga dogru islem oluyor
		
		System.out.println(2+0+3+"Cybertek");  //5Cybertek
		
		System.out.println("Cybertek"+2+0+5);  //Cybertek205
		
		System.out.println(2+0+5+"Cybertek"+2+0+5);  //7Cybertek205
		
		System.out.println(2+0+5+"Cybertek"+(2+0+1));  //7Cybertek3
		
		//when we put extra()it becomes an Addition, if there is no extra () it's a concatenation
		
		System.out.println(2+0+5+"Cybertek"+2+0+1);  //7Cybertek201
		
		
		
		

	}

}
