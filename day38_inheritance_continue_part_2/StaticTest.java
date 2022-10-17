package day38_inheritance_continue_part_2;

public class StaticTest {

	public static void main(String[] args) {
		
		StaticSub obj = new StaticSub();
		obj.num = 5;
		obj.print();
		
		StaticSuper.num = 10;    //static belongs to class , class nae +dot can be used
		
		obj.print();
		
		System.out.println(StaticSub.num);
		
		//StaticSub.m2();   //hata verir cunku static degil
		//StaticSuper.m2();  //buda hata verir , static eklenmeli
		
		
		/*• Static methods, can be called either using ParentClass.methodName or
SubClass.methodName*/
		
		obj.m2();   //inherited oldugu icin kullanabilirim  subclass dan superclass a erisim var
		
		StaticSub.m1();

	}

}