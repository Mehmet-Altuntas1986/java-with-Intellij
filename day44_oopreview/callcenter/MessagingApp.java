package day44_oopreview.callcenter;

public abstract class MessagingApp {
	
	public String name;                              //public-->accesible everywhere
	
	protected boolean isFree;                        //protected--> accessible in the same package and if there is inheritance(is relationship) accessible to different packages
	
	boolean allOSCompatible;                         //default --> accessible      only    within the same package (inheritance olsa bile farketmez)c-->day40 de car classina bak
	
	private static int count;                        //private is accessible only in the same class, it belongs to same class
	
	public static final String APP_TYPE = "Messenger";
	
	
	public MessagingApp() {
		System.out.println("MessagingApp no-args constructor...");
	}
	
	
	public MessagingApp(String name, int count) {  //parameterized constructor
		this.name = name;
		MessagingApp.count=count; //initialization constructor ile yada setter ile mumkun
	}
	
	
	public abstract void sendMessage(String msg);  //no implementation, NO BODY// interface has no instance method , buyuzden "public abstract" i koymamiza gerek yoktu, jvm otomatik koyuordu 
	                                                                          //ama abstract classda koymak zorundayiz cunku object var
	
	
	public static void close() {  //static method
		System.out.println("MessagingApp is closing...");
	}
	
	
	public void launch() {  //instance method
		System.out.println("MessagingApp is launching...");
	}

	
	
	public static int getCount() {           //right click-->source-->getters and setters
		return count;
	}
	public static void setCount(int count) {   //this -->represents the current object         this() --> call one constructor from another constructor
		MessagingApp.count = count;
	}
	

}
// 3 types of variables                                     //command +/7 -->birkac line i ayni anda yorum yazmak icin secen kisa yol
// # 1-->local variables belongs to method
// # 2-->static variables belongs to class
// # 3-instance variables belongs to object



//constructor is a special method that we are using to initialize our instance variables

//can i create an instance (object) from abstract class? --> no  --> bu yuzden super (from the child class) ile constructor lari calistiririz


//abstract class can do anything a class is doing , plus abstrAct class can have abstract method (NORMAL CLASS CANNOT) ,YOU CAN CREATE OBJECT FROM REGULAR CLASS BUT NOT FROM ABSTRACT CLASS