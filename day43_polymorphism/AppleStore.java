package day43_polymorphism;

public class AppleStore {
	public static void main(String[] args) {
		
		AppleDevice mac= new Mac();
		mac.use();
		//mac.code();  //AppleDevice da code isminde bir method yok  //no access
		
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code();   //Mac classinda bu method var , sorunsuz calisir
		
		AppleDevice watch =new AppleWatch();
		watch.use();
		
	}

}
