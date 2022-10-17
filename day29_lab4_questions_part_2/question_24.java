package day29_lab4_questions_part_2;

public class question_24 {

	public static void main(String[] args) {
		/*  A value is "everywhere" in an array if for every pair of adjacent(komsu) elements in the array, at
           least one of the pair is that value.

        Write a method that accepts an array and a number, and prints true if the given number
        is everywhere in the array.

    int[] x = {1, 2, 1, 3};
    int a = 2;   given number   //2 den sonra gelen komsu elementler 1 ve 3 , 2 sinden biri 2 ye esit olmadigindan false
    Output: false
    
    int[] x = {1, 2, 1, 3};
    int a = 1; //given number
    Output: true     */
		
		
		//given number is an element, kendisinden sonra gelen 2 elementten en az birine esitse , true
		
		
		
		int[] x = {1,2,1,2};
		int a = 2;  //given number
		
		System.out.println(isEverywhere(x, a));

	}
	
	public static boolean isEverywhere(int[] arr,int number) {
		
		for(int i=0;i<arr.length-2;i++) {
			
			if(arr[i]==number && (arr[i+1]==number || arr[i+2]==number)) {
				   
				return true;
			}
			
		}
		
		return false;   //exits the method after return //be careful to put return  out of the loop
		
		
		
		
	}

}