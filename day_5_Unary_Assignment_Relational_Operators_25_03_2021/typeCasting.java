package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class typeCasting {

	public static void main(String[] args) {
		
		
		byte b;
		int i =81;
		double d = 323141;
		float f =7238f;
		char c = 'A';
		
		
		c =(char)i;
		System.out.println("i = "+i+","+" c = "+c);
		
		i= (int)d;
		System.out.println("d = "+d+", i = "+i);
		
		i=(int)f;
		System.out.println("f = " + f + " i = " + i);
		
		b=(byte)d;
		System.out.println("d = " + d + " b = " + b);

		//Big data loss happened while converting double to byte
		//d was 323.141 when converting became 67 ???
		

	}

}
