package day_5_Unary_Assignment_Relational_Operators_25_03_2021;

public class MixedInteger_$ {

	public static void main(String[] args) {
		
		
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1+i2;
		//float res2 = i1 + d2;
		double res3 = i2+d1;
		
		
		short firstNumber=10;
		short secondNumber=20;
		
		int thirdNumber=firstNumber+secondNumber;
		
		short thirdNumber2=(short)(firstNumber+secondNumber);  //casting gerekli
		
//		byte b1=20;
//		byte b2=2;
//		byte b3 =(byte)(b1*b2);
		
		int b1=126; 
		int b2=1;
		
		byte res = (byte)(b1+b2); //Casting is required
		
		byte res2 = 126 + 1;  //No casting is required 
		
		

	}

}

/*
int+int =int
int+float=float
float+double=double
int+double=double
int+short=int


 */