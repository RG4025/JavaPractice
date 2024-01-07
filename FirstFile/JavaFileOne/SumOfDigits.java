import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Programm for the sum of the digits!..");

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = obj.nextInt();
        System.out.println("Sum of the digits " + num + " is :" + sumOfDigit(num));
    }

    public static int sumOfDigit(int num){
        int sum = 0;

        while(num > 0){
            sum +=(num % 10);
            num/=10;
        }
        return sum;
    }
}
