package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q7_length_concat {

	public static void main(String[] args) {

		System.out.println(comboString("Hello", "hi"));
		System.out.println(comboString("hi", "Hello"));
		System.out.println(comboString("aaa", "b"));
		System.out.println(comboString("aaa", "bbb"));

	}

	public static String comboString(String str1, String str2) {

		String str;
		if (str1.length() > str2.length()) {

			str = str2.concat(str1).concat(str2);

		} else if (str1.length() == str2.length()) {

			str = "Both Strings have same length.";

		} else {
			str = str1.concat(str2).concat(str1);
		}

		return str;

	}

}
