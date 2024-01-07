import java.util.Scanner;

/**
 * ReverseNumber
 */
public class ReverseNumber {

     public static void main(String[] args) {
        System.out.println("Programm to reverse a number!.");

        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = obj.nextInt();

        int reversed = revNumber(num);

        System.out.println(num + " Reversed as : " + reversed);
     }

     public static int revNumber(int num){

        int rev = 0;

        while (num > 0) {
            int lastDig = num % 10;
            rev = (rev * 10) + lastDig;
            num/= 10;
        }

        return rev;
     }
}

