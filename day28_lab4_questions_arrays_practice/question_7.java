package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_7 {

	public static void main(String[] args) {
		/*     Write a method that accepts 2 arrays and prints the second array containing the first
		 
               and last elements from the first array.
               
               

    int[] x = {1,2,3};
    int[] y = {}; = > [1,3]
    int[] a = {7,4,6,2};
    int[] b = {}; = > [7,2]                 */
		
		
		
		int[] x = {1,2,3,14,5,60,9};
		int[] y = {};
		
		System.out.println(Arrays.toString(makeEnds(x, y)));
		
	}
	
	public static int[] makeEnds(int[] arr1, int[] arr2) {
		
		arr2 = new int[2];
		
		arr2[0] = arr1[0];   //first element of arr1 is going, and becoming first element of arr2 with reassignment
		
		
		arr2[1] = arr1[arr1.length-1];                       //arr2 has only 2 element, that is why we put 1  -->arr2[1]    //reassignment
		
		
		return arr2;
		
	}
	
	

}
