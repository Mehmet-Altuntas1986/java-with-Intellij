package day45_exceptionsHandling;

public class BadArray {
	
	public static void main(String[] args) {
		
		int[] number = {1,2,3};
		
		for(int i=0;i<=number.length;i++) {   //burda = koydugu icin exceptionHandlig uyarisi veriyor consolda java  //index in disina cikti
			System.out.println(number[i]);
		}
		
		System.out.println("Learning exception");
		
	}

}

/*Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
at day45_exceptionsHandling.BadArray.main(BadArray.java:10) */