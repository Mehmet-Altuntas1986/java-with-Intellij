package day27_arrays_part4;

public class task_95 {

	public static void main(String[] args) {
//		                       math   chemistry     history     sport
//        student 1-->          68        75          54         80
//	      student 2-->          100       64          20         50
//	      student 3-->          10        35          40         90

//	      1.calculate the avg score of student 1
//	      2.calculate the total math scores
	
	

		int[][] scores = {
				{68,75,54,80}, //student-0
				{100,64,20,50},
				{10,35,40,90}                     //icerdeki herbir curly braces 1 row u temsil ediyor
		};
		
		int sum=0;
		for(int column=0;column<scores[0].length;column++) {
			
			sum = sum + scores[0][column];
			
			     // 0 + 68 =68
			    //  68 + 75 =
			
		}
		
		System.out.println(sum/scores[0].length);
		
		int sum2=0;
		for(int row=0;row<scores.length;row++) {
			
			sum2 = sum2 + scores[row][0];
			
		}
		
		System.out.println(sum2);
		
		
		
		
		
		
		
		
		
		
		
	}


	
	
	
	}

