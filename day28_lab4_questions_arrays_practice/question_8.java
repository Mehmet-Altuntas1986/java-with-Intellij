package day28_lab4_questions_arrays_practice;

public class question_8 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints true if it contains a 2 or a 3
		 * 
int[] x = {2,5}; = > true
int[] y = {4,3}; = > true
int[] z = {4,5}; = > false            */
	

		int[] x = {2,5};
		int[] y = {4,3};
		int[] z = {4,5};
		
		System.out.println(has23(x));
		System.out.println(has23(y));
		System.out.println(has23(z));
		

	}
	
	public static boolean has23(int[] arr) {
		
		for(int value : arr) {
			
			if(value==2 || value==3) {
				
				return true;   //return ile method dan cikar    //break te loop tan cikar
			}
			
		}
		
		return false;
	}

}