package day28_lab4_questions_arrays_practice;

import java.util.Arrays;

public class question_14_gut_question {

	public static void main(String[] args) {
		/* Write a method that accepts 2 arrays and prints a new array containing all their elements
		  
		 
          int[] x = {1,2}        int[] y = {3,4}      = > [1,2,3,4]
          int[] x = {4,4}        int[] y = {2,2}      = > [4,4,2,2]
          int[] x = {9,2}        int[] y = {3,4}      = > [9,2,3,4]           */


		
	    int[] x = {1,2,3};
		
		int[] y = {3,4};
		
		
		int[] k = new int[x.length+y.length];    //burda yeni bir array olusturduk x ve y arraylerini element sayilarinin toplamina esit sayida element iceren
		
		
		
		for(int i=0;i<x.length;i++) {   //for k array
			
			k[i]=x[i];                 // k i stringe donusturmus olsaydik bu loop un sonunda  [1,2,3,0,0]  o lar default
			
		} 
		
		
		
		int a = 0;
		 
		for(int j = x.length;j<k.length;j++) {      //j nin donguye baslama index ini , default elementlerin basladigi index numarasiyla baslatiriz
			
			k[j]=y[a];
			a++;
		}
		
		System.out.println(Arrays.toString(k));
		
		
		
	}
	

}