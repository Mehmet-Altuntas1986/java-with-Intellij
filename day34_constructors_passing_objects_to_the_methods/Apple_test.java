package day34_constructors_passing_objects_to_the_methods;

public class Apple_test {

	public static void main(String[] args) {
	
Apple a1 = new Apple();
		
		changeApple(a1);  //calling method with object variable
		
		System.out.println(a1.color);  //White diye print ettirir
		
		System.out.println(methodObject().color);   //red 
		
		//b1.color; error verdi

	}
	
	public static void changeApple(Apple x) {   //a1 = x oldu
		x.color = "White";
	}

	public static Apple methodObject(){// if you want to return an object , we need to put class name
		
		Apple b1 = new Apple();
		return b1;               //b1 belongs to apple class
	}                           // b1 is only visible inside the method if you dont call this method

}


//Instance variable belongs to object



/* i want to return object. 
   which object?

   object belongs to apple class  */