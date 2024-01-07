import java.util.Scanner;

public class OddOrEvenBitwise {
    public static void main(String[] args) {
        System.out.println("Checking the number is even or odd!..");

        System.out.print("Enter the number :");

        Scanner obj = new Scanner(System.in);

        int num = obj.nextInt();

        
        if((num & 1) == 1){
            
            System.out.println("The number " + num + " is Odd..");
        }else{
            System.out.println("The number " + num + " is Even..");
            
        }

    }
}
