package day13_Methods_Part1;

public class Task61_AgeCalculator {

	public static void main(String[] args) {
		
		
		ageCalculator(2021, 1988);
		ageCalculator(2021, 2015);
		ageCalculator(2021, 1964);
		ageCalculator(2021, 1966);
		

	}

	public static void ageCalculator(int currentYear, int birthyear) {
		
		int age = currentYear - birthyear;
		
		System.out.println(age);
		
		
	}

}
