
package FirstFile.IMPQue;

import java.util.Scanner;

/**
 * Recurrsion
 */
public class Recurrsion {

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number for factorial :");

        int num = obj.nextInt();

        System.out.print("Factorial of " + num + " is :" + factorial(num));

    }

    public static int factorial(int num){

        System.out.println("Current number is :" + num);

        if(num == 1){
            return 1;
        }

        return num * factorial( num - 1);

    }
}