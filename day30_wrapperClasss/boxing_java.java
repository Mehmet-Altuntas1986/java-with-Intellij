package day30_wrapperClasss;

public class boxing_java {

	public static void main(String[] args) {
			
			//AUTOBOXING - > primitive to object
			
		
		Integer num1 = 1234;
		int n = 5;
		Integer num2 = n;   //int 5  objecte gidiyor  //autoboxing
			
			
			//UNBOXING - > object to primitive
			
			Double d1 = new Double(34.2);
			double d2 = d1; //unboxing
			
			System.out.println("d1:" + d1);
			System.out.println("d2:" + d2);
			
			long l1 = new Long(6000000L); //unboxing
			Long l2 = new Long(345699459); //no Boxing
			
			long l3 = l2; //unboxing
			
			
			int x =345;
			double y = x;  //casting
			
			
			Integer num3 = Integer.valueOf(345);  //int ile object olusturuldu
			
			//Double d3 = num3; //casting not possible with wrapper classes  (interview) ****
			

			

			
			
//			*Autoboxing converts primitive into object
//		  
//			*Unboxing converts object into primitive
			
			
			//INTERVIEW SORUSU

		}

	}
