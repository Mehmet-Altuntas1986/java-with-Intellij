package day39_inheritance_part_3_review;

public class Car extends Vehicle {

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	public Car(String name, int size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);  //parent class ta parametreli constructor oldugu icin , buraya super koyulmak zorunda
		                    //burdaki name ve size ile vehicle clasindaki  line 5,6 daki name ve size farkli , ayni degiller
		this.wheels = wheels;
		this.doors = doors;   //sagdaki doors parametrelerden geliyor , soldaki doors instance variable ---> ayni degiller
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;   //initilize yapti  be line 11 de parantez arasindaki parametrelerlerde  int currentGear i cikardi , cunku initilize yapmasina gerek kalmadi
	}
	
	public void changeGear(int currentGear) {
		this.currentGear=currentGear;
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVeloctiy():Veloctiy " + speed + " direction " + direction);
		super.move(speed,direction);  //super i eklemeseydik ayni sinifin icindeki move methoduna jvm gidecekti
		//move(speed,direction); //ayni sinifin icindeki move methoduna gider
	}
	
	@Override
	public void move(int velocity, int direction) {  //public is access modifier ,burdan cikarilirsa default olur ve sadece ayni package icinde erisim olur, private buraya koyamayiz
		setCurrentVelocity(velocity+10);
		setCurrentDriection(direction + 10);
		System.out.println("Vehicle.move(): Moving at " + getCurrentVelocity() + " in direction " + getCurrentDriection() );
	}


	/*visibility siralamasi
	public>protected>default
	*/
	
	
	
	
	
	
}

//bir class in icinde bir method cagiriliyorsa , jvm once ayni sinifin icinde o methodu arar bulamazsa 2.soruyu sorar super class in icinde bu method varmi, varsa oraya git


//private methods, variables can not be inherited
//constructors cannot be inherited

/*
rules 
always parent constructor is called before child constructor 

#diyelimk i parent constructor var ama child costructor yok, bu durumda jvm arka planda bir tane constructor olusturur ve icinde super()    */


/*in method overloading methodlarin return type lari ayni olmak zorunda degil. (method overloading ayni sinifin icinde olur)
 * in method overriding subclass ve superclass icindeki (inheritance classes) return type lari  ya ayni olacak
 * yada covarient yani subclass in return type i ile ayni olacak
 * 
 *             - > Return type must be same or covariant type

class Vehicle {
	public Vehicle move(String direction) {
		return new Vehicle();
	}
}

class Van extends Vehicle {
	public Vehicle move(String direction) {  //return type is Vehicle 
		return new Vehicle();
	}
}


class Van extends Vehicle {
	// Notice the covariant return type Van here, which is subtype of Vehicle
	public Van move(String direction) { //return type is Van
		return new Van();
 */