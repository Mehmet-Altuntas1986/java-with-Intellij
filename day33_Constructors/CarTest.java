package day33_Constructors;

public class CarTest {

	public static void main(String[] args) {

		
		
		Car c1=new Car();
		
		Car c2=new Car("Honda","Civic",2020,5000,"White");
		
		//Car c3=new Car   BURAYA KADAR YAZIP CONTROL+SPACE E TIKLA ,SONRA BIR USTTEKI LINE A BENZER SEKILDE OLUSTUR
		
		//cAR c4=new Car
		
		
		
		System.out.println(c1.make);
		System.out.println(c2.make);


		//1-new -call constructor
		//2-which constructor?  ---> constructor with no parameter in Car class-default constructor     (yani Car adli class in icinde model is null, year is 0, .....
		
		
		
		
		
		
		
		
	}

}
