package day26_arrays_methods;

import java.util.Scanner;

public class method_arrays_2 {

	public static void main(String[] args) {

		
		
		
		System.out.println(findCar(3,"Honda"));  //true
		
	}
	
	
	public static String[]  createArray(int arraySize) {
		
		
		Scanner sc  = new Scanner(System.in);
		
		String[] carArray = new String[arraySize];  //arraysize bir rakam, kac oge oldugunu gosteriyor array de
		
		
		for(int i=0 ; i<carArray.length ; i++) {
			
			System.out.print("Enter your car #" + (i+1));
			carArray[i] = sc.next();
		}
		
		return carArray;
		
	}
	
	
	public static boolean findCar(int value,String toFindCar) {
		
		
		for(String car : createArray(value)) {  //calling the method   // int arraysize and value  eslesiyor
			
			if(car.equalsIgnoreCase(toFindCar)) {
				
				return true;
			}
		}
		
		return false;
		
	}
	
	
		
		
		
		
		
		
	}


