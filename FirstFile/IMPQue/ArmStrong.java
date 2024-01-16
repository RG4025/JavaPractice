package FirstFile.IMPQue;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        System.out.println("Finding the number is ArmStrong or not!!.");

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter The number :");

        int num = obj.nextInt();


        boolean isArm = isArmStrong(num);

        if(isArm){
            System.out.println("The given number is ArmStrong!.");
        }else{
            
            System.out.println("The given number is Not ArmStrong!.");
        }
        
    }

    public static  boolean isArmStrong(int num){

        int copyNum = num;
        int totalDigit = totalDigit(num);
        int finalNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            num/=10;
            finalNumber+= power(digit, totalDigit);

        }

        
        return finalNumber == copyNum;
    }

    public static int totalDigit(int num){

        int digit = 0;

        while(num > 0){
            digit++;
            num/=10;
        }
        

         return digit;
     }

     public static int power(int num1, int num2){

        int pow = 1;
        int i =0;

        while(i < num2){
            pow*= num1;
            i++;
        };

        return pow;
     }
}
