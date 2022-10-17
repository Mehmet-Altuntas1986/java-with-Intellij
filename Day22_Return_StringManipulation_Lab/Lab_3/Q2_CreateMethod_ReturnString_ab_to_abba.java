package Day22_Return_StringManipulation_Lab.Lab_3;

public class Q2_CreateMethod_ReturnString_ab_to_abba {

	public static void main(String[] args) {
		
		System.out.println(makeAbba("Hi", "Bye"));
		System.out.println(makeAbba("Yo", "Alice"));
		System.out.println(makeAbba("What", "Up"));
		
	}
		public static String makeAbba(String str1,String str2) {
			return str1 + str2 + str2 + str1;
					
		

	}

}
