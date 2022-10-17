package day33_Constructors;

public class Mouse_test {

	public static void main(String[] args) {
	

		Mouse mouse = new Mouse(15);    //  TEK PARAMETREYE SAHIP BIR CONSTRUCTERI  CALL YAPTIM , SIMDI DIGER CONSTRUCTERLARIDA KULLANMAK ISTIYORUM. BU DURUMDA 
		                               //  Mouse mouse = new Mouse(15); // BASKA PARAMETRELERE SAHIP BIR CONSTRUCTER CAGIRIRKEN BIRDAHA BUNU KULLANAMAM , DIGERLERINIDE this() ile cagirabilirim

	                                 //  this()  :calling one constructor from another
		
		mouse.print();  //method calling

	}

}