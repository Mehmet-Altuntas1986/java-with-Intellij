package day48_collection_part3;


import java.util.*;

public class MapExample {     //key+value kullaniliyor 

	public static void main(String[] args) {
		
		List<Integer> items2 = new ArrayList<>();
		items2.add(10);    //add is collection interface methodlarindan biri  , map icin bunu kullanamayiz cunku map interface doesnt extend to collection interface
		
		
		
		//create map object
		Map<String, Double> items = new HashMap<>();   //String is the key , and Double is the value        , ornegin product and price 
		
		
		items.put("Apple", 3.49);      //burda put metdodunu kullandik, add i kullanamadik.
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.0);
		items.put("Cherries", 4.99);
		items.put("Apple", 5.49);
		
		System.out.println(items.size());  //how many element in this collection
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());  //is it empty or not
		
		System.out.println(items.get("Apple"));   //gives apples price    get den sonra key i parantezin icine koyuyor
		System.out.println(items.get("Milk"));
		
		items.remove("Flowers");
		
		System.out.println(items.toString());
		
		System.out.println("Is Apples there? " + items.containsKey("Apple"));     //it checks if key is existing
		System.out.println("Is Flowers there?" + items.containsKey("Flowers"));
		
		items.replace("Eggs", 3.5);  //4.99 u onceki fiyati
		
		System.out.println("Price of Eggs: " + items.get("Eggs"));
		
		items.put("Milk", 2.6);
		System.out.println("Price of Milk: " + items.get("Milk"));
		
		//increase price of cherries by $2
		items.replace("Cherries", items.get("Cherries")+2);                       //replace yerinde put kullansaydik
		System.out.println("Price of Cherries: " + items.get("Cherries"));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}