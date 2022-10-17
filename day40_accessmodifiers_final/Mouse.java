package day40_accessmodifiers_final;

public class Mouse extends Rodent {
	
//	public Mouse() {       --> burda gozle gorulmeyen javanin olusturmus oldugu bir default constructor var
//		super();
//	}
	
	protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail:" + tailLength + ",parentTail:" + super.tailLength);
	}
	

}



