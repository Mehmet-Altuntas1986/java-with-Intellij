package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class task18_PrepostDecrementIncrement {

	public static void main(String[] args) {
		
		
		int x = 2;
		int y = x++;  //y=2 because ++ is post comes active in the next line.  //sonraki line da x e 1 ekle
		// If we write like y=x; then result will be x=3,y=3
		
		System.out.println(x);
		System.out.println(y);
		
		
		/*
		 * int x=2
		 * int y=x++;  //x++=x+1
		 * int y=++x; // x++=x+1
		 */

	}

}
