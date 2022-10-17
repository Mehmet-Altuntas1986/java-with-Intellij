package day21_StringManipulation_part3;

public class String_Trim {

	public static void main(String[] args) {
		
		
		String str = " 342 "; //|342|
		
		System.out.println("|" + str.trim() + "|");  // Trim Method
		
		
		str.replace(" ", "|");
		
		System.out.println(str);
		

	}

}
