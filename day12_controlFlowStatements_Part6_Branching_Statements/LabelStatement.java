package day12_controlFlowStatements_Part6_Branching_Statements;

public class LabelStatement {

	public static void main(String[] args) {

		int i = 0;
		outer: do {
			i = 8;
			
			inner: while (true) {
				System.out.println(i--);
				if (i == 4) {
					break outer;
				}
			}
		} while (true);

	}

}
//outer,inner, middle , yada yazacagimiz farkli bir isim olabilir ,
//bazen break ile o labelin disina cikilir yada continue ile o label a compiler yeniden 
//gider ve devam eder.