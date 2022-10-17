package day39_inheritance_part_3_review;

public class ToyotaTest {

	public static void main(String args[]) {
		
		Toyota toyota = new Toyota(36);  //debug mode daki ilk asagi yonlu ok siniflar arasi gecisi sagliyor
		                                 //toyota sinifina gitti compiler
		
		toyota.steer(45);  //steet vehicle class inda bir method  -- inheritance ile 3 sinif birbirine baglanmis
		
		toyota.accelerate(30); //jvm ilkonce objectin classina (Toyota) gitmek ister bulmak icin yoksa parent class da arar yine yoksa parent class da baska bir sinifa inheritance ile ulasabilir, gidip orda arar
		toyota.accelerate(20);
		toyota.accelerate(-42);
	}

}

