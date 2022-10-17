package day36_staticClassMembers;

public class Dinner {  //class imizin ismi
	
	  static int pizzaSlice = 8;  //static kullanildigi icin pizzaslice belongs to class , yani sinifa ait --static variable
	                            //static olmasaydi , instance variable ,yani object e ait variable olurdu
	
	
	
	public void takeASlice() {     //2 metdodun ismide ayni oldugundan overloading var 
		pizzaSlice--;
	}
	
	public void takeASlice(int count) {
		pizzaSlice-=count;
	}

}