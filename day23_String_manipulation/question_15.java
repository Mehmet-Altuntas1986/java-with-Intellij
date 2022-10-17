package day23_String_manipulation;

public class question_15 {

	public static void main(String[] args) {

		
		String str = "badxx"; //0 and 1 index lerini check et
		
		//String str = "xbadxx";
		
		//String str = "xxbadxx";
		
		boolean flag = true;
				
				
				
		for(int i=0;i<2;i++) {
			
			if(str.substring(i, i+3).equals("bad")) {    //bad 3 karakterli oldugu icin
				
				flag = true;
				break;             //sonuc true ve false cikinca ogretmen koydu , loop un disina cikar
				
			}else {
				
				flag = false;
			}
			
		}
		
		if(flag) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}

	}

}
//Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
//with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false