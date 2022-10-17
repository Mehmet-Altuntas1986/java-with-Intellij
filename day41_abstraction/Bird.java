package day41_abstraction;

public abstract class Bird extends Animal {  //from abstruct class to abstruct class , inheritance is possible
/*it is optional to override here, but it is done , 
it will be not mendatory in first concrete class(parrot) implementation*/

	public Bird() {  
		super();
	}
	
	
	
	@Override
	void eat() {
		System.out.println("Bird is eating");
		
	}
	
	/*
	@Override
	void breathe() {
		// TODO Auto-generated method stub
		
	}
	*/

	abstract void fly();  //bird bir abstruct class ise icine abstruct method koyulabilir
	
/*if any abstruct class is extending another abstruct class, 
	it is optional to override the abstruct methods
	
	*yukarida abstruct i cikarirsam, bird becomes first concrete class --yani super class a direkt ulasiyor
	*
	**/
	
	/*eat , breath ,move ,fly methodlarinin hepsini implementationi olmali, eksik lik olursa hata verir*/

}