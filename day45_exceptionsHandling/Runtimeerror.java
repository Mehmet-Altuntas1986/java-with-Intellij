package day45_exceptionsHandling;

public class Runtimeerror {

	public static void main(String[] args) {
		go();
	}
	
	public static void go() {            //static method cannot go to instance method
		System.out.println("Going");
		
		go();  //recursive
		
		
		//java.lang.stackoverflow error verdi
	}

}