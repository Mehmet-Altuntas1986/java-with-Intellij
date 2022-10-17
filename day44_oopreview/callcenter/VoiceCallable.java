package day44_oopreview.callcenter;

public interface VoiceCallable {
	
	boolean CAN_CALL = true; // =   public static final boolean CAN_CALL=true;      //instantiation yoksa hata verir-->final
	
	//abstract method
	void call(String contact); //  =  public abstract void call(String contact)
	
	//static method  --> CANNOT BE OVERRIDEN
	public static void decline(){                            //static is a keyword
		System.out.println("Mike declined voice call..");
	}
	
	//default method --> CAN BE OVERRIDEN
	public default void accept() {                               // burda default is not access modifier ,ayni anda 2 tane olmaz  deafult is a keyword    
		                                                         //implementation oldugu icin curly braces lar var, abstract classda yok
		System.out.println("Mike finally accepted voice call..");
	}

}




/* interface and abstract class can have variables , the difference is 
 

abstract class can have any  type of variable but interface can have only final and static variables  


--how many different ways are there to instantiate final variable? --> same line ,constructor, instance block --> ama interface de sadece same line da yapilabilir cunku


--> interface cannot have constructor and instance block




--->ogretmen interface in alabilecegi herseyi yukarida koymus



   */