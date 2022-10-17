package day33_Constructors;

public class Student {

	String name;
	int age;
	char gender;
	int year; //default value : 0
	String course;
	String university = "Cybertek"; //default value as Cybertek   
	
	
	
	public Student(String name, int age, char gender, int year, String course, String university) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	}

	public Student(String name, int age, char gender, int year, String course) {  //build constructor and make assignments
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}
	
	//public void Student() {} bu method constructor degil, cunku void var (no return)
	
//asagidakiler constructor degil
	
	//methods
	public void attendLecture() {
		System.out.println(this.name + " is attending lecture");
	}
	
	public void submitAssignment() {
		System.out.println(name + " is submitting assignment");
	}
	
	public void attendLab() {
		System.out.println(name + " is attending lab");
	}
	
	
	
}