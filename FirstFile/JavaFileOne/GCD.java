import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.println("Finding the Gretest Common Diviser!..");

        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the first Number : ");
        int first = obj.nextInt();

        System.out.print("Enter the second Number : ");
        int second = obj.nextInt();

        int gcd = greatGcd(first, second);
        System.out.println("GCD is :" + gcd);

    }

    public static int greatGcd(int num1, int num2){

            int i = 2;
            int small = smallDigit(num1, num2);
            int gcd =1;
            while(i <= small){
    
                if((num1 % i == 0) && (num2 % i == 0)){
                    gcd = i;
                }
                i++;
            }
            return gcd;
    }

    public static int smallDigit(int num1 , int num2){

        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
}
