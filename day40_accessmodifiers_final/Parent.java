package day40_accessmodifiers_final;

public class Parent {
	
	public int x = 100;
	
	public void increment() {
		x++; //normalde burda 101 oldu ama 200 yazdirdi-->hiding
	}

}