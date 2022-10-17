package day_9_controlFlowStatements_3;

public class day9_Part2_Assesment_Test {

	public static void main(String[] args) {
		
		
		int i,c;
		double d,f;
		
		i=4;
		f=4.3;
		d=1.8;
		c=0;
		
		if(i!=c) {
			
			c++;
			if ((f+d)==(c+=2)) {
				
				System.out.println(f);
				
			}
						
		}
		
		System.out.println(d);

	}

}
