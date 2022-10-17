package day33_Constructors;

public class Mouse {

	int numTeeth;
	int numWhiskers;
	int weight;
	
	//1
	public Mouse(int weight) {  //i want to call constructor 2
		this(30,weight); //calling from one constructor to another constructor   //when we use it , it has to be in the first line   //calling 2nd constructor from 1st constructor
		this.weight = weight;
		System.out.println("Java");
	}

	//2
	public Mouse(int numTeeth, int weight) { //i want to call constructor 3
		this(numTeeth,20,weight);  //calling 3rd constructor from 2nd constructor
		this.numTeeth = numTeeth;
		this.weight = weight;
		System.out.println("JS");
	}
	

	//3
	public Mouse(int numTeeth, int numWhiskers, int weight) {
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight;
		System.out.println("TS");
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
	
	
	//compiler kullan 
	
	
	//you can only call one constructor from another constructor
	

}


//this is a reference variable in Java that refers to the current object.

/*

Java Constructor                                                                             Java Method
A constructor is used to initialize the variables of a Class                              A method is used to define the
behavior/functionalities of an object

A constructor must not have return type                                                  The method may or may not have a return type
		
The constructor has invoked automatically at
the time of object creation. Constructors can be
called explicitly when there are multiple
constructors are defined.                                                                 The method is invoked explicitly(acikca) using the dot operator


The java compiler provides a default
constructor if you do not have any constructor                                            There is no existence of default Method
Constructor name must be same as the class name                                 
                                                                                           Method name may or may not be same as class name          */



