package JavaFileOne;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        System.out.println("Calculating the Area of the circle!.");

        System.out.println("What is the Base of the triangle : ");
        Scanner obj= new Scanner(System.in);

        int base = obj.nextInt();

        System.out.println("What is the height of the triangle : ");

        int height = obj.nextInt();

        System.out.println("Area of the triangle is : " + ((base*height) /2 ) + " cm\u00B2");
    }
}
