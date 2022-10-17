package day37_inheritance;

public class Employee extends Person{    //  relation kuruluyor , employee de bir kisidir      //Employee sinifiyla object olusturulunca person sinifinin methodlarini kullanabiliyor
	
	String jobTitle; //Person class inda olmayan , sadece employee e ait olan ozelligi buraya ekledi , gereksiz yere person daki herseyi buraya koymadi, cunku object olusturdugunda erisim saglayabilir
	
	public void work() {
		System.out.println(name + " is working as " + jobTitle);   //name is in person class 
	}

	
	public String toString() {
		return "Employee [jobTitle=" + jobTitle + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	
	
	

}
           //name, age , gender --> bunlar hep person class indan geliyor (inheritance)


//inheritance --->bir seyi baska bir yerden alma 


//to be able use method ,we need object