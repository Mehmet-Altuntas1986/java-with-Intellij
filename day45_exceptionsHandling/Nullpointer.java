package day45_exceptionsHandling;

public class Nullpointer {
	
	static String name;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(name.toUpperCase()); //nullpointerexception bu lineda dolayi oldu
			
		}catch(NullPointerException e) {  //(Exception e) de yazabilirdim , cunku exception class is parent of nullpointerexception class
			
			System.out.println("Nullpointerexception happened");  //nullpointerexception is a class--> java.lang dan geliyor
			
			System.out.println("Here is the message: " + e.getMessage());
			
			System.out.println("Here is the stack trace: ");
			
			e.printStackTrace();
			
			
		}
		
		//pdf den exception class inin hangi siniflarin parent class i olduguna bak
		

	}

}