package day47_collection_part2;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {   //Set is an interface  which Hashset class  is implementing to it
	
		Set<Integer> mySet = new HashSet<>();  //Polymophic way ile object olusturuldu
		
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);     //3 tane 1000 var ama sadece 1 tanesi print olur Set ile
		
		System.out.println(mySet.toString());
		System.out.println(mySet.size());  // print olduktan sonra kac tane unique element oldugunu gosterir
		
		
		
		List<String> list = Arrays.asList("23","23","a","a","bb","jj","q","t","t");
		
		Set<String> unique = new HashSet<>(list);
		
		System.out.println(list.toString());      //dublicate is possible , order is preserved, there are index numbers of the elements
		System.out.println(unique.toString());     //each element is unique, order is not preserved  
		
		
		TreeSet<Integer> tSet  = new TreeSet<>();     //TreeSet class i
		tSet.add(500);
		tSet.add(100);
		tSet.add(10);
		tSet.add(5);
		tSet.add(8000);
		tSet.add(100);
		
		System.out.println(tSet.toString());
		
		
		

	}

}
//try to see the difference between set and list in the console