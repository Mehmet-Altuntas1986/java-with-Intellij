package day28_lab4_questions_arrays_practice;

public class question_12 {

	public static void main(String[] args) {
		/* Write a method that accepts two arrays and prints how many of the arrays have 1 as their first
element

int[] x = {1,2,3}
Int[] y = {1,3}
Output = 2
int[] x = {7,2,3}
Int[] y = {1}
Output = 1
int[] x = {3,2,4}
Int[] y = {4,3,4}
Output = 0               */


		
		int[] x = {0,2,3};           // 2 tane array var    //sadece 1 tane array sarti sagliyor
		int[] y = {1,3};
		
		
		
		
		
		
		
		
		System.out.println(start1(x,y));
		

	}
	
	public static int start1(int[] arr1,int[] arr2) {
		
		int counter = 0;      //ilk elementi 1 olan kac tane array var , onu sayiyorum
		
		if(arr1[0] == 1) {
			counter++;
		}
		if(arr2[0] == 1) {
			counter++;
		}
		
		
		return counter;
		
	}

}