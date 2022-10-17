package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q6_length_substring {

	public static void main(String[] args) {

		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		System.out.println(withoutEnd("A"));

	}

	public static String withoutEnd(String str) {

		if (str.length() < 2) {
			return "Invalid String";
		}

		return str.substring(1, str.length() - 1);

	}

}
