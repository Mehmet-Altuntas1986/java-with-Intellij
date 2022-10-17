package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q4_returnMethod_length_isEmpty_substring {

	public static void main(String[] args) {

		System.out.println(firstTwo("Hello"));
		System.out.println(firstTwo("abcdefght"));
		System.out.println(firstTwo("ab"));
		System.out.println(firstTwo(""));
		System.out.println(firstTwo("a"));

	}

	public static String firstTwo(String str) {

		if (str.length() < 2) {
			return str;
		} else if (str.isEmpty()) {
			return "";
		} else {
			return str.substring(0, 2);

		}

	}
}