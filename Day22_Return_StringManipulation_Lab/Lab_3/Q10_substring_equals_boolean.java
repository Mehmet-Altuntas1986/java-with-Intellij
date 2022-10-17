package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q10_substring_equals_boolean {

	public static void main(String[] args) {

		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));

	}

	public static boolean frontAgain(String str) {

		String first2 = str.substring(0, 2); // edited
		String last2 = str.substring(str.length() - 2);

		return first2.equals(last2);

		// .equals compares the values
		// == sign compares object references(they are same object or not)

	}

}
