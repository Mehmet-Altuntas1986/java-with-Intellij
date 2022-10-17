package day30_wrapperClasss;

public class wrapper_class_how_to_make_objects_with_wrapper {

	public static void main(String[] args) {


		
		                               //wrapper class is basicly converting from primitive to object
		    
		
		/*   Each of Java’s eight primitive data types has a class dedicated to it. These are known as
		wrapper classes because they ”wrap” the primitive data type into an object of that
		class.
		
		*The wrapper classes are part of the java.lang package, which is imported by default
		into all Java programs.
		
		*Wrapper class in Java provides the mechanism to convert primitive into object and
		object into primitive.  */
		
		
//		primitive type            wrapper class        (capital letter ile balsiyor)
//		
//		boolean                    Boolean
//		 char                      Character
//		 byte                      Byte
//		 short                     Short
//		 int                       Integer
//		 long                      Long
//		 float                     Float 
//		 double                    Double
		
		
//		How to make objects
//		 
//		Boolean b=new Boolean(true);       or       Boolean b=new Boolean("true");
//		
//		Character c=new Character('c');          ** Character wrapper class doesn't take String as argument
//		
//		Byte by=new Byte((byte)123);       or       Byte by=new Byte("123");        //casting
//		
//		Short s1= new Short((short)1200);  or       Short s1= new Short("1200");    //casting          bilgisayar int olarak algiliyor casting yapmazsak
//		
//		Integer i1=new Integer(1202);      Or 		Integer i1=new Integer("1202");
//
//		Long l1= new Long (200000) ;       or       Long l1= new Long ("200000") ; 
//		
//		Float f1= new Float(12.2f);        or       Float f1= new Float("12.2");  
//		
//		Double d1=new Double(3.14);        or       Double d1=new Double("3.14"); 
		
		
		int n1 = 10;
		Integer n2 = new Integer(10);
		System.out.println(n1);
		System.out.println(n2);
		
		
		double d1 = 44.5;
		Double d2 = new Double(44.5);
		Double d3 = new Double("44.5");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d1+d2+d3);
		
		
		char ch1 = 'a';
		Character ch2 = new Character('a');
		System.out.println(ch1);
		System.out.println(ch2);
		
		
		byte b1 = 100;
		Byte b2 = new Byte((byte)100);
		System.out.println(b1);
		System.out.println(b2);
		
		Integer num1 = Integer.valueOf(1234);   //new version java larda artik object olusturulurken valueOf methodu kullaniliyor
		System.out.println(num1);
		
		Boolean bool1 = Boolean.valueOf(true);
		Boolean bool2 = Boolean.valueOf("false");
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		
		
		
	
	}

}