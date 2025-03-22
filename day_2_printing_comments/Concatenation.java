package day_2_printing_comments;

import java.sql.SQLOutput;

public class Concatenation {

	public static void main(String[] args) {
		 //                             result
		System.out.println("a"+ 1);            //a1
		System.out.println("a"+      1);       //a1
		System.out.println("a"+.1);            //a0.1     noktayi sifir gibi algilamis
		//System.out.println("a"+  .    1);    //error
		//System.out.println("a"+      _1);    //error
		System.out.println("a"+      1);   //birin onune bu isaretler konursa  ?  ,  "   ""   _  #  '  hata verir
		System.out.println("a"+      -1);  //a-1

		System.out.println(5+      -1);  //4

		System.out.println("Hello, my number is 10");
		System.out.println("Hello, my number is " + "10");
		System.out.println("Hello, my number is " + 10);
		
		int number = 10;
		System.out.println("Hello, my number is " + number);

	}

}
