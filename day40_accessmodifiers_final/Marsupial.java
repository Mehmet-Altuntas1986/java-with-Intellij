package day40_accessmodifiers_final;

public class Marsupial {
	
	/*
	public boolean isBiped() {
		return false;
	}
	*/
	
	
	
	public static boolean isBiped() {
		return false;
	}
	
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs:" + isBiped());
	}                                                           //calling

}

//override +static olunca child method un sonucunu gostermedi , hiding child class method

//it is not overriding, it is hiding