package practice_oop;

public class Main {
    public static void checkAge(int age) {

            throw new IllegalStateException();


    }

    public static void main(String[] args) {
        checkAge(17); // Set age to 15 (which is below 18...)
    }


}

class Main2 {
    public static void main(String[ ] args) {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        System.out.println("hello");

    }
}