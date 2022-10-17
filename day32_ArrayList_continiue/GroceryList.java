package day32_ArrayList_continiue;

import java.util.ArrayList;

public class GroceryList {       //templates to use in grocerylistmain class inda
	
	
	
	//main methodu koymadi
	
	ArrayList<String> groceryList = new ArrayList<>();
	
	public  void addGroceryItem(String item) {   //bu methodun icine scanner koysak ,diger methodlarda calismaz, sadece bu methodun
		                                         //parantezleri arasinda islme gorur. main methoddan once konuldugunda butun methodlarda calisir ,extra static keyword koyulur onlerinde
		groceryList.add(item);
	}                                             //static means belongs to class   //template de static koymadi
	
	public void printGroceryList() {
		System.out.println("You have " + groceryList.size() + " items in your grocery list" );
		for(int i=0;i<groceryList.size();i++) {
			System.out.println((i+1) + ". " + groceryList.get(i));
			//System.out.println();
		}
	}
	
	public void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position,newItem);         //to this position, new item goes   //replace
		System.out.println("Grocery item " + (position+1) + " has been modified");
	}
	
	public void removeGroceryItem(int position) {   //position--->index numarasi
		groceryList.remove(position);
	}
	
	public String findItem(String searchItem) {
		int position = groceryList.indexOf(searchItem);
		if(position>=0) {
			return groceryList.get(position);
		}
		return null;
	}
	
	

}

//once groceryListMain class ini olusturdu, en son buraya gelip methodlar yazdi


/*
Press
0 - To print choice options.
1 - To print the list of grocery items.
2 - To add an item to the list.
3 - To modify an item in the list.
4 - To remove an item from the list.
5 - To search an item from the list.
6 - To quit the application.
Enter your choice: 0

Press
0 - To print choice options.
1 - To print the list of grocery items.
2 - To add an item to the list.
3 - To modify an item in the list.
4 - To remove an item from the list.
5 - To search an item from the list.
6 - To quit the application.
Enter your choice: 1
You have 0 items in your grocery list
Enter your choice: 2
Please enter the grocery item: 
milk
Enter your choice: 2
Please enter the grocery item: 
bread
Enter your choice: 2
Please enter the grocery item: 
sugar
Enter your choice: 1
You have 3 items in your grocery list
1. milk
2. bread
3. sugar
Enter your choice: 3
Enter item number: 
1
Enter replacement item: 
water
Grocery item 1 has been modified
Enter your choice: 1
You have 3 items in your grocery list
1. water
2. bread
3. sugar
Enter your choice: 4
Enter item number: 
2
Enter your choice: 1
You have 2 items in your grocery list
1. water
2. bread
Enter your choice: 5
Item to search for: 
water
Found water in our grocery list
Enter your choice: 6       */