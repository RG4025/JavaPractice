import java.util.Scanner;

public class EvenOrOddUsingBitwise {
    
    public static void main(String[] args) {
        
        System.out.println("Finding the number is Even Ir Odd using the bitwise operator!..");

        Scanner obj=  new Scanner(System.in);
        System.out.print("Enter The Number :");

        int num = obj.nextInt();

        if((num & 1) == 1){
            System.out.println("The given numberr" + num + " is Odd!.");
        }else{
            System.out.println("The given number " + num + " is Even");
        }


        int num2 = num & 1;
        System.out.println(num2);
    }
}
