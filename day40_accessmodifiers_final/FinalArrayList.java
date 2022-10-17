package day40_accessmodifiers_final;

import java.util.ArrayList;

public class FinalArrayList {

	public static void main(String[] args) {
		
		final ArrayList<String> COLORS = new ArrayList<>();
		
		COLORS.add("Orange");
		COLORS.add("Red");
		COLORS.remove(0);
		
		//COLORS = new ArrayList<String>();   //COLORS  reference ismiyle yeni objecti reference edemeyiz
		

	}

}


/* 


          --- final arraylist ---

*follows same rules of arrays
*we can remove or update any values
*we cannot reassign it to another object using new keyword.




*/