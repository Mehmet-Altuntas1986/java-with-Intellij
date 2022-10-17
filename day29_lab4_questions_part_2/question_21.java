package day29_lab4_questions_part_2;

public class question_21 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints true if the sum of all 2's in the
array is exactly 8


int[] x = {2, 3, 2, 2, 4, 2} = > true
int[] x = {2, 3, 2, 2, 4, 2, 2} = > false
int[] x = {1, 2, 3, 4} = > false      */
		
		
		
	int[] x = {2,3,2,2,2,4};
		
		System.out.println(sum28(x));
		
	}
	
	public static boolean sum28(int[] arr) {
		
		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] ==2) {
				
				sum = sum + arr[i];
			}          
		}
		
		if(sum == 8 ) {
			return true;
		}
		
		return false;
		
	}

}