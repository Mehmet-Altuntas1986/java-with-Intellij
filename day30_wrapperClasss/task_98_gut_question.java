package day30_wrapperClasss;

public class task_98_gut_question {

	public static void main(String[] args) {



		
//		   String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
//	        System.out.println(decodeTheCode(str1));
//
//	        
//	        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
//	        System.out.println(decodeTheCode(str2));
//	      
//	        Change the implementation of decodeTheCode(String) method such that on executing class,
//	        following output is shown:
//	        1 2 5 6
//	        9 3 4
	        
		
		
		
		
		
		
		
		   String str1 = "&^%^1&8O^^..ne. .52||{{T.*@,(wo#$ %^*f!@%^<<i86876ve&%^$ ^%$S$..,,!i!%*&#x&*@!$";
        System.out.println(decodeTheCode(str1));

        
        String str2 = "N000000i%$!,n9!!!!<e>>>>> 43.***T#$#%hr##<e><e>><{{ ###f##00o00###u%$#$##$#r";
        
        
        
        System.out.println(decodeTheCode(str2));
        
        
		}

		public static String decodeTheCode(String s) {
			
			String str = "";      //str diye bir string olusturuyoruz
			
			for(int i=0;i<s.length();i++) {
				
				if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) == ' ') {
					
					str = str + s.charAt(i);
				}
			}
			
			String[] arr = str.split(" ");   // array olusturduk split ile 
			
			String str2= "";
			for(String value : arr) { // 
				
				str2 = str2 + getDigit(value) + " ";   //value is going to st in line 67  //calling method getDigit
				       
				//burda array deki value lari Stringe donusturdu, asagidaki method ilede sayiya donusturdu  //yani bir string olustu sayilarla
			}
			
			return str2;
		
		}

		public static String getDigit(String st) { //ONE
			
			switch(st.toUpperCase()) {
			
			case "ZERO":
				return "0";   //RETURN OLUNCA BREAK E GEREK YOK
			case "ONE":
				return "1";
			case "TWO":
				return "2";
			case "THREE":
				return "3";
			case "FOUR":
				return "4";
			case "FIVE":
				return "5";
			case "SIX":
				return "6";
			case "SEVEN":
				return "7";
			case "EIGHT":
				return "8";
			case "NINE":
				return "9";
			default:             //KOYMAZSAK HATA VERIR //RETURN MUTLAKA BIR SONUCA VARMALI BU CASE LER ILE
				return "";
						
			}
			
			
		
			
			

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}