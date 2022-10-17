package day42_interface;

public interface Electric {
	
	public static final boolean HAS_BATTERIES=true;
	
	boolean HAS_BATTERIES2=false; //public static final
	
	public abstract void charge(); //abstract methodlar abstract classlarin yada interface lerin icerisine koyulabilir
	
	void charge2(); //public abstract --->public yazmasakta sanki yazmisiz gibi algilar interface de birnevi default diyebiliriz
	
	public default void methodA() { //default cikarirsak hata verir--> interface de instance method kullanilamaz
		//code
	}
	
	public static void methodB() {//methodA VE B DE CODE YAZIlMISSA -->implementation var demektir, dolayisiyla overriding gerekmez
		//code
	}
	

}