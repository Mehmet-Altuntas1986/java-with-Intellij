package day43_polymorphism;

public class InstanceOf {

	public static void main(String[] args) {
		
		Shape sh = new Triangle();    //sh created from Triangle class
		
		if(sh instanceof Triangle) {
			System.out.println("Triangle Class");
		}else if(sh instanceof Circle) {
			System.out.println("Circle Class");
		}

	}

}

/*
  instanceof
 
• instanceof operator can be used to check if the object is certain class. */