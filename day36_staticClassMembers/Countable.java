package day36_staticClassMembers;

public class Countable {
	
static int instanceCount;  //static variable  ---> belongs to class ----> buyuzden butun objectler static variable degerini kendine alir
	int instanceCount2;
	
	
	
	
	public Countable() {  //constructor (bir cesit method) 
		instanceCount++;
	}
	
	public int getInstanceCount() {
		return instanceCount;
	}

}





//instance variable --->A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static. yukarida static i kaldirirsak , instance variable olur