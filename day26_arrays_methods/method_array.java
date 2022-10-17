package day26_arrays_methods;

import java.util.Random;

public class method_array {

	public static void main(String[] args) {
		
		printArray(3);
		
		
	}
	
	
	public static int[] createArray(int arraySize) {
		
		
		Random rn  = new Random();
		
		int[] myArray = new int[arraySize];
		
		for(int i=0;i<myArray.length;i++) {   //bu length  () sahip degil, arreyde bulunanlarin sayisini gosteriyor
			
			myArray[i] = rn.nextInt(100);
			
		}

		return myArray;
		
	}
	
	
	public static void printArray(int number) {  //bu methodun main method da cagirilmasi lazim, aksi taktirde return burada is yapamaz
		
	
		
		for(int value : createArray(number)){        //number=3
			System.out.println(value);
	
	
	
		}
		}	
}
