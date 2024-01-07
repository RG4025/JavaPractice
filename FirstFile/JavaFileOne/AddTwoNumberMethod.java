import java.util.Scanner;

public class AddTwoNumberMethod{

    public static void main(String[] args) {
        
        greet();
    }


    public static void greet(){
        System.out.println("WELCOME!. Adding two numbers using a method!..");
       
        int first = number();
        int second = number();

        System.out.println("The Addition of the " + first + " And " + second + " is :" + (first + second));
    }

    public static int number(){
        Scanner obj = new Scanner(System.in);

        System.out.print("Please Enter The Number :");

        int num = obj.nextInt();
        return num;
    }
}