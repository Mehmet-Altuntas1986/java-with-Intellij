package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q9_substring_length_concat {

	public static void main(String[] args) {

		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("Hi"));
		System.out.println(right2("A"));
		System.out.println(right2(""));

	}

	public static String right2(String str) {

		if (str.length() < 2) {
			return "Invalid String";
		}

		return str.substring(str.length() - 2).concat(str.substring(0, str.length() - 2));

	}

}
