package day43_polymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		Shape s1 = new Shape();  //Shape clasinda object olusturduk, dolayisiyla compiler o sinifa gider 
		s1.draw();
		
		Shape s2 = new Circle();    //Shape is parent class  ,Circle is child class  --->polymorphism
		s2.draw();   //Circle sinifindaki overriden i ni iptal edersen , shape sinifindaki draw methodununun icerigini kullanir
                     //jvm-->check circle class and if there is overriden (draw) , run it
	}                //jvm-->check circle class and if there is no overriden (draw) , run it from parent class (Shape teki draw methodu)

}


//yukarida hangi draw methodu calisacak?
//If method is not overridden, it will call parent/super class version  (yani parent class daki draw methodunu kullanir)