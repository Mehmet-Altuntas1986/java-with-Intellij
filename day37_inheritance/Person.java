package day37_inheritance;

public class Person {
	
	String name;    //public String name;    deseydik public variable olurdu      //public is access modifier   //onune public koyunca farkli paketler arasinda da inheritance kullanilabilir
	int age;        //default --> cunku onunde access modifier belirtilmemis  , bu durumda inheritance sadece ayni paket in icinde olunca mumkun olur, yani baska bir class bunu sadece ayni paketin icinde ise kullanabilir
	char gender;
	
	public void eat(String food) {
		System.out.println(name  + " is eating " + food);
	}
	
	public void walk() {
		System.out.println(name + " is walking");
	}
	
	public void sleep(int hours) {
		System.out.println(name + " is sleeping for " + hours + " hours");
	}

}


/*   What is inherited?


• All public variables and methods.

• All protected variables and methods.  (ayni paketin icinde olmadan da mumkun inheritance)

• All default variables and methods are inherited only if super class and                     //Super class---sub class  yada     parent class --child class  yada  based class ---derived class   ayni conseptler
sub class are in the same package.

• Private variables and methods are not inherited. But it is accessible
using public getter/setters.

• Constructors are not inherited.       */





/*
Inheritance
• Super Class: The class whose features are inherited is known as super
class(or a base class or a parent class)

• Sub Class: The class that inherits the other class is known as sub
class(derived class, or child class). The subclass can add its own fields
and methods in addition to the superclass fields and methods.*/