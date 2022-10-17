package day38_inheritance_continue_part_2;

public class CompanyTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		FullTimeEmployee ft = new FullTimeEmployee();
		Contractor ct = new Contractor();
		
		emp.calculatePay(40, 40);
		ft.calculatePay(40, 40);
		ct.calculatePay(40, 40); //contractir ve uzandigi superclass olan class 
		                         //in icinde ayni isimde method varsa , subclass
		                         //daki method runs, burda overriding var
		                         

	/*         remember
	 * overriding same method names also same parameter
	 * overloading same method names but with different parameters	
	 
	 */
		
//if you want to print parent method first and there is overriding ,
//use super key word. if you dont do this, first subclass method runs
		
		/*
		 Method Overriding Rules
1. There must be is-a relationship(inheritance) -->yani extends olmali

2. The method must have the same name as in the parent class

3. The method must have the same parameter as in the parent class

4. Access modifier: Needs to be same or more visible

if Child class              parent class     can be same or more visible

• public        - >        public   
• protected     - >        protected, public
• default       - >        default, protected, public

5. Return type:
• must be same or
• covariant type (same class type or sub class type)
		*/
	}

}



/*  Method Overloading                                      Method Overriding           -----> understand differences very well
 
Method overloading is performed within                      Method overriding occurs in two classes
class                                                           that have IS-A relationship

        
In case of method overloading, parameter               In case of method overriding, parameter must be same
must be different


Access specifier can be changed                         Access specifier must not be more
                                                         restrictive than original method
private and final methods can be
overloaded                                                private and final methods can not be overridden

Return type of method does not matter in
case of method overloading, it can be same              Return type must be same or covariant in
or different                                                        method overriding
 */





/*super keyword in Java
 
The super keyword in java is a reference variable that is used to refer
parent class objects. The keyword “super” is used with the concept of
inheritance.

• Super with variables (super.variable)
• Super with methods (super.method)
• Super with constructors (super() )  */



/*       this vs super
 
 
• The keyword super is used to access/call the parent class members
(variables and methods)

• The keyword this is used to call the current class members (variables
and methods). This is required when we have a parameter with the same
name as an instance variable

• We can use both of them anywhere in a class except static areas (static
block or static method)
*/


/*    this() vs super()
 
• this() is used to call a constructor from another overloaded constructor
in the same class.

• this() can be used only in a constructor, and it must be the first statement
in a constructor. It is used with constructor chaining, in other words
when one constructor calls another constructor.

• The only way to call a parent constructor is by calling super(). This calls
the parent constructor. 

 */