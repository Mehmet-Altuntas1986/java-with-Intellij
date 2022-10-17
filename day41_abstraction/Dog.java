package day41_abstraction;

public class Dog extends Animal{ //• A sub class of abstract class is called concrete class
	                          //•** A first concrete class must implement
	                             //all inherited abstract methods

	
	@Override
	void eat() {
		System.out.println("Dog food");
	}

	
	@Override
	void breathe() {
		// TODO Auto-generated method stub
		
	}
	

	//WE HAVE TO OVERRIDE ABSTRUCT METHODS because we have to put inplementation
	
	
	// parrot classes are first concrete classes (they must have implementation)  --> if they extends 
	//parrot class is not first concrete class (if there is no implementation in its body {}--> no error
	
//bird could be also first  concrete class if it has no abstruct
	

}