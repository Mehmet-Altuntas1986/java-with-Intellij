package day39_inheritance_part_3_review;

public class Vehicle {
	
	private String name;
	private int size;
	private int currentVelocity;  //inheritance ile access olmaz ,access encaptulation ile getter ve setter ile olabilir
	private int currentDriection;
	
	/*
	public Vehicle() {
		this("BMW",3,60,50);   //farkli bir constructor i cagirmada kullanilir ,fakat ayni sinif in icinde olamli constructor lar
	}
	*/
	
	public Vehicle(String name,int size) {
		this.name=name;  //soldaki name ile sagdaki name ayni degil, uzerlerine tiklayarak bak nerden geldiklerini
		this.size=size;
		this.currentVelocity=0;
		this.currentDriection=0;
	}
	
	public Vehicle(String name, int size, int currentVelocity, int currentDriection) {
		this.name = name;
		this.size = size;
		this.currentVelocity = currentVelocity;
		this.currentDriection = currentDriection;
	}
	
	public void steer(int direction) {
		this.currentDriection += direction;
		System.out.println("Vehicle.steer():Steering at " + currentDriection + " degrees.");
	}
	
	void move(int velocity,int direction) {
		this.currentDriection=direction;
		this.currentVelocity=velocity;
		System.out.println("Vehicle.moce():Moving at " + currentVelocity + " in direction " + currentDriection);
	}
	
	public void stop() {
		this.currentVelocity=0;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public void setCurrentVelocity(int currentVelocity) {
		this.currentVelocity = currentVelocity;
	}
	public int getCurrentDriection() {
		return currentDriection;
	}
	public void setCurrentDriection(int currentDriection) {
		this.currentDriection = currentDriection;
	}
	
	
	/* this vs super : - > super is used to call the parent class members
                    - > this is used to call the current class members
                    - > We can use both of them anywhere

    this() vs super() : - > this() is used to call constructor from another overloaded constructor
                        - > super() is used to call a parent constructor
                        - > this() and super() can not be used together in the same constructor*/
	
	
	
	

}