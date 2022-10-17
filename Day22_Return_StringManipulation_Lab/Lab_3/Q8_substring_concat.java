package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q8_substring_concat {

	public static void main(String[] args) {

		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
		System.out.println(left2("A"));
		System.out.println(left2(""));

	}

	public static String left2(String str) {

		if (str.length() < 2) {
			return "Invalid String";
		}

		return str.substring(2).concat(str.substring(0, 2));

	}

}
