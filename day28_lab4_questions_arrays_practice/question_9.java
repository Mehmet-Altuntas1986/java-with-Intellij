package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_9 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints a new array with double the length
		 
        where its last element is the same as the original array,
        
           int[] x = {4,5,6}; = > [0,0,0,0,0,6]          */


		
		
		int[] x = {1,2,3,6,7};
		
		System.out.println(Arrays.toString(makeLast(x)));
		

	}
	
	public static int[] makeLast(int[] arr) {
		
		int[] newArray = new int[2 * arr.length];       //we formed a new array that has 10 elements but they are all default values
		//newArray[0]=1;
		//newArray[1]=2;
	
		
		
		
		newArray[newArray.length-1] = arr[arr.length-1];
		
		return newArray;   //leave the method now
		
		
	}

}


//console has 0 values, they are default values   //bir array var dedik fakat icindeki degerleri gostermezsek,
//bilgisayar otomatik olarak default degerleri yapistirir