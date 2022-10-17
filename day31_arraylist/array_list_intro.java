package day31_arraylist;

import java.util.ArrayList;

public class array_list_intro {

	public static void main(String[] args) {


		
		
		//Creating an ArrayList
		
		ArrayList<String> names = new ArrayList<>();  //examine pdf   //initial 10 values if nothing is put inside braces //size is changeable with new adding items
		                                              //< > wrapper class objects can be put (on the right side) inside <   > but not mendatory
		
		ArrayList<Integer> nums = new ArrayList<>();      //you cannot put inside< > primitive data types , in arraylist objects are listed ,stored
		
		
		//Assigning values to arrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");       //add kullanilinca  olusturulan listenin en sonuna gider
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		//Reading from arrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
		System.out.println(names.toString());
		
		
		
		
		
		
		
		

	}

}