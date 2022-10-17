package day38_inheritance_continue_part_2;

public class DogTest {



		public static void main(String[] args) {
		
			
			//who is job in java to init variables
			
			Dog d = new Dog(2, 4, 1, 20, "Long Silky");  //these values are assigned in parent class
			
			d.eat(); //Dog classina git eat methodunu bul, bulamazsan eger super class varsa  ona git ve eat methodunu kullan
			
			//print name
			System.out.println(d.getName());
			
		
			
			
			
			
		}

	}