package day_3_variables_dataTypes;

public class PrimitiveVariables {

	public static void main(String[] args) {
		
		
		byte b1 = 25;
		byte b2 = -25;
		//byte b3 = 128;
		//byte you can write between -128 to +127
		
		
		
		
		
		
		
		System.out.println("b1="+b1);
		System.out.println("b2="+b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		int i4 = 100000;
		// 100_000 and 100000 are same.if we use underscore (_) For long numbers its easier to see
				
		System.out.println("i1 = " + i1);
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		System.out.println("i4 = " + i4);
		
		
		long l1 = 5000;
				
		long l2 = -2147483649L;
		// We can put small (l) or capital (L) to specify its not an int its a long.
		// l or L is optional but its mandatory if some numbers are out of int range
		// After number just put an (l or L) with no space
		// In output we will not see l or L
		long creditCardNumber = 5876_1234_3453_983L;
		
		
				

		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("creditCardNumber = " + creditCardNumber);
		
		
		// Floating Numbers : default is double
		// float and doubles are data types
		// f or F is optional but its mandatory if some numbers are out of float range
		
		float f1 = 2.1F;
		
		double d1 = 3.14;
		
		
		System.out.println("f1 = " + f1);
	
		System.out.println("d1 = " + d1);
		
		
		
		char c1 = 'A';
		char c2 = 65; //Decimal value corresponding to character 'A'
		
		System.out.println(c2);
		
		char c3 = '\u0041';
		
		System.out.println(c2);
		
		
		char c4 = 8658;
		
		System.out.println(c4);
		
		
		boolean status = true;
		
		boolean status2 = false;
		
		System.out.println("Eligible to take the exam: " + status);
		
		System.out.println("He is 16, can he take driver licence?: " + status2);
		
		
		
		String name = "ABD";
		
		System.out.println("My name is " + name);
		
		
	}

}
