package day36_staticClassMembers;

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike",30,1000);
		Student s2 = new Student("Ozzy",20,2000);
		Student s3 = new Student("Jamal",10,3000);
		
		s1.school="CybertekEU"; //bu diger objectleride etkiledi hepsinde school value cybertek oldu   //Student class inda static i kaldirirsak sadece s1 de CybertekEU olur digerleri cybertek olur
		
		//whenever i make changes, this change is reflected in class level
		//so all other object will be affected thru this change
		
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		

	}

}

//access modifiers : public , private , default (hicbirsey yazilmayinca) , protected 
//
//static is not access modifier , it is only keyword




/*static is a non-access modifier in Java which is applicable for the following:

1. Variables
2. Methods
3. Blocks   --->  curl braces larin arasi  block */  


/*

Static variables
If you declare any variable as static, it is known as a static variable.
• The static variable can be used to refer to the common property of all objects
(which is not unique for each object)
• The static variable gets memory only once in the class area at the time of class
loading.
• A single copy of a class’s static variable is shared by all instances of the class.
• If changes are made to static variable, all other instances will see the effect of the
change.    */