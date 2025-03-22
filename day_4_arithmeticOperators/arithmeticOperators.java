package day_4_arithmeticOperators;

public class arithmeticOperators {

	public static void main(String[] args) {
		
		
		//Addition Operator +
		System.out.println(55+5);
		
		int chairs = 140;
		
		System.out.println(chairs+2);
		
		System.out.println(chairs);
		
		chairs = chairs + 2;
		
				
		int moreChairs = chairs+5;
		
		System.out.println(moreChairs);
		
		int tables=130;
		
		int total=tables+chairs;
		
		System.out.println(total);
		
		System.out.println("*************************************************************");
		
		
		//Subtraction -		 
		
		double balance = 1200.50;
		
		double transaction = 56.44;
		
		System.out.println(balance-transaction);
		
		// We will reassign the balance value
		
		balance=balance-transaction;
		
		System.out.println(balance);
		
		
		//Create a variable linesOfCode and assign 50 and print "Lines of code 50"
		//delete 2 lines
		//decrease the value of linesOfCode by 2 and print "Lines of Code 48"
		
		
		int linesOfCode = 50;
		
		System.out.println("Lines Of Code " +linesOfCode);
		
		linesOfCode=linesOfCode-2;
		
		System.out.println("Lines Of Code " +linesOfCode);
		
		
		System.out.println("*************************************************************");
		
		
		//Multiplication *
		
		System.out.println(22*2);
		
		int classes = 5;
		
		//linesOfCode is 48 from Substraction part***
		
		System.out.println(linesOfCode * classes);
		
		int totalLinesOfCode=linesOfCode * classes;
		
		System.out.println("Total Lines of Codes = " + totalLinesOfCode);
		
		
		System.out.println("*************************************************************");
		
		
		
		//Division /
		
		System.out.println(10/2);
		
		System.out.println(60/3);
				
		//System.out.println(11/0); //Java will throw an exception called ArithmeticException at runtime
				
		System.out.println(11*0); // for * multipcation there is no problem
		
		System.out.println(11*0);
		
		
		System.out.println("*************************************************************");
		
		
		
		//Remainder %
		
		System.out.println(10 % 2);
		
		System.out.println(9 % 2);
		
		
		
		
		
		
		

	}

}
