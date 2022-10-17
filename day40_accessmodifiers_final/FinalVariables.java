package day40_accessmodifiers_final;

public class FinalVariables {
	
	public final int ROADSTER_MAX_RANGE = 600;  //instance variable da we must initialize it --> birde line 44ye bak
	public final int MODEL_3_MAXSPEED;
	public final int MODEL_X_PASSENGERS;
	public static final String ADMIN_USERNAME;
	
	
	
	
	
	
	public FinalVariables() { //constructor
		MODEL_3_MAXSPEED = 200;  //bu degeri vermeden once constructor hata veriyordu, cunku final a bir eger vermek gerekir
		//ADMIN_USERNAME = "Ozzy"; //why error--> cunku object olusturulmasi gerekiyor, wenn we create an object , new keyword 
		                           //invokes a constructor
		                           //constructor i n icinde static bir variable a object olmadan deger veremiyorum , peki nerede verebilrim?
	
	}
	
	
	{
		MODEL_X_PASSENGERS = 7;
		
		//ADMIN_USERNAME = "Ozzy";  //init block undada static bir variable a deger veremiyorum

		
	}
	
	static {  //runs only once when the class is created, it doesnt care object
		
		ADMIN_USERNAME = "Ozzy";
	}

	
	
	
	public static void main(String[] args) {
		
		final int MAX_PASSENGERS_COUNT=5;     //in local variable
		
		final int SSN ;   //burda error vermedi initialization yapmayinca --> cunku main methodun icinde ,main methodla alakadar ,local variable
		                  //public koyabilirmiyim onune?  --> no-->local variables cannot have access modifier 
		SSN=66;
		//SSN++;
		
		FinalVariables fv = new FinalVariables(); //bir object olusturdu
		
		System.out.println(fv.ROADSTER_MAX_RANGE);
		System.out.println(fv.MODEL_3_MAXSPEED);
		System.out.println(FinalVariables.ADMIN_USERNAME);
		System.out.println(ADMIN_USERNAME); //nasi direkt cagirabildim? --< cunku ayni class ve ayni package in icinde
		
		//CALLING ISLEMLERINI INCELE AYNI CLASS IN ICINDE OLUNCA
		
		mA();   //ALTTAKI LER ILEDE CAGIRABILIRIM AMA GEREK YOK ONLARA AYNI ISINIFIN ICINDE OLUNCA
		
		fv.mA(); 
		
		FinalVariables.mA(); //CLASS ISMIYLE CAGIRDIM BU METHODU
		
		
		
		
		
		
	
	// if you are in the same class , you can access directly with the variable name or method name
	
	}

	public static void mA() {  //ORNEK BIR METHOD ACTIM
		
	}
	
	
	
	
	/*    ---  final variables --
	 * 
           • When a variable is declared with final keyword, its value can not be modified (degisitirilemez).
           • When local variable is final, we can declare and assign value later in code
          
           # When instance variable is final, we need to initialize it in:  (aksi takdirde hata verir)
               • same statement
               • constructor
               • init block  {     }  --> iki curlybrace arasi demek
               
              
              
               
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    */
	
	
	
	
	
	
	
	
	
	
	
	
}