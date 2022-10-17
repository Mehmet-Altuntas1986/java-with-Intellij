package day40_accessmodifiers_final;

public class FinalMethods {
	
	public final void method1() {
		System.out.println("Method-1");
		
		String x = "Apple";
	}
	
	
	public final static void staticMethod(String word) {
		System.out.println("Static Method");
	}
	
}


class Sub extends FinalMethods{      //bir class in icinde baska bir class acilabilir fakat en bastakinin gorunurlug udaha fazla olmali --public--line 5
	
	/* there would be no problem here if final was not used above
	 
	    @override
		public void method1() {     farkli classlarda -- method ismi ,parametreler ve return type lari ayni methodlar varsa --->overriding  //yukariya final koyunca rule: overriding olamaz
			System.out.println("Method-1 in subclass");
		}
		
		
		
		@override yazamayiz buraya-->cunku overriding yok , sol tarafta bir isaret belirecek overriding olmadigini gosteren
		
		public static void staticMethod(String word) {  //sonradan ogrenecegiz --> bu methodda overriding yok usttek iclass in methoduyla ile tamamen ayni olmasina ragmen
			System.out.println("Static Method in Sub Class");
		}
	*/
	
}


/*

---final methods---

• When a method is declared with final keyword, it is called final method.
• A final method can not be overridden.--> line 24



*/