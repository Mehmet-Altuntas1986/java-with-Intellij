package day16_classObjects;

public class Employee {

	String name;
	String jobTitle;
	double salary;

	public void work() {
		System.out.println(name + " is working hard...");
	}

	public void attendMeeting() {
		System.out.println(name + " is attending a meeting...");
	}

	public void introduce() {
		System.out.println("Name: " + name + ", Job title: " + jobTitle + ", Salary: " + salary);
	}
	
		//While creating a method; we can create a value name with its value type in the method and then write the value in it. Line 17+18 and Line 23-26 are same.  
	
	public void EmployeeInfo() {
		String info = "Name: [" + name + "], Job Title: [" + jobTitle + "], Salary: [" + salary + "]";

		System.out.println(info);
	}

}
