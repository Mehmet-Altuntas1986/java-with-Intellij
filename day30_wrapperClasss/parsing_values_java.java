package day30_wrapperClasss;

public class parsing_values_java {

	public static void main(String[] args) {


		String numberAsString = "2018";          //parsing:ayristirma  islemi       String i ayristirma
		System.out.println(numberAsString);
		
		
		
		System.out.println("------------------");

		
		
		
		int number = Integer.parseInt(numberAsString);    //parsing from string to integer
		System.out.println(number);
		
		numberAsString = numberAsString + 1;  //20181        string+1
		number = number + 1;                 //2018+1         int +1
		
		
		 
		System.out.println("------------------");
		
		
		
		
		System.out.println(numberAsString);
		System.out.println(number);
		
		
		System.out.println("------------------");

		
		double number2 = Double.parseDouble(numberAsString);
		System.out.println(number2);
		
		System.out.println("------------------");

		
		int i = 10;
		String s = String.valueOf(i);
		System.out.println(s); //it will return "10"  String oldu
		
		System.out.println("------------------");

		
		
		String s2 = Integer.toString(i);
		System.out.println(s2); //it will return "10" buda string
		
		
	}

}