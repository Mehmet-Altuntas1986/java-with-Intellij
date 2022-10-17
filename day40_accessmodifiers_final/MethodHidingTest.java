package day40_accessmodifiers_final;

public class MethodHidingTest {

	public static void main(String[] args) {}

}

class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
	
}

class Panda extends Bear{
	
	public static void eat() {   	//not overriding , this is method hiding olarak soylenir --> static

		System.out.println("Panda is eating");
	}
	/*
	public void sneeze() {                                  //error--<static olmadigindan
		System.out.println("Panda is sneezing");
	}
	*/
	
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating");
	}
	
	
	
	//4 tane overriding kurali uyuyor ama 1 tane extra kural daha var ---> parent ve child class in herhangi birinde static varsa digerindede olmak zorunda, aksi durumda hata verir
	//parametre,methodname,returntype,access modifier + static  bunlarin hepsi ayniysa iki methodda --> method hiding var demektir
	
	
	//https://www.edureka.co/blog/method-hiding-in-java/
	
	
	
	
	/* In java, you need to be careful about the possibility of method hiding. A method created with the same type and signature in the sub-class can hide variables in a superclass.
	  In this article, we will understand Method Hiding in Java in the following manner:

What is Method Hiding?
Method Hiding Java Code
Summary
 

What is Method Hiding?
Method hiding is functionally very similar to methods overriding. In overriding if you create a method in sub-class with the same type and signature in sub-class 
then it allows calling of methods based on the type of instance.


In the case of static methods with the same type and signature in superclass and sub-class then, then the method in the subclass hides the method in the superclass.


package com.test;
 
class Parent {
 
    public static void foo() {
        System.out.println("Inside foo method in parent class");
    }
 
    public void bar() {
        System.out.println("Inside bar method in parent class");
    }
}
 
class Child extends Parent {
    // Hiding
    public static void foo() {
        System.out.println("Inside foo method in child class");
    }
 
    // Overriding
    public void bar() {
        System.out.println("Inside bar method in child class");
    }
}
 
public class Code {
 
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c = new Child();
        System.out.println("****************Method Hiding*******************");
        p.foo(); // This will call method in parent class
        c.foo(); // This will call method in parent class
        System.out.println("****************Method overriding*******************");
        p.bar(); // This will call method in parent class
        c.bar(); // This will call method in child class
 
    }
}


another explanation


When super class and sub class contains same method including parameters and if they are static.

The method in the super class will be hidden by the one that is in the sub class. This mechanism is known as method hiding.

Example


class Demo{

   public static void demoMethod() {
   
      System.out.println("method of super class");
   }
}
public class Sample extends Demo {

   public static void demoMethod() {
   
      System.out.println("method of sub class");
   }
   
   
   public static void main(String args[] ) {
      Sample.demoMethod();
   }
}
-->Output
method of sub class






 */
	
	
}


