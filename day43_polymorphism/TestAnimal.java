package day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		
		
		Animal animal = new Animal();
		
		Animal dog = new Dog();
		
		Animal bird = new Bird();
		
		animal = new Cat();  //animal is pointing different object now
		
		//Bird bird2 = new Animal(); //error  cunku esitligin sol tarafindaki parent class sag tarafindaki child class a ait olmali -->polymorphism
		
		
		
		
		
		
		
	
	}

}

class Animal{
	
}

class Dog extends Animal{}

class Bird extends Animal{}

class Cat extends Animal{}