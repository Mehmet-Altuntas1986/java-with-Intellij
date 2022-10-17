package day45_exceptionsHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter correct index");
			
			return; // stop the main method dememize ragmen finally block is running  (yukarida index i duzelt ve dene)
			
		}finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Bye..");

	}

}

/*• Finally block, always runs except in 2 situations:
• System.exit(0);
• JVM crash  
*/


//if i dind't put the code in try and catch , i am not handling it


//catch blogunda error varsa execution stop in the line there is error but finaly block runs




/*try{

A 

B

C
}catch(Exception e){

D             //burda erro varsa J ye compiler ulasamaz , burada jvm durur. (finally block varsa herzaman runs)
}

J


1 - There is no any problem/exception : A B C J

2- A trgiggered exception/error: D J

3- B triggered exception/error: A D J

4- C triggered exception/error: A B D J


============================

A

try{

B

C

}catch(Exception e){

D 

E

}finally{

F
}

K

1 - No error: A B C F K

2- A has error : nothing 

3- C has a problem: A B D E F K

4- C and D has error: A B F and execution stops, show error    

*/