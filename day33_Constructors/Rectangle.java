package day33_Constructors;

public class Rectangle {       
	
	double length;
	double width;

	
	public void getArea() {                          //bu method constructor degil , cunku void var ve method ismi class ismi ile ayni degil.
		System.out.println(length * width);
	}
	

	
    //created constructor
	//accepts two arguments
	public Rectangle(double a, double b) {   
		length = a ;
		 width = b;
	}
	
	
	//create a constructor without parameter
	
	public Rectangle() {   
		length = 10.2 ;
		 width = 6.4;
	

}

}


//constructor   (ayni class in icinde nasil olustururum asagida)
/*
 * 
                              //in interview they ask, what is the difference between constructor and method / answer: constructor is a method has class name 
                               * and it doesnt have return type(void)
public Rectangle() {
	   length = 10.2 ;
		 width = 6.4;
	
}

or


public Rectangle (int a,int b) {  parametrelerde olabilir
	
	    length = a ;
		 width = b;
}

*/


//constructorlar in icinde genellikle high level logic kulanilmaz 

//constructor in ana gorevi variable lara bir deger vermek  (initilization)



