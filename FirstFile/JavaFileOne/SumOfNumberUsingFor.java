import java.util.Scanner;

public class SumOfNumberUsingFor {
    public static void main(String[] args) {
        
        System.out.println("Printing the Sum of the given number using for loop!..");


        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the Number for the Sum : ");
        int num = obj.nextInt();
        int copyNum = num;
        int sum = 0;
        
        for ( int i = num; i > 0; i/= 10) {
            int digit = i % 10;
            sum+=digit;
        }

        System.out.println("The Sum of " + copyNum + " is:" + sum);



    }
}
