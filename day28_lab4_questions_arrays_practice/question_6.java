package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_6 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and figure out which is greatest element in the
array, a and set all the other elements to be that value. Print the changed array.
int[] x = {1,2,3}; = > [3,3,3]
int[] y = {11,5,9}; = > [11,11,11]
int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]  */
		
		int[] x = {1,20,3,0,0,0,0,0,0,0,125};
		
		System.out.println(Arrays.toString(maxEnd(x)));

	}
	
	public static int[] maxEnd(int[] arr) {
		
		int max = arr[0];               //logic is that i will assume first one is the greatest then if second one is greater , i will do reassignment 
		
		for(int i=0;i<arr.length-1;i++) {  // -1 because line 28 could give boundary error if not put -1
			
			if(arr[i+1]>max) {
				
				max = arr[i+1];   //reassignment
				
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i] = max;       //max degeri  butun index lerdeki numaralara giderek,reassignment ile max degerine donusturuyor
		}
		
		return arr;
	}

}