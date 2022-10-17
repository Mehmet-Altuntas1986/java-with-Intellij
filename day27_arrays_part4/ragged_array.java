package day27_arrays_part4;

public class ragged_array {

	public static void main(String[] args) {
		
		
int[][] array = new int[4][];   //i dont know how many columns in each row, that is why i should show them below
		
		System.out.println(array[0]);
		
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];
		
		int[][] array2 = { {} , {0,0,0,0} , {0,0,0,0,0} , {0,0} } ;   //this is same as from line 12 to 15
		
		
		                  //what happens if we dont put anything inside curly brace? ==> 
		
		
		//System.out.println(array2[0][0]);  //gives error    //means there is raw but no column
		
		//if we dont assign any value, they take default values , in int default value is 0
		
		//System.out.println(array2[0]);   //gives reference nummer--[I@15db9742
		
		
		
		
		

	}

}