
package day45_exceptionsHandling;

public class TryCatch {

	public static void main(String[] args) {
		
		
		try {
			
			
			String str = "JAVA";
			System.out.println(str.charAt(0));
			System.out.println(str.charAt(5));  //ex:GETTING data from 3rd party  //jvm_burda hata olunca bir sonraki line i okumaz ve catch bloguna gecer
			System.out.println(str.charAt(1));  //using data here   (yukarida hata varsa burada islem olmaz)
			//use data 
			
		}catch(Exception e) { 
			
			System.out.println("Exception happened in try block and was cought");
			//EXCEL
		

		}
		
		System.out.println("After try catch block");
		
	
		
		
		
		
		
		
		//jvm try block unda hata bulunca catch bloguna gecer , hatayi buldugu yerde durmaz , okumaya devam eder
		
		
		//try blogunda hata yoksa jvm catch bloguna gecmez
		
		
		
		
		
		


	}

}