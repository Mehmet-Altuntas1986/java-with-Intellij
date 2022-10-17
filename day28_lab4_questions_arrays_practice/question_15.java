package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_15 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and swap the first and last element in the
array. Print the modified array.

      int[] x = {1,2,3,4}    = > [4,2,3,1]
      int[] y = {1,2,3}      = > [3,2,1]
      int[] z = {8,6,7,9,5}  = > [5,6,7,9,8]        */


		
		
	int[] x = {8,6,7,9,5};
		
		System.out.println(Arrays.toString(swapEnds(x)));
		
		
	}
	
	
	public static int[] swapEnds(int[] arr) {
		
	
		int temp = 0; //dummy
		
		temp = arr[0];          //ilkonce 1.elementin degerini sakladi ki sonra onu reassignment ta kullanabilsin
		        //8
		
		arr[0] = arr[arr.length-1];
		           //5
		
		arr[arr.length-1] = temp;
		                     //8
		return arr;
		
	
	}
	
	

}