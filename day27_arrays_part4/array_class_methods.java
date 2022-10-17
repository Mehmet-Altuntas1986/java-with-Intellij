package day27_arrays_part4;

import java.util.Arrays;

public class array_class_methods {

	public static void main(String[] args) {
	//toString()
				int[] nums = {43,12,4,1,3,5};
				System.out.println(Arrays.toString(nums));
				
				//equals()
				int[] nums1 = {4,5,6,10,100};
				int[] nums2 = {4,5,6,10,100};
				System.out.println(Arrays.equals(nums1, nums2));       //arrays is a class in util package of library and  it has methods
				                    //ilginc olan kisim methodu class ismiyle kullanabiliyor ,  stringlerde reference ile kullanabiliyorduk
				
				
				
				
	//sort() : sorts array in ascending(yukselen) order
				
			Arrays.sort(nums);   // in interviews sometimes they ask without using sort method , do the same thing
				System.out.println(Arrays.toString(nums));
				
				String[] languages = {"Zulu","Spanish","Italian","english","1Polish","arabic","@abc"};
				
			Arrays.sort(languages);  //oce rakamliyi koyar ve pesinden special character like @, then capitals are sorted ,then small letters are placed
			

			
	//binarySearch() ==> index numaralarini verir
			
				int[] numX = {4,6,7,10,55};
				System.out.println(Arrays.binarySearch(numX, 7)); //2   ---> 7 nin index numarasini verdi
				System.out.println(Arrays.binarySearch(numX, 55));//4
				System.out.println(Arrays.binarySearch(numX, 5)); //-2   //(-(insertionPoint)-1)
				                                                                    //  1
				//4un index numarasi 0, 5 te sanki onun yanindaymis gibi olur ,yani index numarasi 1=insertion point
				
				
				System.out.println(Arrays.binarySearch(numX, 15));  //-5    (-(insertionPoint)-1)             //15 10 ile 55 arasindaymis gibi dusun , ama orada degil  , index numarasi kac olurdu --4
				                                                                   //4
	         
				
				System.out.println("*******************************copyOf");
	//copyOf()     --->yeni bir object olusturur
				double[] d1 = {2.3,4.5,12.4};
				double[] d2 = d1; //both pointing the same object   //burasi copy degil ,   tamamen ikiside ayni degerlere sahip , birinin icindeki degeri degistirsek , digeride ayni sekilde degisir.
				                     //ama copy methodunda birini degistirsek digeri degismez
				
				System.out.println(Arrays.toString(d1));
				System.out.println(Arrays.toString(d2));
				
				d1[0]=100.3;
				System.out.println(Arrays.toString(d1));
				System.out.println(Arrays.toString(d2));
				d2[1]=400.5;
				System.out.println(Arrays.toString(d1));
				System.out.println(Arrays.toString(d2));
				
    //double[] d3 = Arrays.copyOf(d2, d2.length);                   //d3 copya oldu  
				
				double[] d3 = Arrays.copyOf(d2, 5);
				System.out.println(Arrays.toString(d3));
				
				d2[0]=5.2;                                          //d2 deki verileri biraz degistirsek bile d3 degismez, cunku copyof methodu kullanilmisti
				System.out.println(Arrays.toString(d2));
				System.out.println(Arrays.toString(d3));
				
				
				//String :  ==  and .equals
				//Array :  reference equality and copyOf()
				
				
				
	}

}
