package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q5_length_firstHalf {

	public static void main(String[] args) {

		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));

	}

	public static String firstHalf(String str) {

		int x = str.length() / 2;

		return str.substring(0, x);

	}

}                                   
       		             