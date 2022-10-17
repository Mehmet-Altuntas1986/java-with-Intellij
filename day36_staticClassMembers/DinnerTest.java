package day36_staticClassMembers;

public class DinnerTest {

	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total Slices:" + Dinner.pizzaSlice);
		
		dad.takeASlice();
		kid.takeASlice();
		mom.takeASlice();
		
		System.out.println("Total Slices:" + Dinner.pizzaSlice);  //static i kaldirirsam Dinner classindan pizzaslice variable (instance variable a donusur, yani objecte ait olur,
		                                                          //bu yuzden hata verir.Dinner.pizzaslice diyemem o durumda
		
		kid.takeASlice(3); //methodu 3 kere kullanir
		dad.takeASlice(2);
		
		//mom.takeASlice();
		
		System.out.println("Total Slices:" + Dinner.pizzaSlice);
		

	}

}