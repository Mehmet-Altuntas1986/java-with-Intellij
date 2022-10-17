package day33_Constructors;

public class Car {   //main method olmadan olusturdum
	

	
	String model;
	String make;        //to give them a value ,we will create constructors (methods with no return(void) and method name is same with the class name (Car)--->difference with other methods
	int year;
	double mile;
	String color;
	
	
	
	
	public Car() {  //No-argument Constructor:
		
		make = "BMW";
		model = "M3";
		year = 2019;
		mile = 23000;
		color = "red";
	}


	public Car(String model, String make, int year, double mile, String color) {  //Parameterized Constructor: 
		this.model = model;   //this current object i belirtiyor , olmadigindada sikinti yok   //it shows reference variable in the objects
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
		
		
		
		
		//right click--->source--->generate constructor using fields 
	}


	/* look at the above
	 * 
	 * 1-how we create it
	 * 2-what are those constructors responsibilities?   --< assignments (initialisation)
	 */
	
	
	
	//if we don't create constructor, java virtual machine in background create it with default values, it is not seen by eyes
	
	
	
	
	
	
	
	
	
	
	
	/*
	public Car(String model,String make,int year,double mile,String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	*/
	
	
	
	
	

}