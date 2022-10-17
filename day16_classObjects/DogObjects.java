package day16_classObjects;

public class DogObjects {

	public static void main(String[] args) {

		Dog dog1 = new Dog();

		Dog dog2 = new Dog();

		Dog dog3 = new Dog();

		dog1.age = 10;
		dog1.color = "Red";
		dog1.breed = "Maltese";
		dog1.name = "Rover";

		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		System.out.println(dog1.name);

		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		System.out.println("-------------------------------");
		
		dog2.age = 5;
		dog2.color = "Black";
		dog2.breed = "Pitbull";
		dog2.name = "Shadow";

		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		System.out.println(dog2.name);

		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		System.out.println("-------------------------------");
		
		dog3.age = 1;
		dog3.color = "White";
		dog3.breed = "Siberian Husky";
		dog3.name = "Snow";

		System.out.println(dog3.age);
		System.out.println(dog3.color);
		System.out.println(dog3.breed);
		System.out.println(dog3.name);

		dog3.barking();
		dog3.hungry();
		dog3.sleeping();
		

	}

}
