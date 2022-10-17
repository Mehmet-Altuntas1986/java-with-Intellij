package day10_controlFlowStatements_Part4;

public class ternaryOperator {

	public static void main(String[] args) {
		
		
		String result;
		int score=48;
		
		if(score>60){
						
			System.out.println("pass");
					
		}else {
			System.out.println("fail");
			}
		
		//System.out.println(result= score>60 ? "pass" : "fail");  //This line is same as Line 10 to 17
		
		
		System.out.println("*****************************************************************************************");
				
		int x=1;
					
		if(x>2) {
			
			if(x<4) {
				
				System.out.println(10);
			}else {
				System.out.println(8);
			}
			
		}else {
			
			System.out.println(7);
			
		}
		
		//System.out.println(x>2 ? x<4 ? 10: 8 : 7);  //This line is same as Line 26 to 39

	}
	
}


