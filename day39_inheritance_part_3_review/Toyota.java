package day39_inheritance_part_3_review;

public class Toyota extends Car {

	private int roadService;

	public Toyota(int roadService) {
		super("Toyota", 3, 4, 4, 4, false);
		this.roadService = roadService;
	}
	
	public void accelerate(int rate) {
		    //local variable
		int newVelocity = getCurrentVelocity() + rate;   //currentvelocity yazinca compiler hata verdi cunku private, sonra getter kuillandim onu kullanmak icin
		
		if(newVelocity == 0) {
			stop();
			changeGear(1);
		}else if(newVelocity>0 && newVelocity<=10) {
			changeGear(1);
		}else if(newVelocity>10 && newVelocity<=20) {
			changeGear(2);
		}else if(newVelocity>20 && newVelocity<=30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		if(newVelocity>0) {
			changeVelocity(newVelocity, getCurrentDriection()); //currentDriction da getter kullandi --private oldugu icin
		}
	}

	
	
	


}



/*Types of variables:
- Local Variables:  - > A variable defined within a block or method or constructor

- > Created when the block in entered or the method is called and destroyed after exiting from block, or when the call returns from method
- > Scope of these variables exists only within the block in which the variable is declared
- > Initializition is mandatory



- Instance Variables: - > Non-static variables and are declared in a class outside any  method, constructor, or block

  - > Created when an object of the class is created and destroyed  when the object is destroyed
  - > Unlike local variables, we may use access modifiers. If we do not specify any modifier then default access specifier will be used
  - > Initialization is not mandatory.
  - > Can be accessed only by creating objects

- Static Variables: - > Also known as class variables.

- > Declared using the static keyword within a class outside any method, constructor or block.
- > We can ony have one copy of static variables per class
- > Created at the start of the program execution and destroyed automatically when execution ends
- > Initialization is not mandatory
- > We can access thru class name. className.staticVariable;

*/