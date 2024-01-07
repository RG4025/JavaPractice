import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.println("Calculating the factorial of the given number!..");

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the Number for factorial : ");

        int factorial = obj.nextInt();

        System.out.println("Factorial of " + factorial + " is :" + factCalculate(factorial));

    }

    public static long factCalculate(int num) {

        int i = 1;
        long fact = 1l;

        if (num < 2) {
            return 1;
        }

        while (i <= num) {
            fact *= i;
            i++;
        }

        return fact;

    }
}
