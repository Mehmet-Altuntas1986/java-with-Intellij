package day42_interface;

public class TeslaTruck extends TeslaSemi { //concrete class , not necessary to override

	public TeslaTruck(String model, double price, String color, double engineSize) {  //constructor-->therefore it should be called
		super(model, price, color, engineSize);
	}
	
	

}