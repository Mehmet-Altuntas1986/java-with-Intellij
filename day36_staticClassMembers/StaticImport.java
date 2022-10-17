package day36_staticClassMembers;

import static java.lang.Math.*; /*packageName.className.elements(variables or methods) //import all static properties belongs to math class //ogretmen bu kismi eliyle yazdi , boyle yazinca 
                                direkt olarak islem yapabilirsin-->    line 16 da Math . yapmadan yani class in ismini girmedende islem yapabildi             */

import java.util.*; //packageName.className

public class StaticImport {

	public static void main(String[] args) {
		
		
		
		System.out.println(Math.sqrt(16));
		
		System.out.println(sqrt(16));
		
		System.out.println(PI);

	}

}