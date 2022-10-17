package day_1_hello_world_16_03_2021;

 public class Main {
                            //you can write String[] args,   String args[] or    String...args;    the compiler accepts any of these
	 public static void main(String [] args) {  //burada sadece istersek args ismini degistirebiliriz , digerlerini degistirmek hata olusturururr

		//System.out.println("Hello World");
		 System.out.println(args[0]);   //compiler hatasi vermedi ama Exception olustu konsolda -Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0


	 }

}
 
 //main methodu yazarken Main diye yazma (kucuk harfle yaz) , consolda -->Error: Main method not found in class day1_hello_world_16_03_2021.Main, please define the main method as:

 
 //private static void main yazma -->bu duurumdada consolda  -->Error: Main method not found in class day1_hello_world_16_03_2021.Main, please define the main method as:
 
 
/*
 
 1.	Public: It is an Access modifier, which specifies from where and who can access the method. Making the main() method public makes it globally available. It is made public so that JVM can invoke it from outside the class as it is not present in the current class.


package day1_hello_world_16_03_2021;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World");

	}

}



class GeeksforGeeks {
    private static void main(String[] args)
    {
        System.out.println("I am a Geek");
    }
}
	Error: Main method not found in class, please define the main method as:	public static void main(String[] args)
    or a JavaFX application class must extend javafx.application.Application
	Static: It is a keyword which is when associated with a method, makes it a class related method. The main() method is static so that JVM can invoke it without instantiating the class. This also saves the unnecessary wastage of memory which would have been used by the object declared only for calling the main() method by the JVM.

 class GeeksforGeeks {
    public void main(String[] args)
    {
        System.out.println("I am a Geek");
    }
}

	Error: Main method is not static in class test, please define the main method as:	public static void main(String[] args)	Void: It is a keyword and used to specify that a method doesn’t return anything. As main() method doesn’t return anything, its return type is void. As soon as the main() method terminates, the java program terminates too. Hence, it doesn’t make any sense to return from main() method as JVM can’t do anything with the return value of it.

class GeeksforGeeks {
    public static int main(String[] args)
    {
        System.out.println("I am a Geek");
        return 1;
    }
}
9.	Error: Main method not found in class, please define the main method as:
10.	public static void main(String[] args)
11.	or a JavaFX application class must extend javafx.application.Application
12.	main: It is the name of Java main method. It is the identifier that the JVM looks for as the starting point of the java program. It’s not a keyword.
class GeeksforGeeks {
    public static void myMain(String[] args)
    {
        System.out.println("I am a Geek");
    }
}
	Error: Main method not found in class, please define the main method as:
	public static void main(String[] args)
	or a JavaFX application class must extend javafx.application.Application
	String[] args: It stores Java command line arguments and is an array of type java.lang.String class. Here, the name of the String array is args but it is not fixed and user can use any name in place of it.

class GeeksforGeeks {
    // javac GeeksforGeeks.java
    // java GeeksforGeeks 1 2 3
    public static void main(String[] args)
    {
        for (String elem : args)
            System.out.println(elem);
    }
}




	Apart from the above mentioned signature of main, you could use public static void main(String args[]) or public static void main(String… args) to call the main function in java. The main method is called if it’s formal parameter matches that of an array of Strings.





*/