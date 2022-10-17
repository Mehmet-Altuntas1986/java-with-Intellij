package day25_arrays_continue_to_learn;

public class same_array {

	public static void main(String[] args) {

		int []array1= { 2,4,6,8,10};
		int []array2= array1;         // both references are pointing to the same object in memory, if one of them change, other one also change
		

		
		array1[0] = 200;   //2   ---200 e donustu
		
		array2[4] = 1000;   //10 --->1000 e donustu 
		
		System.out.println("The contencts of array1:");
		
		for(int value : array1) {
			System.out.println(value);
		}
		
		System.out.println();
		
		System.out.println("The contencts of array2:");
		
		for(int value : array2) {
			System.out.println(value);
		}
		
		int[] numbers = {20,0,0,30,0,0};

		
		
		
		
		
		
		
		
		
	}

}
