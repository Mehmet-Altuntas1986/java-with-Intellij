package day28_lab4_questions_arrays_practice;

public class question_16 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints the number of even numbers in the
array.


int[] x = {2,1,2,3,4} = > 3
int[] y = {2,2,0} = > 3
int[] z = {1,3,5} = > 0          */


		
	int[] x = {2,1,2,3,7};
		
		System.out.println(countEvens(x));
		
	}
	
	public static int countEvens(int[] arr) {
		
		int counter = 0;
		
		for(int value : arr) {
			
			if(value%2==0) {
				
				counter++;
				
			}
		}
		
		return counter;
		
		
	}

}