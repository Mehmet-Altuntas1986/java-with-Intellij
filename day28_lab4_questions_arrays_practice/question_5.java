package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_5 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints an array with the elements "rotated
left”
int[] x = {1,2,3}; = > [2,3,1]
int[] y = {17,12,10,8}; = > [12,10,8,17]                      //first one is becoming last
int[] a = {7,0,0}; = > [0,0,7]             */
		
		
		
		
		
		int[] x = {17,12,10,8};    		
		System.out.println(Arrays.toString(rotateLeft(x)));

	}
	
	public static int[] rotateLeft(int[] arr) {
		
		int x = arr[0]; //17
		
		
		for(int i=0;i<arr.length-1;i++) {
			
			arr[i] = arr[i+1];                //her adimda sola dogru bir kayiyor , arr[1]   is going to arr[0]
		}
		
		arr[arr.length-1] = x;      //x arr in ilk elementiydi , burda son elementi oldu loop bitince
		
		return arr;
		
	}

}