package day38_inheritance_continue_part_2;

public class Dog extends Animal {  //inheritance
	
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	

	public Dog(int eyes, int legs, int tail, int teeth,
			String coat) {
		super("Yorkie", 1, 1, 8, 20);  //SuperClass (Animal) has constructor with parameters
		                               //buyuzden parametreli super buraya konulmak zorunda
		
		this.eyes = eyes;  //compiler this e gelmeden once objectte assignment olmuyor
		                  //
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	

	public void chew() {
		System.out.println("Dog.chew() is called");
	}


	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}


	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		super.move(speed);
	}
	
	
	
	

}



//super(); key word works inside a constructor