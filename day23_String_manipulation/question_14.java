package day23_String_manipulation;

public class question_14 {

	public static void main(String[] args) {

		String str = "oddsly"; //                  4     6-2
        //oddy              2     4-2
        //ddd               1     3-2
                                              
		if (str.length() < 2) {
			System.out.println(false);
			return;      // return; breaks the main method
		}

		if (str.substring(str.length() - 2).equals("ly")) {                       //substring de 1 sayi varsa , o sayi dahil sona kadar stringi yazdirir
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

		
		
		
		
		
		
		
		
		
		
		        //return; breaks the main method
		
	
}
//Given a string, return true if it ends in "ly".
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false