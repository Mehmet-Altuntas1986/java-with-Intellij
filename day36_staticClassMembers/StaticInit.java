package day36_staticClassMembers;

public class StaticInit {
	
	static final int NUM_SECONDS_PER_HOURS;         //final koyunca empty birakamayiz. bir deger vermemiz gerekir

	static{
		
		System.out.println("static init");
		int numSecondPerMinute=60;
		int numMinutePerHour=60;
		NUM_SECONDS_PER_HOURS=numMinutePerHour * numSecondPerMinute;
		
	}
	
	private static int one;
	private static final int two;
	private static final int three=3;
	//private static final int four;         //error verir , deger verilmemis

	
	static {        // static blocks runs only one time
		one=1;
		two=2;
	//	three=4;      //2. kez deger verilemz final oldugu icin 
	//	two=4;
	}
	
	
}
