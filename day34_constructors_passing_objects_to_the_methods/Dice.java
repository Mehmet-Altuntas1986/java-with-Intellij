package day34_constructors_passing_objects_to_the_methods;

import java.util.Random;

public class Dice {


	int sides;
	int value;
	
	public Dice(int numSides) { //constructor
		sides=numSides;
		roll();
	}
	
	public void roll() {
		Random rand = new Random();
		value=rand.nextInt(sides) + 1;              //nextInt(6) olunca  1 den baslayarak 6 ya kadar, 6 dahil degil rastgele numara atar , bu yuzden arti 1 dedik
	}
	
	public int getSides() {
		return sides;
	}
	
	public int getValue() {
		return value;
	}

}