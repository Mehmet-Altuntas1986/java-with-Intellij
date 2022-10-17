package day12_controlFlowStatements_Part6_Branching_Statements;

public class BreakContinue {

	public static void main(String[] args) {
		
		
		for(int i =1; i<=5; i++) {
			if (i==4) {
				break;     //if we use break;  then it will only print 1 2 3   //compiler jumps out of loop
				//continue;  //compiler jumps line 8
			}
			
			System.out.println(i);
		}
		

	}

}
