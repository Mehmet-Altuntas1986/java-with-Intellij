package day_4_arithmeticOperators;

public class task16_AreaOfCircle {

    public static void main(String[] args) {


        final double PI = 3.14;

        double area, perimeter, radius = 20;        //sadece radius 20 ye esit burada


        area = radius * radius * PI;  //alan

        perimeter = 2 * radius * PI;  //cevre


        System.out.println( "Area of the circle is " + area );

        System.out.println( "Perimeter of the circle is " + perimeter );


    }

}
