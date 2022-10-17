package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {
		
		int[] numsArray = {30,50,100,5,6};
		
		String[] days = new String [7];
		days[0] = "Monday";
		
		Object[] obj = {2,"apple",true};  //Array
		
		ArrayList<Integer> numberList = new ArrayList<>();   //hatirla -->Integer is wrapper class
		
		List<Integer> numberList2 = new ArrayList<>();  //INSTEAD OF ARRAYLIST, PUT  List interface --> polymorpic bir yapi olustur
		
		Collection<Integer> numberList3 = new ArrayList<>(); //burdada polymorphic yapi var 
		
		numberList.add(40);
		numberList.add(50);
		numberList.add(100);   //arraylist e eklemeler yapiyoruz
		
		
		System.out.println(numsArray[0]);
		System.out.println(numberList.get(0));
		
		
		
		
		
		
		
//list is interface        , arraylist is a class which implements to List interface	
		
		
		

	}

}