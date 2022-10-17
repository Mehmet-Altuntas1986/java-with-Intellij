package day28_lab4_questions_arrays_practice;

public class question_19_gut_question {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints the total of the numbers in the
          array, except ignore sections of numbers starting with a 6 and extending to the
          next 7 (every 6 will be followed by at least one 7).


         int[] x = {1,2,2} = > 5
         int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
         int[] a = {1,1,6,7,2} = > 4
         int[] b = {1,1,6,2} = > 2                           //6 dan sonra 7 gelmezse 
         int[] c = {1,2,2,6,99,99,7,3,4} = > 12         */


		
	int[] x = {1,2,7,6,99,99,3};
		
		int sum = 0;
		
		boolean boolCheckSix = false;
		
		for(int i=0;i<x.length;i++) {
			
			if(boolCheckSix) {                  //compiler from line 26 jumps to line 34
				
				if(x[i] == 7 ) {
					
					boolCheckSix = false;   // boylece sum yeniden calisir, else e gider compiler dongulerde
				}
				
				
			}else if(x[i] == 6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum = sum + x[i];
				
				
			}
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		}

	}