package day31_arraylist;

import java.util.ArrayList;

public class cities {

	public static void main(String[] args) {


		
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString());
		
		//Print each city by using for-each loop seperated by space
		
		for(String city : cities) {
			System.out.println(city + " ");
		}
		
		System.out.println("----------------------------");
		
		//Print each city by using for-iterator loop
		
		for(int i=0;i<cities.size();i++) {
			System.out.println(cities.get(i));
		}
		
		System.out.println("----------------------------");
		
		System.out.println("Removing Baku");
		cities.remove("Baku"); 
		
		cities.remove("New York");        //it doesn't give error even though there is no new york in arraylist
		
		System.out.println(cities.toString());
		
		System.out.println("----------------------------");
		
		cities.add(0, "Arlington"); //belrtigimiz index numarasina ekler
		cities.add(1,"Istanbul"); //line 48 de index numarasina 1 dersek bu line 49 dan dolayi 1 e arligton ekleyemez ,bir saga kayar ve 2 numarali index numarasina arligton koyar
		
		System.out.println(cities.toString());
		
		cities.add(2, "Ankara");
		
		System.out.println(cities.toString());
		
		System.out.println("----------------------------");
		
		int indx = cities.indexOf("Istanbul");
		System.out.println(indx);
		
		System.out.println(cities.indexOf("Bursa"));
		
		System.out.println("----------------------------");
		
		cities.clear();  //removes everything in the Arraylist
		boolean empty = cities.isEmpty();
		System.out.println(empty); //true
		
		
		
		
		
		
		
	}

}