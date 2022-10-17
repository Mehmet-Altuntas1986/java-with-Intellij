package day40_accessmodifiers_final;

public class FinalArray {

	public static void main(String[] args) {
		
		final int[] TEAMS = {11,10};
		System.out.println(TEAMS[0]);         //11
		
		TEAMS[0] = 15;
		System.out.println(TEAMS[0]);         //15
		
		
		
		
		
		
		
		int[] nums = new int[] {20,20,40};
		
		nums = new int[] {30,30,50};  //final yokken reassignment oldu fakat asagida
		
		
		
		final int[] finalNums = {23,66,77};
		finalNums[0] = 120;
		
		
		//finalNums = new int[] {1,2,3};
		
		
		
		
		

	}

}



/*

    --- final arrays ---
    *if array is declared as final , elements of array can be changed without any problem.  ex: from 11 to 15 
    
    *arrays are objects and object variables are always references in java. when we declare an object variable as final ,it means
    that the variable cannot be changed to refer to anything else- 
      
        final kullaninilinca --> biseye referance olunca digerine olamaz
        
      
        
        
        --- final arraylist ---
    
    *follows same rules of arrays
    *we can remove or update any values
    *we cannot reassign it to another object using new keyword.
    
































*/