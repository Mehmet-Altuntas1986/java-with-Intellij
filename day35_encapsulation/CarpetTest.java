package day35_encapsulation;

public class CarpetTest {

	public static void main(String[] args) {
		
		/*
		Floor f = new Floor(10,20);          //Floor class ina bak
		Carpet c = new Carpet(5.2);          //Carpet class ina bak
		
		Calculator cal = new Calculator(f,c); 
		
		System.out.println(cal.getTotalCost());
		*/
		
		Calculator cal = new Calculator(new Floor(10,20), new Carpet(5.2));   //buda yukaridakinin aynisini yapar //shortcut
		System.out.println(cal.getTotalCost());
		
		

	}

}