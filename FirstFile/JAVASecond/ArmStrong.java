

import java.util.Scanner;

public class ArmStrong{

    public static void main(String[] args) {
        
        System.out.println("Finding the number is armstrong or not!.");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number:");

        int num = obj.nextInt();

        boolean checkNum = isArmstrong(num);

        if(checkNum){
            System.out.println("The Number Is ArmStrong");
        }else{
            
            System.out.println("The Number Is Not ArmStrong");
        }

        

        

        
    }

    public static boolean isArmstrong(int num){

        int totalDigit = totalNum(num);
        int copyNum = num;
        int finalNum = 0;

        while(num > 0){

            int lastDigit = num % 10;

            num/= 10;
            finalNum += power(lastDigit, totalDigit);
        }
        System.out.println(finalNum);
        return finalNum == copyNum ;

    }

    public static int totalNum(int num){

        int digit = 0;
        while(num > 0){
            digit++;
            num/=10;
        }

        return digit;
        
    }

    public static int power(int num1, int num2){
        int pow = 1;
        int i = 0;

        while(i < num2){

            pow *= num1;
            i++;
        };

        return pow;

    }
}