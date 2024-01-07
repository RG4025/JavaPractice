import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Checking wether the number is prime or not!..");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Number :");

        int num = obj.nextInt();
        boolean checkPrime = primeOrNot(num);

        if(checkPrime){
            System.out.println("The Number " + num + " is Prime!.");
        }else{
            
            System.out.println("The Number " + num + " is Not Prime!.");
        }
    }

    public static boolean primeOrNot(int num){

        int i = 2;

        while (i < num) {

            if(num % i == 0){
                return false;

            }
            i++;
        }
        return true;
    }
}
