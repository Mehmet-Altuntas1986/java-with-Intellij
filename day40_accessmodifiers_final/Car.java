package day40_accessmodifiers_final;

public class Car {          //top level da bulunan class public (kusaticiligi fazla) ,  bu sayfada , baska class larda acabilirim ama bu cok kullanilmaz , eger acarsam baska class lar, onlar public ile baslayamaz                                  
	                        //top level public yada default olabilir
	                        //Variables,constructors and methods can have all 4 access modifiers (public,protected,default,private)
	                      
    String model;   //default    -->ogretmen sonradan onune public koydu  
	public int year;
	private int door;
	protected double engine;
	
	
	@Override      // -----> neden overrging var -->Javada Object isminde bir class var onda toString() methodu  mevcut
	public String toString() {
		return "Car [model=" + model + ", year=" + year + ", door=" + door + ", engine=" + engine + "]";
	}
	


	
	
	//public class A extends Car         normalde baska class lar acilabilir fakat top level dan daha az gorunur olmali , burda public olamaz
	
	
	

}




/*        default--> when no access modifier is specified for a class, method or data member , we say it is default
 *                   *the data members (like int), class or methods which are not declared using any access modifiers are accessible      only    within the same package
 *                   *there is no keyword usage
 *                   
 *                   ornegin -->    int x;   is default                   private int x;  bu private            public int x ; bu public
 *       
 * 
 * 
 *        private --> using keyword is private
 *                   *the methods or data members declared as private are     accessible only  within the class  in which they are declared
 *                   *top level classes cannot be declared as private
 *              
 *              
 *              
 *        public --> accessible to everywhere
 *        
 *        
 *        
 *        protected-->*the protected access modifier is specified using the keyword protected
 *                    *the methods or data members declared as protected are accessible within same package or sub classes in different package. (baska paketlerin icinde kullanirken inheritance relation ile kullanilabilir)
 *        
 *              
 *        
 *              
 *              access modifier          accessible to a subclass inside the same package?            accessible to all other classes in the same package?
 *              
 *              default                       yes                                                           yes
 *              public                        yes                                                           yes

 *              protected                     yes                                                           yes

 *              private                        no                                                           no

 *              
 *              
 *              
 *  access modifier          accessible to a subclass outside the same package?            accessible to all other classes outside the same package?
 *              
 *              default                       no                                                            no
 *              public                        yes                                                           yes

 *              protected                     yes                                                           no

 *              private                        no                                                           no

 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
  */
 