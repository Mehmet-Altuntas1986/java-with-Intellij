package day38_inheritance_continue_part_2;


public class Student extends Person {

//	@Override  --> superclass ve subclass da ayni isim ve parametrelere sahip methodlar var
	public void message() {
		System.out.println("This is student class");
	}
	
	public void display() {
		message();
		super.message(); //super. is taking us to parent
	}
	
	

}
