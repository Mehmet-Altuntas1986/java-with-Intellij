package day44_oopreview.shapes;

public class Square extends Shape {
	
	public Square() {  //constructor
		type="square";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
	
	public void squareMethod() {   //instance method
		System.out.println("Square method");
	}

}