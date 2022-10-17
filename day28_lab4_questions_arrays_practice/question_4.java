package day28_lab4_questions_arrays_practice;

public class question_4 {

	public static void main(String[] args) {
/*  Write a method that accepts an array and prints the sum of all elements in the array
 
int[] x = {1,2,3}; = > 6
int[] y = {5,11,2}; = > 18
int[] z = {7,0,0}; = > 7
int[] a = {3,-2,10,4}; = > 15    */
		
		
		
		int[] x = {1,2,3};
		
		int[] y = {-4,2,0};
		
		int a = sumElements(x);                                 //sum(X)  holds the value   return sum;    //x reference nummer 
		System.out.println(a);
		
		System.out.println(sumElements(y));
		
		

	}
	
	public static int sumElements(int[] arr) {       //once methodu olustur
		
		int sum = 0;  //assumption
		
		for(int values :arr ) {         //values are the elements in the array
			
			sum = sum + values;
			
			
		}
		
		return sum; 
		
		
	}

}
		
		