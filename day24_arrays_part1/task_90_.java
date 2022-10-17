package day24_arrays_part1;

public class task_90_ {
	public static void main(String[] args) {
//		Task-90
//		#Create a car array that holds 6 car names inside
//		#Check if your array has the car name “Honda”
//		#If it is , print “ I found your car Honda in this array”
//		#If it is not, print “ I could not find your car Honda in this array”
		
		
		
	String[] cars = {"Toyota","Nissan","BMW","Mercedes","Honda"};
		
		boolean flag = false;                  //boolean daki amac ..
		
		for(int i=0;i<cars.length;i++) {
			
			
			if(cars[i].equals("Honda")) {
				
				flag=true;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it ");
		}
		
		

	}


		
		
		
		
	

}
