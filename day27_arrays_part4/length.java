package day27_arrays_part4;

public class length {
public static void main(String[] args) {
	

	int[][] numbers = {
			
			{1,2,3,4},            //row-0      numbers[0]= {1,2,3,4}       numbers[0].length=4
			{5,6},                //row-1      numbers[1]= {5,6}           numbers[1].length=2
			{9,10,11,23,30,50,60} //row-2      numbers[2]= {9,10,11,23,30,50,60}       numbers[2].length=7
	};
	
	//display the number of rows
	System.out.println(numbers.length);
	
	//display the number of columns in each row
	
	for(int i=0;i<numbers.length;i++) {
		
		System.out.println("The number of columns in row " + i + " is " + numbers[i].length);
		
	}
	
	System.out.println("---------");
	
	for(int i=0;i<numbers.length;i++) {   
		for(int j=0;j<numbers[i].length;j++) { 
			System.out.println(numbers[i][j]);  
			  
		}
	}

	

}

}
