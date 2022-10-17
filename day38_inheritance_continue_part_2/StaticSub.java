package day38_inheritance_continue_part_2;

public class StaticSub extends StaticSuper {
	
	public void print() {
		System.out.println(num);
	}
	
	

}




/*
 *       static member’s inheritance
 
• Static members from a super class are inherited as long as access
modifier allows it.

• Static variables are shared class variables, it will have single central
value for all objects and sub classes.

• Static methods, can be called either using ParentClass.methodName or
SubClass.methodName


*/