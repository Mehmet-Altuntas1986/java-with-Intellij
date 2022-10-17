package day15_Methods_Part3;

public class Assignment1_SwapValue {   //changing values with each other

	public static void main(String[] args) {
		//Swapping 2 values

		// Solution-1 by using 3rd variable
		int n1 = 350;
		int n2 = 260;
		int n3;
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
		System.out.println("------------------");

		n3 = n1;
		n1 = n2;
		n2 = n3;

		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
		System.out.println("*******************************");

		// Solution2 without using 3rd variable
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);
		
		System.out.println("------------------");

		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("n1:" + n1);
		System.out.println("n2:" + n2);

		
		
		
	}

}
