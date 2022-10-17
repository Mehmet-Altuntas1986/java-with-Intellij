package day_3_variables_dataTypes;

public class CreatingVariables {

	public static void main(String[] args) {
		
		int price = 5;
		int quantity = 14;
		
		//We can put int,strings... to the same line or write them separately
		
		int price2,quantity2;
		String name,address,country,lastname;
		
		name="ABD";
		address="Netherlands";
		
		price2=100;
		quantity2=20;
		
		int price3=5,quantity3=50;
		
		String s1,s2;
		String s3="yes",s4="no";
		
		//int num,String value; //Does not compile
		//end of each statement we put semi column (;)
		
		int num;   String value;  //declaration
		
		num=5;  //initialization
		float f = 5.5f;   //casting yap    f ile kisa yol ile yada  float f = (float)5.5;

		System.out.println(num);

		int a,b,c;
		a=5;


		
	}

}

/*
Data Type	Size	Description
byte	1 byte	Stores whole numbers from                        -128 to 127
short	2 bytes	Stores whole numbers from                        -32,768 to 32,767
int	4 bytes	Stores whole numbers from                      -2,147,483,648 to 2,147,483,647
long	8 bytes	Stores whole numbers from      -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
boolean	1 bit	Stores true or false values
char	2 bytes	Stores a single character/letter or ASCII values
 */