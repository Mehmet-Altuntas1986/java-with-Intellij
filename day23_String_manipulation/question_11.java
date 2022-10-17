package day23_String_manipulation;

public class question_11 {

	public static void main(String[] args) {
//		Return the number of times that the string "hi" appears anywhere in the given string.
//		countHi("abc hi ho") → 1
//		countHi("ABChi hi")  → 2
//		countHi("hihi")      → 2
		
		
		
	         countHi("abc hi ho ");
	         countHi("ABChi hi");
	         countHi("hihi");
		
		
		
			}
			
			public static void countHi(String str ) {
			
			
			
			int counter=0;
			
			for(int i=0;i<str.length()-1;i++) {               // -1 denildi , cunku bir sonrakinde i+2 boylece son index numarasina ulasti 
				
				if (str.substring(i,i+2).equals("hi") ){     //i+2 son index numarasini asmamali, asarsa error    
					
					counter++;
			
			
		}
		
		
			}
			System.out.println(counter);
		
//		  hihello=substring (0,2)         1.den baslar  2. dahil degil     logic kurulur ilk once
//		  xhihello=substring(1,3)
		
	
			
	}

}
