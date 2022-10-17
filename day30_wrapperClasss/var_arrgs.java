package day30_wrapperClasss;

public class var_arrgs {   //variable arguments

	public static void main(String[] args) {
		
		sum(2,4);
		sum(2,3,5,6);
		sum(5,10,50);

		System.out.println(concat("Apple","Orange","123","Result"));
	}
	
	
	public static void sum(int... numbers) { //A vararg parameter can take a variable number of arguments  //
		
		int sum = 0;                         //instead of overloading , ...
		                                     //in java certification , they ask
		
		for(int value : numbers) {
			
			sum = sum + value;
		}
		
		System.out.println(sum);
	}
	
	public static String concat(String... strs) {    
		
		String newStr = "";
		for(String str : strs) {    //strs is collectio
			
			newStr = newStr + str.charAt(2);   //2 numarali index numaralari alindi ve eklendi
		}
		
		return newStr;
		
	}

}