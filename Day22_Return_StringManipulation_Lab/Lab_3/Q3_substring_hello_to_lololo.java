package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q3_substring_hello_to_lololo {

	public static void main(String[] args) {

		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("I am java"));
		System.out.println(extraEnd("a"));

	}

	public static String extraEnd(String str) {

		if (str.length() < 2) {
			return "Invalid String";
		}

		String dummy = "";

		dummy = str.substring(str.length() - 2);

		return dummy + dummy + dummy;

	}

}
