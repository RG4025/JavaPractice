// package JavaFileOne;

import java.util.Scanner;

public class AddTwoNumber {
    public static void main(String[] args) {
        System.out.println("Printing the addition of the two number");
    
        Scanner obj = new Scanner(System.in);
    System.out.println("Enter the first Number : ");
    int num1 = obj.nextInt();

    System.out.println("Enter the second Number : ");
    int num2 = obj.nextInt();

    System.out.println("Addition of " + num1 + " + " + num2 + " = " + (num1 + num2));

    
    }
}
