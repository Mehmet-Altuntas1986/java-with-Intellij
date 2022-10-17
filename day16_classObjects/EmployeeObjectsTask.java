package day16_classObjects;

public class EmployeeObjectsTask {

	public static void main(String[] args) {

		Employee e1 = new Employee();

		e1.name = "Abdurrahman";
		e1.jobTitle = "SDET";
		e1.salary = 100000.0;

		System.out.println(e1.name);
		System.out.println(e1.jobTitle);
		System.out.println(e1.salary);

		e1.work();
		e1.attendMeeting();
		e1.introduce();
		e1.EmployeeInfo();

	}

}
