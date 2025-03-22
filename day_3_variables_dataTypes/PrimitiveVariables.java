package day_3_variables_dataTypes;

import java.sql.SQLOutput;

public class PrimitiveVariables {

    public static void main(String[] args) {


        //alt option+comment+L    SAYFA DUZENI ICIN KISA YOL


        //byte you can write between -128 to +127
        byte b1 = 25;
        byte b2 = -25;
        //byte b3 = 128;



        System.out.println("b1=" + b1);
        System.out.println("b2=" + b2);


        //short (16-bit): Stores slightly larger integers (-32,768 to 32,767).    //5 RAKAM YAN YANA

        short s1 = -32768;
        short s2 = 32767;
        short s3 = 500;

        System.out.println("s1 = " + s1);

        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


        //int (32-bit)    //Range: -2,147,483,648 to 2,147,483,647         //10 RAKAM YAN YANA
        int i1 = -214768;
        int i2 = 20;
        int i3 = 100_000;  //100000
        int i4 = 100000;
        // 100_000 and 100000 are same.if we use underscore (_) For long numbers its easier to see

        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
        System.out.println("i4 = " + i4);

// long (64-bit): Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807          //19 SAYI YAN YANA
//Used for very large integer values, and it consumes more memory than int.

        long l1 = 5000;

        long l2 = -2147483649L;
        // We can put small (l) or capital (L) to specify its not an int its a long.
        // l or L is optional but its mandatory if some numbers are out of int range
        // After number just put an (l or L) with no space
        // In output we will not see l or L
        long creditCardNumber = 5876_1234_3453_983L;



        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);
        System.out.println("creditCardNumber = " + creditCardNumber);  //587612343453983


        // Floating Numbers : default is double
        // float and doubles are data types
        // f or F is optional but its mandatory if some numbers are out of float range    //YANI DOUBLE A
        // Precision of ~7 decimal digits.
        //In some cases, float may perform faster than double because it uses less memory and bandwidth.

        float f1 = 2.1F;
        //float f1 = 2.1;    //This will result in a compilation error because 2.1 is treated as a double by default, and you are trying to assign it to a float variable, which is not allowed without an explicit cast or the f suffix.


        //double (64-bit):
        //Precision of ~15 decimal digits.
        double d1 = 3.14;

       // DOUBLE IS DEFAULT BUT FLOAT IS NOT DEFAULT

        System.out.println("f1 = " + f1);

        System.out.println("d1 = " + d1);

         //A char in Java is a 16-bit value (2 bytes).
        //This means it can hold 2^16 different values, which is 65,536 possible characters.

        char c1 = 'A';
        char c2 = 65; //Decimal value corresponding to character 'A'

        System.out.println(c1);     // A
        System.out.println(c2);     // A



        //A Unicode escape sequence in Java is used to represent characters using their Unicode code points.
        // It is written in the form   BACKSLASH THEN  uXXXX'  , where XXXX is a four-digit hexadecimal value that represents a specific
        // character in the Unicode standard.
        // https://www.utf8-chartable.de/
        char c3 = '\u0041';         // A

        System.out.println(c3);


        char c4 = 8658;

        System.out.println(c4);    //   →   OK BELIRDI


        boolean status = true;

        boolean status2 = false;

        System.out.println("Eligible to take the exam: " + status);

        System.out.println("He is 16, can he take driver licence?: " + status2);


        String name = "ABD";

        System.out.println("My name is " + name);


    }

}
