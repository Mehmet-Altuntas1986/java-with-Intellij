package day28_lab4_questions_arrays_practice;

public class question_17 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and print the difference between the largest and
smallest values in the array.

int[] x = {10,3,5,6} = > 7
int[] y = {7,2,10,9} = > 8
int[] z = {2,10,7,2} = > 8          */


		
		
		int[] x = {7,2,10,9};
		
		System.out.println(difference(x));

	}
	
	public static int difference(int[] arr) {
		
		//finding the biggest
		int max = arr[0];  //assume that
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}
		}
		
		//finding the smallest
		
		int min = max;   //assume
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		
		return max-min;
		
	}

}
