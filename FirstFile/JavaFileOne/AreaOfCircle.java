// package JavaFileOne;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        System.err.println("Calculating the area of the circle");

        float pi = 3.141f;

        System.err.println("Enter the radius of the circle : ");

        Scanner obj =  new Scanner(System.in);
        int radius = obj.nextInt();

        System.out.println("Area Of the circle is : " + (pi * (radius * radius)) + "cm\u00B2");
    }
}
