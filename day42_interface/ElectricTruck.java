package day42_interface;

public abstract class ElectricTruck extends ElectricCar { //abstract class

	public ElectricTruck(String model, double price, String color) {
		super(model, price, color);
	}
	
	abstract void load(String item);
	
}
