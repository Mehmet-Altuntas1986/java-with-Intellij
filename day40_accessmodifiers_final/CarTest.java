package day40_accessmodifiers_final;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.model = "m3";
		c.year = 2017;
		//c.door = 4;  //private oldugundan no access
		c.engine = 5.2;
		                                   //bu toString iliskisi interview sorusu olabilir
		System.out.println(c.toString()); //car sinifinda overriding yapilmis , bu yuzden sonuc arraylist olarak cikiyor
		                                  //car sinifinda overridding olmasaydi  sonuc-->day40_accessmodifiers_final.Car@15db9742  referance numarasi ciktisi olurdu
		
	
		

	}

}

//c.  diye yaz ,karsina secenekler cikacak , the java API has a class named Object,
//which all other classes directly or indirectly inherit from.


//public class Myclass{}
//public class Myclass extends Object{}






//whenever we create a class , it inherits from this Object class in java
//whenever we create a class , it extends to this Object class