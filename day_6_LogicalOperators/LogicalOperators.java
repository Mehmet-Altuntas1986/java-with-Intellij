package day_6_LogicalOperators;

public class LogicalOperators {

	public static void main(String[] args) {
		
		
		char c1 = 'A';
		char c2 = 65;
		int i1 = 5;
		int i2 = 10;

		//TRUE DONMESI ICIN HEPSI TRUE OLMALI
		boolean res1=(i1==i2)&(c1==c2);  // F & T = F         // & operatoru sonraki gelenleride degerlendirir
		boolean res2=(i1==i2)&&(c1==c2); // F && ---- = F     //İlk ifade false ise ikinciyi değerlendirmez (kısa devre)
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);

		//TRUE U ARA , BULAMAZSAN FALSE

		boolean res3 = (c1==c2)|(i1==i2); // T | F = T
		boolean res4 = (c1==c2)||(i1==i2); // T || ------ = T
		
		System.out.println("res3 = " + res3);
		System.out.println("res4 = " + res4);

		//Eğer iki ifade de aynıysa (true ^ true veya false ^ false), sonuç false olur.
		boolean res5 = (c1==c2)^(i1==i2); // T ^ F = T
		boolean res6 = (c1==c2)^(i1!=i2); // T ^ T = F
		
		System.out.println("res5 = " + res5);
		System.out.println("res6 = " + res6);
		
		

	}

}


/*
&	Her iki tarafı da değerlendirir	false
&&	İlk ifade false ise ikinciyi değerlendirmez (kısa devre)	false
📌 Pratik Tavsiye:
Eğer performans açısından gereksiz işlemleri engellemek istiyorsanız, && kullanmalısınız. Çünkü & ikinci ifadeyi gereksiz yere çalıştırabilir.
 */