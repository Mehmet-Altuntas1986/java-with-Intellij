package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class task20_IncrementDecrement_$ {

	public static void main(String[] args) {
		
		
		int a = 1;
		int result = -a-- + a++ / -a-- * --a;  // a nin aldigi degerler  1   0  1  -1
		
		
		//a in memory : 1 - > 0 - > 1 - > 0 - > -1
		
		// result     : -1 + 0 / -1 * -1 = > -1 + 0 * -1 = >  -1 + 0 = > -1
		
		System.out.println("a = " + a);
		System.out.println("result = " + result);		
		
		
		System.out.println(3+2+"+"+4+5);

		
		
	}

}
