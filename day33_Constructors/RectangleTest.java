package day33_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();   //when we form a method with "new" keyword , we call constructor   //new keyword also creates the object
		                                 //which method?  -->Rectangle(); ---> icinde parametre olsaydi parametreli olusturulan 
		                                 //ozet: bir method olusturdugunu dusun , ismi Rectangle();(new in yanindaki class ismi) ve void yok (no return) sadece public Rectangle(); --< bir constructor methodu olusturmus oluruz
		                     
		r1.length=5.2;
		r1.width=4.8;

		                                         //constructor is giving default values if not assignment is found   //constructor initiliaze variables or values
		
		Rectangle r2 = new Rectangle();
		r2.length=3.5;
		r2.width=2.7;
		
		
		System.out.println(r1.length); 
		System.out.println(r2.width);

	}

}

/*  Constructors
* constructor is a method that is automatically called when an object is created. (with new keyword)
* 
* Constructors are used to initialize the object’s instance fields.            (main purpose of constructor--interview)
* 
* They are called constructor because the help construct an object.
* 
* new keyword invokes the constructor of the class.  */

/*
Types of Constructors
• No-argument Constructor:
	A constructor that has no parameter is known as default
constructor. If we do not define a constructor in a class, then compiler creates default
constructor(with no argument) for the class. If we write a constructor with arguments
or no-arguments then the compiler does not create a default constructor. Default
constructor provides the default values to object like 0, null, etc. depending on the
type.
• Parameterized Constructor: 
	A constructor that has parameters is known as
parameterized constructor. If we want to initialize fields of the class with your own
values, then use parameterized constructor.



/*Creating Constructors
• Constructor is a special method that matches the name of the class and has no return(void)
type 

 *
 *       
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */