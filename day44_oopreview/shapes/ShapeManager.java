package day44_oopreview.shapes;

import java.util.List;   //List class i util package inin icinde

public class ShapeManager {
	
	public static Shape buildShape(String type) {
		
		Shape shape=null;      //shape is the super class   //local variables needs to be initialized
		
		switch(type.toLowerCase()) {
		case "shape":
			shape = new Shape();
			break;
		case "diamond":
			shape = new Diamond();
			break;
		case "square":
			shape = new Square();
			break;
		}
		
		return shape;
		
	}
	
	public static void drawSquare(Square squareObject) {
		squareObject.draw();
	}
	
	public static void drawShape(Shape shapeObject) {
		shapeObject.draw();
	}
	
	public static void drawShape(List<Shape> shapeList) { //anything is coming outside, should be put inside (  )
		for(Shape each : shapeList) {
			each.draw();
		}
	}
	
	
	
	
	
	//all the methods here  are static why?
	//-->if the method doesnt use any instance variable,you can do this method as static
	
	
	
	
	
	
	
	

}