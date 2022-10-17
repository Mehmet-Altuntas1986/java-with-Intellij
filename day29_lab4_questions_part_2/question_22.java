package day29_lab4_questions_part_2;

public class question_22 {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints true if the number 1's is greater
than the number 4's
int[] x = {1,4,1} = > true
int[] x = {1,4,1,4} = > false
int[] x = {1,1} = > true      */
		
		
		int[] x = {1,1,4,4,4};
		System.out.println(more14(x));
	}
	
	public static boolean more14(int[] arr) {
		
		int counter1 = 0;
		int counter4 = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == 1) {
				counter1++;
			}else if(arr[i] == 4) {
				counter4++;
			}
		}
		
		if(counter1>counter4) {
			return true;
		}
		
		return false;
		
	}

}
