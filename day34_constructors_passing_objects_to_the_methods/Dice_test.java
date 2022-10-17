package day34_constructors_passing_objects_to_the_methods;

public class Dice_test {

	public static void main(String[] args) {
	
		final int SIX_SIDES=6;
		Dice sixDice = new Dice(SIX_SIDES);

		rollDice(sixDice);
	}
	
	public static void rollDice(Dice d) { //Dice referance name//if you want to bring something from outside to inside
		                                  //a method , we use parameters
		//Rolling a 6 sided dice
		System.out.println("Rolling a " + d.getSides() + " sided dice ");
		
		//The dice's value : 5
		System.out.println("The dice's value : " +  d.getValue());
	}
	


}
