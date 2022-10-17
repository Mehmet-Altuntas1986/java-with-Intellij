package day38_inheritance_continue_part_2;

public class SuperClass {
	
	public SuperClass() {  //SuperClass constructor
		
		System.out.println("This is the super class Constructor");
		
	}
	
	
	
	//diyelimki bu class da bir constructor yok ama subclass da var --ne olur?
	//java bu sinifin icinde gorunmeyecek sekilde bir default constructor olusturur
	
	
	
	/*eger bu sinifin icindeki constructorda argument li degilse , subclass constructor inin icinde 
	 * Super key word unu koymaya gerek yok, cunku java jvm arka planda zaten onu koyar.
	  
	 */

	
	//constructors are not inherited fakat onlarin islemi Super key word ile alakali kurallarda 
	
}


/*  Rule
 in an inheritance relationship, the superclass 

constructor always executes(runs) before the subclass constructor    */


/* 
    super()
    
• super() is used to call Parent class constructor from Child class
constructor.
• Parameters must match with parent constructor

• It needs to be the first statement in the child class constructor   (onemli ilk sirada olmayinca hata verir)

• this() also needs to be the first statement in the constructor, so
super() and this() can not be in the same constructor

• If you do not add super() in your constructor, compiler will put one
for you  (ama super class daki constructor arg menleri yoksa bunu yapar)

• If parent class only has constructor with parameters, then child
constructor MUST make a matching super(params) call.


*/



