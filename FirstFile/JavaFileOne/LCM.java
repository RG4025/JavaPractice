import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        System.out.println("Finding the least common multiple!..");

        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the first Number for LCM :");
        int num1 = obj.nextInt();

        System.out.print("Enter the second Number for LCM :");
        int num2 = obj.nextInt();

       int commonDigit =   lcmNumber(num1, num2);
         System.out.println("LCM is :" + commonDigit);


    }

    // first Approach

    // public static int lcmNumber(int num1, int num2){
    //     int lastDogit = num1 * num2;

    //     int i =1, lcmDigit = 0;

    //     while(i < lastDogit){

    //         if((i % num1 == 0) && (i % num2 == 0)){
    //             lcmDigit = i;
    //              System.out.println("The Least Common Multiple Number for " + num1 + " And " + num2 + " is : " + lcmDigit);
    //         }
    //         i++;
    //     }
    //      return lcmDigit;
    // }

    // second approach

     public static int lcmNumber(int num1, int num2){
        
        int i = 1;
        while(true){
            int factor = num1 * i;

            if(factor % num2 == 0){
                return factor;
            }
            i++;
        }
    }
}
