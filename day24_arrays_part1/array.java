package day24_arrays_part1;

public class array {

	public static void main(String[] args) {

		int[] myList = {10,20,30,40};   ////new kulanmazsak bu sekilde olusturabiliriz array object ini , bu yol daha kolay
		        // index 0  1  2  3
		
		
		String[] myArray = {"Apple","Orange","Watermelon"};   //new kulanmazsak bu sekilde olusturabiliriz array object ini , bu yol daha kolay
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		
		System.out.println(myList.length);
		System.out.println(myArray.length);
		
		for(int i=0;i<myList.length;i++) {
			System.out.println(myList[i]);    //i index numarasi         
		}
		
		int[] scores = {80,90,100,35,60,72,64,30,10,5,3,99,89,80,90,100,35,60,72,64,30,10,5,3,99,89};
		
		int sum = 0;
		
		for(int i=0;i<scores.length;i++) {
			
			sum = sum + scores[i];       
		}                
		
		System.out.println("Sum is:" + sum);
		System.out.println("Total element in array is:" + scores.length);
		System.out.println("Average is:" + sum/scores.length);
	}

}
