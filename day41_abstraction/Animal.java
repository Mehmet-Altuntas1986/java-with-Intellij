package day41_abstraction;

public abstract class Animal { //abstract keyword u ile abstract class olusturuyoruz
	
	
//abstruction class notelarina bak	
	
	//Instance variable
	String name;
	
	//Static variable
	private static int age;
	
	
	/*
	 * Desription:Calculating Salary
	 * Author:Ozzy
	 * @param: String title(@link Employee)
	 * @Return: void 
	 * 
	 */
	
	//Abstract Method
	 abstract  void eat(); //abstract method   -->there is no body--> {}
	//Abstract Method
	abstract void breathe();
	
	//Instance method--> Not necessary to create override if it is instance method
	private void sing() {
		System.out.println("Animal is singing");
	}
	
	//Constructor

	public Animal() {  //

	}

	public Animal(int age) {
		this.age=age;
	}
	
	//Instance block
	{
		System.out.println("This is instance block");
	}
	
	//Static block
	static {
		System.out.println("This is static block");
	}

	
	{
		//init block can be added in abstract class
	}
	
}



//if any class has abstract methods inside, this class should be abstract class, yani 
//if class is not abstract class, it cannot have abstract methods.


//child class has to put the implementation , otherwise error. ex ;Dog classinin 
//curly braces larinin arasindaki seyleri sil, hata verecektir
//it is mendatory to put implementation in child  class if it extends a parent class that is abstract

/*• A sub class of abstract class is called  concrete class
• A first concrete class must implement
all inherited abstract methods*/


/*• abstract keyword is used to create abstract classes
• An abstract class can not be instantiated
• Goal is to provide reusable variables and methods to sub classes*/