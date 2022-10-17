package day36_staticClassMembers;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	public static void show1() {
		//show2(); //u can not call instance method/variable from static method
		show4(); // u can call static method from static method
		System.out.println(name);
		//System.out.println(age);  //error , cunku age is instance variable  and we are calling it from static method (un icinden)tan
	}
	
	
	public void show2() { //instance method
		
		show1(); //u can call static from instance method
		System.out.println(name);
		System.out.println(age);
		
	}
	
	public void show3() {//instance method
		
		show2();
		show1();
		
	}
	
	public static void show4() { //static method
		
	}
			
			

}



/*  
        Static method                                          Instance method
 
Static methods can not access instance
methods and instance variables directly
                                                          Instance methods can access instance
                                                         methods and instance variables directly
In static methods we can not use the “this”
keyword
                                                         Instance methods can also access static
                                                         methods and static variables directly



*/