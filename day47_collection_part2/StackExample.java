package day47_collection_part2;      

import java.util.*;   //Vector ,Stack ve diger util package classlarini kullanmada sorun olmamasi icin yildiz koyuldu

public class StackExample {

	public static void main(String[] args) {    //bu konulari analayabilmek icin pdf lerde gecen resimlerdeki sekillere bakmak lazim, bu sekilde interface ler ve onlarla baglantili classlar gorulebilir
		
		Vector<Integer> numsStack = new Stack<>();    //Stack is a class , therefore an object can be created with it   //Vector is the Parent class of Stack
		
		/*ways to create an object*/
		
		//creating object
		//regular way - Class - Class
		//polymorphic way - Parent/Interface - Class
		//who decides what to access? - reference (parent class) - Vector is the reference class because it is the parent of the stack class (polymorpic way ile object olusturuldu)
		
		numsStack.add(50);   //yiginin en alttaki uyesi
		numsStack.add(70);
		numsStack.add(500);
		numsStack.add(50);  //top of the stack (yiginin en ustundeki)
		
		System.out.println(numsStack.toString());
		
		//check value on top of stack     //peek methodu Stack a ait fakat belirleyici Vector (reference class) , buyuzden casting yapildi
		
		System.out.println(((Stack<Integer>) numsStack).peek()); //top elementi verir Stack ta(ust uste yigilmis,konulmus elementlere stack denir
		
		
		//read value on top of stack then remove it 
		
		((Stack<Integer>) numsStack).pop();  //en usteki elementi cikarir  //burdada casting var , yukarida ki aciklamayi incele  //down casting
		
		
		
		System.out.println(numsStack.toString());
		
		System.out.println(((Stack<Integer>) numsStack).peek());
		
		System.out.println(numsStack.get(0));
		
		
		
		//Stack deyince lifo--<last in , first out  --->son giren ilk cikar
		

	}

}