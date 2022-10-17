package day38_inheritance_continue_part_2;

public class SubClass extends SuperClass {

	
	
	
	
	public SubClass() { //SubClass constructor
		
		
	
		                               //  this(5);  -->  (ayni class in icindeki constructordan digerini this() ile cagirabiliyoruz  (hatirlamak icin konuldu)
		
		//super(); eger biz bunu koymazsak java gorunmeyecek sekilde bunu default olarak koyuyor buraya, super class constructorini subclass constructprindan cagiriyor
		
		System.out.println("This is the subclass constructor");
		
		
	}
	
	//eger line 4 ile 19 arasini silerek bu islemi yaparsak 
	
/*	int x; bir field olusturduk
	
	sonra sag click -->source--> bir constructor olustur dedigimizde  asagida soyle olusur
	public SubClass() {
		super();--------> bu superClass daki 
		this.x=x;  */
	}
	
	
//	public SubClass(int x) { 
//		System.out.println(x);
//	}


//burda ogretmen sunu soyledi
/*if you are using inheritance and if there is constructor available in subClass and SuperClass ,
automatically superclass constructor is called before subclass constructor , this is the rule.
eger superclass daki constructo ilk olarak cagirilamyacak bir islem olursa , hata verir
*/
	
	
	


/*constructors are not inherited but how this is happening , when you run 
constructor class , you see them in console */


/* if there are different classes and you see Super() keyword , it calls SuperClass constructor
 * Super(); bu keyword u gorursen , bu seni superClass a goturur ve constructorin icindeki islemi yaptirir
 * Super(5); -->arg me sahip olan bir constructor a gider
 */


/*  Calling the Super Class Constructor
 
• The super keyword refers to an object’s superclass. You can use the
super key word to call a superclass constructor.

• If a subclass constructor does not explicitly(acikca) call a superclass
constructor, Java will automatically call the superclass’s default
constructor, or no-arg constructor, just before the code in the subclass’s
constructor executes. This is equivalent to placing the following
statement at the beginning of a subclass constructor: super();  */