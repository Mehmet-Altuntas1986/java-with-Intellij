package day13_Methods_Part1;

public class StudentMethod {

	public static void main(String[] args) {

		sayHello();			//we can call methods which order we want to print
		study();
		code();

	}

	public static void sayHello() {

		System.out.println("Inside sayHello method");

	}

	public static void code() {

		System.out.println("Student is studying");

	}

	public static void study() {

		System.out.println("Student is studying java");

	}

}
