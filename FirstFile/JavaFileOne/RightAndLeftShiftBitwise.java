import java.util.Scanner;

public class RightAndLeftShiftBitwise {
    public static void main(String[] args) {
        System.out.println("Going thirough the bitwise Right And Left Shift !..");

        Scanner obj  = new Scanner(System.in);

        System.out.print("Enter The Number Here : ");
        int num = obj.nextInt();

        int result = num << 1;
        System.out.println("The Result is : "+ result);
    }
}
