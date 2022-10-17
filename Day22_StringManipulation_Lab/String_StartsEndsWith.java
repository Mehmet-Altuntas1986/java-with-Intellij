package Day22_StringManipulation_Lab;

public class String_StartsEndsWith {

	public static void main(String[] args) {

		String word1 = "eclipse";

		System.out.println(word1.startsWith("e"));
		System.out.println(word1.startsWith("ec"));
		System.out.println(word1.startsWith("ex"));

		System.out.println(word1.endsWith("e"));
		System.out.println(word1.endsWith("ipse"));
		System.out.println(word1.endsWith("xe"));

		System.out.println("------------------------------------------------");

		// Mr. = > married man
		// Mrs. = > married woman
		// Ms. = > Some woman
		// Dr. = > Doctor man or woman
		// No title = > Unknown status

		String name = "Mr. Abdurrahman";

		if (name.startsWith("Mr.")) {
			System.out.println("Married Man");

		} else if (name.startsWith("Mrs.")) {
			System.out.println("Married Women");

		} else if (name.startsWith("Ms.")) {
			System.out.println("Some Man");

		} else if (name.startsWith("Dr.")) {
			System.out.println("Doctor Man or Woman");

		} else {
			System.out.println("Unknown Status");

		}

	}

}
