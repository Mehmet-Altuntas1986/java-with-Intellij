package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;

public class LoopMap {

	public static void main(String[] args) {
		
		Map<String,String> dataMap = new HashMap<>();   //polymorphism var   parent interface -child interface
		
		dataMap.put("url", "qa3.vytrack.com");   // (key ,value)
		dataMap.put("username", "user66");
		dataMap.put("password", "abc66");
		dataMap.put("browser", "chrome");
		dataMap.put("truckdriver", "Bob");
		dataMap.put("storemanager", "John");
		
		//keySet - > returns set with all the keys in the map
		//values - > returns with all the values in the map 
		System.out.println("++++KEYS++++");
		for(String key : dataMap.keySet() ) { 
			System.out.println(key);
		}
		
		System.out.println("++++VALUES++++");
		for(String value : dataMap.values()) {   //values() adli methodu kullanarak butun value lari loop ile yazdirdik
			System.out.println(value);
		}
		
		System.out.println("++++KEY | VALUES++++"); //key ve value lari nasil yazdiririm kolay bir sekilde -lambda experision
		
		for(String key : dataMap.keySet()) {
			System.out.println(key +"|"+dataMap.get(key));
		}
		
		//Looping by using forEach method
		dataMap.forEach((k,v ) -> System.out.println(k + "|" + v));
		
		//in different ways to use map
		
		Map<Integer,Product> studentMap = new HashMap<>();   //value is  object
		
		Map<String,String[]> data = new HashMap<>();         //value is an array
		
		Map<Integer,List<String>> data2 = new HashMap<>();  //value is an List
		
		Map<Integer,List<String[]>> data3 = new HashMap<>();  //value is list including String  arrays 
		
		Map<String,Map<Integer,Integer>> data4 = new HashMap<>();  //value is another map
		
		Map<String,Map<Integer,Product>> data5 = new HashMap<>();
		
		
		
		
		//there are different enviroments ex:
//		qa
//		systest
//		dev
//		production   bu enviromentlarda kullanacagimiz passport ve bazi seyler farkli olacak 
		 
		
		
		

	}

}