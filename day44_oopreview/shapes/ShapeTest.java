package day44_oopreview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//create 3 shapes, using polymorphis
		
		Shape square = new Square();
		Shape diamond = new Diamond();
		Object shapeObject = new Shape();
		
		square.draw(); //belirleyici class Shape ve shape classinda draw methodu var, buyuzden no error
		diamond.draw();
		
		((Square)square).squareMethod();  //square.squareMethod(); a casting yapildi-->cunku belirleyici class shape di
		
	//Square clasinin icnde squaremethod var ama shape belirleyiciydi, casting yaptik ve square belirleyici oldu	
	//square in onunde sanki shape varmis gibi hayal et	
		
		

	}

}
//LEFT SIDE IS PARENT

//ALL THE CLASSES ARE EXTENDING FROM THE Object 



/*The Object class is the parent class of all the 
 * classes in java by default. In other words, it is 
 * the topmost class of java. The Object class is 
 * beneficial if you want to refer any object whose
 *  type you don't know. Notice that parent class
 *   reference variable can refer the child class
 *    object, know as upcasting.
 */