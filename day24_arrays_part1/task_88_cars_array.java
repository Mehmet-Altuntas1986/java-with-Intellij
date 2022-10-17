package day24_arrays_part1;

import java.util.*;

public class task_88_cars_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int price = 0;
		
		String[] car = new String[7];     //line 14-22 arasi yerine boyle yapilabilir    String []car={ "Honda", "Toyota","Nissan","BMW","Mercedes","Porsche","Ferrari"  };
		                                 // array in length i  index numarasinin en sona ulasmis haline esit           System.out.print(car.length);  //7

		car[0]="Honda";
		car[1]="Toyota";
		car[2]="Nissan";          
		car[3]="BMW";
		car[4]="Mercedes";
		car[5]="Porsche";
		car[6]="Ferrari";
		
		System.out.print("Select your car:");
		
		int indexCar = sc.nextInt();   //user writes a number
		
		String selectedCar = car[indexCar];
		
		switch(selectedCar) {
		case "Honda": case "Toyota": case "Nissan":
			price = rn.nextInt((40000-20000)+1)+20000;                  
			break;                                                       
		case "BMW": case "Mercedes":                                    
			price = rn.nextInt((80000-50000)+1)+50000;
			break;
		case "Porsche": case "Ferrari":
			price = rn.nextInt((150000-100000)+1)+100000;   //price en az 100000 olabilir   , en fazla 150000 olabilir
			break;              
		default:
			System.out.println("Invalid car");
			
		}
		
		System.out.println("Price for selected car is " + price);
		
		
		
		
		//int []x,y,z;   can be written

	}}

/*Task-88
 
• Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes, Porsche,
Ferrari)
• Ask user to enter an index number to choose his dream car.
• Print the price for selected car.
Car prices :
Honda – Toyota – Nissan (Random price between 20000 and 40000)
BMW-Mercedes(Random price between 50000 and 80000)
Porsche - Ferrari(Random price between 100000 and 150000)
• Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min

*/

