package day14_Methods_Part2;

public class ValueReturn {

	public static void main(String[] args) {

		int x = sum(2, 3);
		
		System.out.println(x);
		System.out.println(sum(2,3));
		

		
		

	}

	public static int sum(int num1, int num2) {

		int result; // local variable
		result = num1 + num2;

		return result;
		
		
		
		
		
		

	}

}
