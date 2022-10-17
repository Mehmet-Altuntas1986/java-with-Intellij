package day42_interface;

public class TeslaSemi extends ElectricTruck { //concrete class
	
	//Which methods are not implemented , they should be overrided
	private double engineSize;

	public TeslaSemi(String model, double price, String color, double engineSize) { //constructor
		super(model, price, color);
		this.engineSize = engineSize;
	}

	@Override
	void load(String item) {
		System.out.println("TeslaSemi-Load " + item + "by lowering the truck and opening door");
	}

	@Override
	void start() {
		System.out.println("TeslaSemi - load start by pressing the button...");
	}

	@Override
	void charge() {
		System.out.println("TeslaSemi - load charge by pressing the button...");
		
	}

	@Override
	void drive() {
		System.out.println("TeslaSemi - truck is driving with load...");
	}

	public double getEngineSize() {
		return engineSize;
	}
	
	
	
	

}