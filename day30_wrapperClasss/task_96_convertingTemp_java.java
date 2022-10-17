package day30_wrapperClasss;

import java.util.Arrays;

public class task_96_convertingTemp_java {

	public static void main(String[] args) {
//		String str1 = "Today weather is sunny and 89 degree. It is a perfect day to practice java.";
//
//		• Write a program to output: 72 degree is equal to 22.22 celcius.  ==>  (C = (F - 32) * 5/9;)
//		
		
		
		
		
		
		String str1 = "Today weather is sunny and 72 degree. It is a perfect day to practice java.";
		
		
		String[] arr = str1.split("and ");  //and leri cikarip yerine  virgul koyarak array yapildi, her virgul arasinda bir array elementi var 

		System.out.println(Arrays.toString(arr));
		
		
		
		System.out.println("----------------------------");
		
		
		arr = arr[1].split(" degree");  //boslugu almayi unutma
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		System.out.println("----------------------------");

		
		String degree = arr[0];  //72   //bu 72 string , bir sonraki line da onu primitiv data ya cevirecegiz
		
		double degreeF = Double.parseDouble(degree);  //parcing ile string i  double a cevirdik.
		
		double degreeC = (degreeF - 32) * 5/9;
		
		
		
		System.out.println(degreeF + " degree is equal to " + Math.round(degreeC) + " celcius");
		
		
		
				

		
		

		}

	}