package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class UnaryOperators {

	public static void main(String[] args) {
		
		
		int i1= +10;
		int i2= -100;
		int i3= -(i1+i2); // -(10-100) = > - -90 = > 90
		
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		boolean flag = true;
		System.out.println(!flag);
		System.out.println(!!flag);
		
		int i =10, j=5;
		//i++; //same as i = i+1
		
		System.out.println(i++);
		System.out.println(i);
		
		System.out.println(--j);
		System.out.println(j);
		System.out.println("........................................");


		int p = 5;
		p += 2;  // Doğru kullanım, p = p + 2 olur
		System.out.println(p);  // Çıktı: 7

		p+=p;  // Doğru kullanım, p = p + p olur
		System.out.println(p);
		
		
		--j; // same as j=j-1
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		
		//i=11, j=3
		int res = i++ + --j;     // -- ler onde oldugu icin bu line da j degeri 3 ten 2 ye duser
		
		System.out.println("res = " + res );
		
		
		//res  =  11 + 3
		//i    = 11 - 12
		//j    =  4 - 3
		

	}

}
