package day37_inheritance;

public class Student extends Person {  //student can have everything that person class has    

	int studentId;   //butun insanlar ogrenci id si yok , bu yuzden extra seyler ekliyor
	String termClass;
	
	public void code(String lang) {
		System.out.println(name + " is coding " + lang);
	}
	
	public void attendClass() {
		System.out.println(name + " is attending " + termClass + " class");
	}

}







//Student class 5 tane methoda erisim saglayabiliyor  , 3 tanesi person class inda  , 2 tane de kendi class inin icinde

//when we create an object from student class ,you can access 5 methods , this object can run 5 objects 