package day28_lab4_questions_arrays_practice;

public class question_20_flag {

	public static void main(String[] args) {
		/* Write a method that accepts an array and prints true if the array contains a 2
next to a 2 somewhere.

int[] x = {1,2,2} = > true
int[] y = {1, 2, 1,2} = > false
int[] a = {2,1,2} = > false
int[] b = {2,2,1,2} = > true            */



			
			int[] x = {1,2,2,3};
			
			boolean flag = false;
			
			
			for(int i=0;i<x.length-1;i++) {
				
				if(x[i]==2 && x[i+1]==2) {
					flag = true;
					break;
				}
			}
			
			
			
		
			if(flag) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}

		}

	}
