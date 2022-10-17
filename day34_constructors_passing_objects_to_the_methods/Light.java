package day34_constructors_passing_objects_to_the_methods;

public class Light {

	int noOfWatts;
	boolean indicator;
	String location;
	
	//1
	public Light() {
		this(0,false);   //this() is used to call from one constructor to another constructor , it can have parameters  //calling 2nd constructor //put it in the first line of the constructor
		System.out.println("Returning from no-argument constructor no.1");
	}
	
	//2
	public Light(int watt,boolean ind) {
		this(watt,ind,"X");
		System.out.println("Returning from constructor no.2");
		
	}

	//3
	public Light(int noOfWatts, boolean indicator, String location) {
	//	this(); bunu buraya koyarsam sanki 1. method a tekrar donerim ve infinite loop gibi olur , bu yuzden kabul edilmez, error verir
		this.noOfWatts = noOfWatts;   //esitligin iki tarafindada ayni isim var, bu compiler in kafasini karistirir, burda this i kullaniriz, object ile baglanti kurariz
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no.3");
	}
	
	

}