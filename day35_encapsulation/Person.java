package day35_encapsulation;

public class Person {
	
	private String name;   //access kesildi  yani object referance sonra dot denilince ulasamayiz baska bir class dan
	private int age; 
	private char gender;
	
	
	//setters --->
	
	public void setAge(int age) {  //farkli method ismi koyulabilir , fakat genellikle onune Set koyarlar anlasilmasi icin
		this.age = age;
	}
	
	
	
	//bu arada bazi yazilimcilar constructor olusturuyorlar ve asagidaki methodlari cagiriyorlar bu constructor ile
	
	
	
	//getters
	public String getName() {
		return name;
	}
	public void setName(String name) {  //setter
		this.name = name;
	}
	public int getAge() { //getter
		return age;
	}

	public char getGender() { //getter
		return gender;
	}
	public void setGender(char gender) { //setter
		this.gender = gender;
	}


	
	/* • We can provide only getter in a class to make the class immutable (sabit,degismez). (Read only)
       • We can provide only setter in a class to make the class attribute (write-only.)  */

	
	
	
	
	

	

	

}