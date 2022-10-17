package day43_polymorphism;

public class ShapesArray {

	public static void main(String[] args) {
		
		Shape[] shapes = new Shape[3];  //holding 3 objects
		
		shapes[0] = new Square();
		shapes[1] = new Triangle();
		shapes[2] = new Circle();
		
		for(Shape sh : shapes) {  
			//System.out.println(sh.getClass().getName());  //get class is coming from object class -->run it and look at console
			
			System.out.println(sh.getClass().getSimpleName());   //getSimpleName gives class name
			//sh.draw();
		}
		
		
		//getName --> package ismini veriyor
		
		

	}

}
/*
• getClass() method helps us to access the object information
• getClass().getName() : returns package.className of the object
• getClass().getSimpleName() : returns just the class name of the object 
*/