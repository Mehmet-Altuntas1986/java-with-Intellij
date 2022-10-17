package day31_arraylist;

import java.util.ArrayList;

public class add_all {

	public static void main(String[] args) {


		ArrayList<String> l1 = new ArrayList<>();
		l1.add("Java");
		l1.add("JS");
		
		ArrayList<String> l2 = new ArrayList<String>();
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1.toString());
		System.out.println(l2.toString());
		
		l2.addAll(l1);                           //addAll methodu ile l1 items are added in the right side of l2 items  //reassignment var
		System.out.println(l2.toString());
		
		l1.addAll(l2);
		System.out.println(l1.toString());
		
		

		
	}

}
