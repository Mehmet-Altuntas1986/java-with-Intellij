package day40_accessmodifiers_final;

public class Child extends Parent {
	
	public int x = 200;   //parent ve child class da x variable ismi -->hiding
	
	
	
	

}


/*  
      ---final class---
 
• When a class is declared with final keyword, it is called a final class. A
final class cannot be extended(inherited).
• You can not make a class immutable without making it final.(String
class)




----Inheriting Variables ----
• We can not override instance variables; we can hide them.




      ----Hiding Variables ---
      
• Variable hiding happens when we define a variable with the same name as a variable in a parent class.

• This creates 2 copies of the variable within an instance of the child class:
one instance defined for the parent reference and another defined for the child reference.
yani 2 si de birbirinden bagimsiz 


• If you are referencing the variable from within the parent class, the
variable defined in the parent class is used.

• If you are referencing the the variable from within the child class, the
variable defined in the child class is used.



 
 */