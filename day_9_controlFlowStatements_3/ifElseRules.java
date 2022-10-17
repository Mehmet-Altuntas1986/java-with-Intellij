package day_9_controlFlowStatements_3;

public class ifElseRules {

	public static void main(String[] args) {
		
		
		if(false) 
			System.out.println("Hello");
		else
			System.out.println("Bye");
		
		System.out.println("******************");
		
		if(false)								//If we have only one statement there is no need to use {}
			System.out.println("Hello");		//But,if we have 2 or more we have to use {} otherwise it will just print first line only
			System.out.println("Running");		//Second line is not belong to if statement
		//else
		// If we have more than 2 if statements :In order to put else statement we need to have {}
		//In this case we did not put {} and we wrote 2 if statements it's wrong
		

	}

}
