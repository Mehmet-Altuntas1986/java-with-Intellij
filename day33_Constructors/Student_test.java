package day33_Constructors;

public class Student_test {

	public static void main(String[] args) {
		
		Student s1 = new Student("Mike", 17, 'M', 2019, "Java");   //objecti bir class ismiyle olusturdu ve o class in icerisinde constructor lar var
		Student s2 = new Student("Mary", 25, 'F', 2017, "JS");
		
		System.out.println(s1.university);
		System.out.println(s2.university);
		
		s1.attendLab();
		s2.attendLecture();
				

	}

}