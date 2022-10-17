package day36_staticClassMembers;

public class ABCTest {

	public static void main(String[] args) {
		
		ABC.m1(); //no error        //NORMALDE LINE 7 ,9 VE 10 MUMKUN AMA BIRSEY YAPACAGIM  7 MUMKUN OLACAK AMA 9 VE 10 MUMKUN OLMAKTAN CIKACAK
		
		//ABC o1 = new ABC(); //BU LINE NIN error VERMESINI ISTIYORSAK CONSTRUCTOR I PRIVATE A CEVIRIRIZ , BOYLECE 
		//o1.m1();
		
		//whenever all of your methods in your class are static,
		//and you want everyone to call them static way - ClassName.methodname(),
		//then you can simply make your constructor private (BOYLECE CLASS METHODU CAGIRA

	}
	
	
	public static void print() {
		
		//static int a =5;   //local variables cannot be static  //static deyince butun sinif kullanabilir bu yuzden hata veriyor, cunku local variable i butun sinif kullanamaz
		
	}

}





//if a variable is inside a method , we say it is local variable. local variables cannot be static