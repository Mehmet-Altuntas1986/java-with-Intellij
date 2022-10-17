package day31_arraylist;

import java.util.ArrayList;

public class remove_integer {

	public static void main(String[] args) {


		
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size());
		System.out.println(nums.isEmpty());
		System.out.println(nums.size()==0);
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString());
		
		nums.remove(5); //removes the specified index number from the list   //index numarasi yazilarak yada line 39 daki gibi object ismi yazilarak remove yapilabilir
		
                       //console dan incele
		
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5); //Converting primitive to object
		Integer n2 = Integer.valueOf(5);  //same with line 34 
		
	
		
		nums.remove(n1);  //removes the specified element from the list   //n1 index numarasi degil, n1 is an object
		
		System.out.println(nums.toString());
		
	
		
		nums.remove(new Integer(4));  //removes the specified element from the list
		
		System.out.println(nums.toString());
		
		
	}

}