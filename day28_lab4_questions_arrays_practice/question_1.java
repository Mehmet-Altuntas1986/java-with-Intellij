package day28_lab4_questions_arrays_practice;

public class question_1 {

	public static void main(String[] args) {
		/*	Write a method that accepts an array and return true if 6 appears as either the first or
		last element in the array. The array will be length 1 or more.
		
		int[] x = {1,2,6}; = > true
		int[] y = {6,1,2,3}; = > true
		int[] z = {13,6,1,2,3}; = > false    */



int[] x = {6};
int[] y = {6,1,2,3};
int[] z = {13,6,1,2,3};
int[] k = {1};

//calling the method
System.out.println(firstLast6(x));
System.out.println(firstLast6(y));
System.out.println(firstLast6(z));
System.out.println(firstLast6(k));




}

public static boolean firstLast6(int[] arr) {

if(arr.length<1) {   //it means there is nothing inside curly braces
	return false;
}

if(arr[0]==6 || arr[arr.length-1]==6) {
	return true;
}else {
	return false;
}
}

}