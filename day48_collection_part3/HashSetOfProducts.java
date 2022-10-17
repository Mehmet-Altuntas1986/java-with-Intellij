package day48_collection_part3;

import java.util.*;            //Set is in the util package 

import day46_collection_part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		Set<Product> prodSet = new TreeSet<>();  //create set collection and add new products  //product farkli package da oldugundan import ettik
		
		prodSet.add(new Product("book",25.99));  //collection is holding product objects , give me the objects which created by product class , bu yuzden -->call constructor with new keyword
		
		prodSet.add(new Product("book", 19.99));  //constructor in parametreleri var, day 46 i ac ve product class i ac
		
		prodSet.add(new Product("magazine", 7.99));
		
		System.out.println(prodSet.toString());
		
		//print each product by using for each loop
		for(Product p : prodSet) {
			System.out.println(p.getPrice());   //day46 de ( private double price)  price was encapsulated bu yuzden getter kullandik 
		}
		
		//print each product by using forEach method  (lambda kullanildi)
		
		prodSet.forEach(x -> System.out.println(x.getName()));  //video da x degil p kullandi, sonuc ayni ,ismi degisik olabilir
		
		
		
		
		

	}

}

//List, queue,set  interfaces are extending collection interface but map interface  is not extending to it