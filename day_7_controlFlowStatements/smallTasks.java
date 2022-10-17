package day_7_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		
		int x=0;
		int y=20;
		
		if (y==20) {
			
			x=5;
			
		}
		
		System.out.println("x = " + x + " y = " + y);
		
		System.out.println("***********************************************");
		
		
		//2-Write an if statement that multiplies payrate by 1.5 if hours is greater than 40
			double payRate=1000;
			int hours=50;
				
			if(hours>40) {
			payRate=payRate*1.5;
			}
				
			System.out.println("Payrate is " + payRate);
			
			System.out.println("***********************************************");
				
		//3-Write an if statement that sets the variable fees to 50 if the boolean variable max is true
		
			boolean max = false;
			int fee=20;
			
			if(max) {       //if(max==true)
				fee=50;
			}
			System.out.println("Fee is " + fee);
				
			System.out.println("***********************************************");
			
			//4-Write an if statement that assigns 20 to the variable a if variable b is 50 AND c is greater 
			//and equal to 100
			
			int a = 100;
			int b = 50;
			int c = 30;
			
			if(b==50 || c>=100) {
				a=20;
			}
			
			System.out.println("a = " + a);
			
			System.out.println("***********************************************");
			
			
			//5-Write an if statement that prints "Ideal Temp" if the temp is between 70 and 80
			
			int temp=65;
			
			if(temp>=70 && temp<=80) {
				
				System.out.println("Ideal Temp");
			
			}else {
				System.out.println("Not Ideal Temp");
			}
			
			
				
				

	}

}
