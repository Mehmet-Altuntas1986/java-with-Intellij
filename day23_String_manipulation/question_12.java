package day23_String_manipulation;

public class question_12 {

	public static void main(String[] args) {

		catDog("catdog");
		catDog("catcat");
		catDog("1cat1cadodog");

		
		
	}
public static void catDog(String a ) {
	
	String str = "Catdog";  //counterCat
     //counterDog
     //substring(0,3) = i,i+3
	 //substring(3,6) = i,i+3

int counterCat=0,counterDog=0;


for(int i=0;i<str.length()-2;i++) {  


if(str.substring(i, i+3).equalsIgnoreCase("cat")) {  
counterCat++;
}
if(str.substring(i, i+3).equalsIgnoreCase("dog")) {
counterDog++;
}

   }

if(counterCat==counterDog)     {
System.out.println(true);
} else {
System.out.println(false);
}





}
}




//Return true if the string "cat" and "dog" appear the same number of times in the given
//string.
//catDog("catdog") → true
//catDog("catcat") → false
//catDog("1cat1cadodog") → true