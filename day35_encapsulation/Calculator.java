package day35_encapsulation;

/*
Write a class with the name Calculator. The class needs two fields (instance variables) with name floor of type Floor
and carpet of type Carpet.
The class needs to have one constructor with parameters floor of type Floor and carpet of type Carpet and
it needs to initialize the fields.
Write the following methods (instance methods):
* Method named getTotalCost without any parameters, it needs to return the calculated total cost to cover the floor
with a carpet. //cost*area
 */

public class Calculator {    //Floor ve Carpet class larina  baglantiyi asagidaki sekilde yapti--->decleration kisminda
	
	public Floor floor;          //decleration    //Floor floor = new Floor();   esitligin diger tarafini koymadi    
	public Carpet carpet;        //object decleration
	
	public Calculator(Floor floor, Carpet carpet) { //passing object to method parameters
		this.floor = floor;
		this.carpet = carpet;
	}


	public double getTotalCost() {
		return carpet.getCost() * floor.getArea();    //carpet isimli class in icinde getCost() ve getArea(); adinda methodlar var
	}

}