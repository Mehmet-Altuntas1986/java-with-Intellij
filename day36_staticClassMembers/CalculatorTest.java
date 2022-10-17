package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {
		
		
		double result=Calculator.plus(55,7);  //static way--->class ismiyle variable i cagirma mumkun, cunku static olunca variable class a ait olur
		System.out.println("Result:"+result);
		
		
		
		Calculator c1 = new Calculator();
		System.out.println(c1.plus(2, 4));   //object name ile de cairilabilir static kullanilinca Calculator Class inda ,zaten object o class ismiyle olusturulmus
		
		System.out.println(Calculator.plus(2, 4));
		
		int i = Integer.parseInt("33");
		System.out.println(Character.isDigit('4'));
		
		//1
		CalculatorTest.mA();  //---> method className . ile cagirilabilr
		//2
		CalculatorTest ct = new CalculatorTest();  //---> static method object olusturularak cagirilabilir
		ct.mA();
		//3
		mA();  //method sadece ismini yazarakta cagirilabilir.
		

	}
	
	public static void mA() {   //static oldugu icin it belongs to class in the lines 22, 25 and 27  are possible to call the method
		System.out.println("Hello");
	}

}




//Rules ---> incelemek icin Staticmethods class ini ac

//u can not call instance method/variable from static method 

// u can call static method from static method

//u can call static from instance method