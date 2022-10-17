package day12_controlFlowStatements_Part6_Branching_Statements;

public class AssesmentTest3 {

	public static void main(String[] args) {
		
		//Question 13
		int start=1;
		int sum=0;
		do {
			if(start%2==0) {
				start++;
			}
			sum+=start;
		}while(++start<=10);
		
		System.out.println(sum);
		
		System.out.println("***********************************");
		
		//Question 17
		
		int x =20;
		while(x>0) {
		
			do {
				x-=2;
			}while(x>5);
		}
		
		x--;
		
		System.out.println(x);

	}

}
