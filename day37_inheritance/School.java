package day37_inheritance;

public class School {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.name = "Mike";
		person.age = 40;
		person.gender = 'M';
		
		Student student  = new Student();
		student.name = "Tom";  //assign Tom to name. where is name?  what is object? student - belong to Student class
		student.age = 25;
		student.gender = 'M';
		student.studentId = 12948;   //Student id is uniq to 
	
		
		//person.code("java"); //hata verir cunku code methodu student class inda , person is not inheriting from student class,  Student class is inheriting from person class
		
		

	}

}