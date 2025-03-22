package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class task21_IncrementDecrement {

	public static void main(String[] args) {
		
		
		int x = 4;
		int y = x * 4 - x++;    //12        bir sonraki line da  x  1 artar
		
		System.out.println("x = " + x);   //5
		System.out.println("y = " + y);   //12
		
		//x in memory : 4 - > 5
		//y           : 4 * 4 - 4 = > 12
		

	}

}
