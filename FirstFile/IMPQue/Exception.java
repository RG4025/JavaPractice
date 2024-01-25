package FirstFile.IMPQue;
import java.util.Scanner;

public class Exception {

    public static void main(String  [] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Handling the Exception");

        System.out.println("Enter the number :");
        int num1 = obj.nextInt();

        System.out.println("Enter the number for divide :");
        int num2 = obj.nextInt();

//
//        try{
//            int dev = num1 / num2;
//            System.out.println("Division is :" + dev);
//        }catch (ArithmeticException exception){
//            System.out.println("Wrong parameter cant divide by 0");
//            System.out.printf("%s , Enter the valid number " , exception.getMessage());
//        } catch (Throwable th){
//            System.out.println("Can't divide the number with 0");
//            throw  th;
//        } finally {
//            System.out.println("I am in the final");
//        }


       divide(num1,num2);

    }

//    second approach

    public static  void divide(int num1, int num2){

        try {
            int div = num1 / num2;
            System.out.printf("Division is %d ", div);
        }catch (ArithmeticException exception){
                if (exception.getMessage().
                        equals("/ by zero")){
                    System.out.println("Number can't divide by the Zero!");
                }else {
                    throw exception;
                }
        }


    }


}
