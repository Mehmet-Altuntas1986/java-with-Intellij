package day15_Methods_Part3;

public class Task67_LastDigit {

	public static void main(String[] args) {
		
		
		if(lastDigit(7,17)) {
			
			System.out.println("They have the same last digit");
		
		}else {
			
			System.out.println("They do not have the same last digit");
			
		}
		

	}

	public static boolean lastDigit(int num1, int num2) {
		
		if((num1%10)==(num2%10)){
			return true;
		}
		
		return false;
	}

}
