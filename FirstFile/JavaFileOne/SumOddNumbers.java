import java.util.Scanner;

public class SumOddNumbers {
    
     public static void main(String[] args) {
        System.out.println("Printing the Sum Of All Odd Numbers to certain Number!..");

        Scanner obj =  new Scanner(System.in);

        System.out.print("Enter the number for Addition : ");
        int num = obj.nextInt();
        System.out.println("Total sum is : " +  sumOdd(num));
       
    }

    public static int sumOdd(int num){

        int i = 0, sum = 0;

        while(i <= num){

            if(i % 2 != 0){
                sum+=i;
            }
            i++;
        }
        return sum;

    }
}
