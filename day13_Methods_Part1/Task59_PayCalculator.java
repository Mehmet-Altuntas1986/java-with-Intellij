package day13_Methods_Part1;

public class Task59_PayCalculator {

	public static void main(String[] args) {
		
		
		payCalculator(80,20);
		payCalculator(37,62.50);
		

	}

	public static void payCalculator(double hours,double hourlyPay) {
		
		double pay=hours*hourlyPay;
		
		System.out.println(pay + " $");
		
	}

}
