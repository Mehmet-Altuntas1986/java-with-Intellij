package day43_polymorphism;

public class TestMethod {
	public static void main(String[] args) {
		childA chA =new childA();
		chA.m1();
		chA.m2();
		chA.m3();
		
		childB chB =new childB();
		chB.m1();
		chB.m2();
		chB.m4();
		
		Parent p1 = new childA(); //POLY   --> REFERENCE TYPE IS PARENT , OBJECT TYPE IS CHILD
		p1.m1();
		
		Parent p2=new childB();
		p2.m1();
		
		MyInterface int1 = new childA();              //dikkat et buyuk ve kucuk harfle baslayan class lara , bazen hata buyuk kucuk harfleri goremedigimizden dolayi oluyor
		int1.m2();
//		int1.m3();  //REFERENCE TYPE BELIRLEYICI OLDUGUNDAN -->myinterface sinifinda m3 methodu yok  //object casting ile ulasim mumkun--> pdf ye bak
		
		MyInterface int2 = new childB();
		int2.m2();

		
		
	}
	

    }

class Parent{
	public void m1() {}
}

interface MyInterface{
	
	void m2();
	
}

class childA extends Parent implements MyInterface{
	
	public void m2() {}  //overriding
	public void m3() {} 
}

class childB extends Parent implements MyInterface{
	public void m2() {}
	public void m4() {}
}