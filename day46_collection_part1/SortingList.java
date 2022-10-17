package day46_collection_part1;

import java.util.*;

public class SortingList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();  //created an ArrayList
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		
		System.out.println("Before sorting");
		System.out.println(list.toString());
		
		Collections.sort(list);          //sort is a static method iN COLLECTION   //INTERVIEW DA HOW DO YOU SORT AN ARRAYLIST ,ANSWER --> Collections.sort(list);
		
		System.out.println("After sorting");
		System.out.println(list.toString());
		
		List<Product> prodList = new ArrayList<Product>(); //  < ARASINA CLASS ISMI KOYULUR >        , PRODLIST IS REFERENCE NAME
		
		Product p = new Product("table", 81.36);
		
		prodList.add(new Product("spoon", 13.99));
		prodList.add(new Product("bag", 100.00));
		prodList.add(new Product("shoes", 59.99));
		prodList.add(new Product("computer", 2100.59));
		prodList.add(p);
		
		System.out.println(prodList.toString());
		
		System.out.println("Before sorting");
		System.out.println(prodList.toString());
		
		//normalde objectleri sort yapamayacakti bu yuzden Product class inda comparable interface kullandik               public class Product implements Comparable>Product> 
		
		Collections.sort(prodList);   //Objectleri sort  yapabilmesi icin  ( public class Product implements Comparable>Product>  )   comparable interface kullanilir   (how to object sorting is done) 
		
		System.out.println("After sorting");
		System.out.println(prodList.toString());
		
		Product p1 = new Product("spoon", 25.34);
		Product p2 = new Product("chair", 7.99);
		System.out.println(p1.compareTo(p2));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}