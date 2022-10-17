package day47_collection_part2;

import java.util.*;


public class LoopSet {

	public static void main(String[] args) {
		
		Set<Integer> numSet = new HashSet<>();
		numSet.add(50);
		numSet.add(50);

		numSet.add(543);
		numSet.add(1150);
		numSet.add(550);
		numSet.add(570);
		numSet.add(93);
		numSet.add(5000);
		numSet.add(950);
		
		for(Integer n : numSet) {
			System.out.print(n + "|");
		}
		
		System.out.println();
		
		numSet.forEach(n -> System.out.print(n + "|"));  //look at console
		
		
		
		

	}

}

/*  HashSet--> onemli bir konu degil

 
• HashSet class is used to create a collection that uses a hash table for
storage.
• HashSet contains unique elements only.
• HashSet class is not synchronized.
• HashSet doesn't maintain the insertion order. Here, elements are
inserted on the basis of their hashcode.*/