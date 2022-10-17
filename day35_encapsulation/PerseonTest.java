package day35_encapsulation;  //user should not access directly to a variable, but should access through different mechanism which i have filter on it

public class PerseonTest {

	public static void main(String[] args) {
		
		Person ozzy = new Person();
		
		ozzy.setAge(18);
		
		
		
		//print age
		System.out.println(ozzy.getAge());
		
	
		//Encapsulation  (asagidaki adimlari yapmaya denir) -->interviewda asagidaki gibi acikla
		
		//cut the access  - private
		//create setter method to initialize my value
		//create getter method to retrieve it 
		
		

		
		//private variables
		//public setter methods
		//public getter methods
	
		

	}

}

/*     //in interviews they can ask access modifiers and their differences
access modifier


public --->available to its Class, available to different classes in the same package , also available to different classes in different packages

 yani public available to anywhere
 
 *pdf de description ---> When the public access specifier is applied to a class member , the member can be accessed by code inside the class or outside
 
 
 
 private---> only visible to current class , baska bir class dan erisim saglanamaz

*
*
*
*
*
*
*
*
*
*/