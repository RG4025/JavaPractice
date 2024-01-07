import java.util.Scanner;

public class AddParams {
      public static void main(String[] args) {
        
        greet();
    }


    public static void greet(){
        System.out.println("WELCOME!. Adding two numbers using a Parameter Method!..");
        
        System.out.println("The Addition is :" + sumNumbers(number(), number()));
    }

    public static int number(){
        Scanner obj = new Scanner(System.in);

        System.out.print("Please Enter The Number :");

        int num = obj.nextInt();
        return num;
    }

    public static int sumNumbers(int num1, int num2){
        int sum =  num1 + num2;
        return sum;
    }
}
