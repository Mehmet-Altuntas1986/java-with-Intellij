package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_11 {

	public static void main(String[] args) {
		/* Write a method that accepts an array, and if there is a 2 in the array immediately
followed by a 3, set the 3 element to 0. Print the changed Array

  int[] x = {1,2,3} = > [1,2,0]
  int[] x = {2,3,5} = > [2,0,5]
  int[] x = {1,2,1} = > [1,2,1]
  int[] x = {11,2,13,3,2} = > [11,2,13,3,2]       */


		
		int[] x = {1,2,3};
		int[] y = {2,0,5};
		int[] a = {11,2,13,2,3};     //length 5       //max index 4
		
		System.out.println(Arrays.toString(fix23(x)));
		System.out.println(Arrays.toString(fix23(y)));
		System.out.println(Arrays.toString(fix23(a)));
		
		

	}
	
	public static int[] fix23(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {   //because of line 36 , we put here -1 . in this way there is no boundary error
			
			if(arr[i]==2  && arr[i+1]==3) {
				
				arr[i+1]=0;
				
			}
		}
		
		return arr;
		
	}

}