package day_3_variables_dataTypes;

public class VariableDeclaration {

	public static void main(String[] args) {
		
		
		//declaration
		byte inches;
		int speed;
		short month;
		float salesCommision;
		double distance;
		
		
		//assigned
		inches=5;
		speed=200;
		month=2;
		distance=40.2;
		salesCommision=5;
		
		//declared+assigned
		byte feet=5;
		
		
		
		System.out.println(inches);
		System.out.println(speed);
		
		int accountnumber = 20;
		
		System.out.println("My Number is " + accountnumber);
		
		
		
		

	}

}
/*
Literals
You may have noticed that the new keyword isn't used when initializing a variable of a primitive type. Primitive types
are special data types built into the language; they are not objects created from a class. A literal is the source code
 representation of a fixed value; literals are represented directly in your code without requiring computation.
 As shown below, it's possible to assign a literal to a variable of a primitive type:

boolean result = true;
char capitalC = 'C';
byte b = 100;
short s = 10000;
int i = 100000;
 */