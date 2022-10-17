package day38_inheritance_continue_part_2;

public class Car extends Vehicle {
	
	int maxSpeed = 180;
	
	public void display() {
		System.out.println("maximum speed:" + super.maxSpeed);  //parent class tan bisey almak icin super.
		System.out.println("maximum speed:" + maxSpeed);
	}

}
