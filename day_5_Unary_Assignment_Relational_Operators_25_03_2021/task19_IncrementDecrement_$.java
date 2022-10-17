package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class task19_IncrementDecrement_$ {

	public static void main(String[] args) {
		
				
		int a = 50;        //pre olunca hemen islem yapiyor,   post oluca bir sonraki adimda islem yapiyor
		int result = --a + a++ + a-- + a++;  //49 -> 49 -->50 -->49
		
		//a in memory : 50 -> 49 -> 50 -> 49 -> 50
		
		//result      :       49  + 49  + 50  + 49  = 197
		
		System.out.println("a = " + a);
		System.out.println("result = " + result);

	}
}
