package day13_Methods_Part1;

public class Task56_convertKM {

	public static void main(String[] args) {
	
		
		convertKM();		//We can call methods as many times as needed.
		convertKM();

	}

	public static void convertKM() {
		
		int mile=80;
		double km= mile* 1.60934;
		
		System.out.println(mile + " mile = " + km + " km");
	}

}
