package JAVASecond;

import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        
        System.out.println("Printing the reverse number of the given number using for loop!.");

        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the number : ");

        int num = obj.nextInt();

        int copyNum = num;
        int reverse = 0;

        for(int i = num; i>0; i/=10){
            int digit = i % 10;
            reverse = (reverse * 10) + digit;

        }

        System.out.println("The integer number " + copyNum + " is reversed as: " + reverse);
    }
}
