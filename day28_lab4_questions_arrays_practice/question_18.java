package day28_lab4_questions_arrays_practice;

public class question_18 {

	public static void main(String[] args) {
		/* Write a function that accepts an array and prints the sum of the numbers in the
           array. Except the number 13 is very unlucky, so it does not count and numbers that
           come immediately after a 13 also do not count


int[] x = {1,2,2,1} = > 6
int[] y = {1,1} = > 2
int[] a = {1,2,2,1,13} = > 6
int[] b = {1,2,2,1,13,3} = > 6      13 ve ardindan gelen elementleri toplamiyor   */


		int[] x = {1,2,2,1,3,13,3};
		
		int sum = 0;
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i] != 13) {
				sum=sum+x[i];
			}else {
				break;    //loop tan cikar 
				
			}
		}
		
		System.out.println(sum);
	}

}
