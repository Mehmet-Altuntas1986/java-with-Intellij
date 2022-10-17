package day36_staticClassMembers;

public class Calculator {    //onceden ogretmen bir sinif actigimizda, method olustururken genellikle static koymamamizi istemisti, cunku bu durumda variable Sinif a ait olur
	
	int x;  //burda bir instance variable var --> sinifin icinde, methodlarin disinda, objecte bagimli
	
	public static double plus(double num1,double num2) {
		return num1+num2;
	}
	
	public static double minus(double num1,double num2) {  //burda static koyabildik ,cunku method x e bagimli degil
		return num1-num2;
	}
	
	public static double multiply(double num1,double num2) {
		return num1*num2;
	}
	
	public int m1() {  //bu methodda public static dersem hata verir cunku x is instance variable oldugu icin objecte bagimli yani sinifa degil , static olunca sinifa ait, bagimli gibi olur.
		return x+4;
	}

}

/*

Static methods

If you declare any method as static, it is known as a static method.

• A method that can be called using a class name, without creating an object.    --> object olusturursak sinifin ismiyle , objectin referansiylada call islemini yapabiliriz

• Objects can also call static methods 

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