package day36_staticClassMembers;

public class Student {
	
	String name;       // belongs to object  //ilgili object , butun objectlere degil
	int age;           // belongs to object
	int idNumber;     // belongs to object
	static String school="Cybertek";  //belongs to class (static ten dolayi) 
	                                  //• The static variable can be used to refer to the common property of all objects  (which is not unique for each object)    //studentTest adli class ta herbir parantezin icine cybertek eklemektense , buraya koydu , common oldu static ile
	                                  //if we call static , becoming common for all objects
	public Student(String name, int age, int idNumber) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	
	
	
	

}