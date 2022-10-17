package day10_controlFlowStatements_Part4;

public class task41_OddNumbers {

	public static void main(String[] args) {
		
		
		for(int i=5;i<=140;i++) {
			
			if(i%2==1) {			//if(i%2==1)      and       if(i%2!=0)           is samme.
				
				System.out.println("i = " + i );
		
			}
		}			
				
System.out.println("*****************************************************************************");


		for(int i=5;i<=140;i++) {
	
			if(i%2!=0) {			//if(i%2!=0)      and       if(i%2==1)           is samme.
			
				System.out.print(i + " ");
			}
		}



	}

}
