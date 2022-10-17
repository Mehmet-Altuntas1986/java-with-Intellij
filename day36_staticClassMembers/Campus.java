package day36_staticClassMembers;

public class Campus {
	
	private String city;
	
	static String country;
	
	static {
		System.out.println("Static Block-1");
		country="USA";
	}
	
	public Campus(String city) {
		System.out.println("Constructor");
		this.city=city;
	}
	
	static {
		System.out.println("Static Block-2");
		country="UK";
	}

}


// if there is a static block , first it will be loaded ,then other methods results can appear in console



/*

Static blocks
• Static block is a set of instructions that is run only once when a class is loaded into
memory.
• A static block is also called a static initialization block.


*/