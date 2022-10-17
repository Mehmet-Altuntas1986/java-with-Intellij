package day38_inheritance_continue_part_2;

public class FullTimeEmployee extends Employee {

	@Override
	void calculatePay(int hours, double rate) {
		double total = (hours * rate)*1.05;
		System.out.println("FullTime Emplyee Total Pay:" + total);
	}
	
	
	
	
}