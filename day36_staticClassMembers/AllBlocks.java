package day36_staticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x) {
		System.out.println("One Argument Constructor");
	}
	
	public AllBlocks() {
		System.out.println("No argument constructor");
	}
	
	static {  //static block --> runs before all , but static blocks run only one time (once)  --->consol u incele
		System.out.println("Firsrt Static Init");
	}
	
	
	
	{      //instance block --> runs before constructor , after static blocks
		System.out.println("First Instnce Init");
	}
	
	
	
	{    //instance block
		
		System.out.println("Second Instance Init");
	}
	
	
	
	static{
		System.out.println("Second Static Init");
	}

	
	
	
}



//herbir constructor cagirildiginda instance block lar tekrardan consolda  yazilir constructordan once, yukarida instance blocklar iki kere yazildi konsola

//static blocklar sadece bir kere run olur