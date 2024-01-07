
import java.util.Scanner;

public class MultiTable {
    
    public static void main(String[] args) {
        System.out.println("Creating the multiplicatino table!..");

        Scanner obj =  new Scanner(System.in);

        System.out.print("Enter the number for multiplication table : ");
        int num = obj.nextInt();
        multilicationTable(num);
    }

    public static void multilicationTable(int num){

        int i = 1;

        while(i <= 10){
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
        

    }
}
