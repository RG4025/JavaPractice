package JAVASecond;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Printing the 2-D array -:-");

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the Rows for the 2-D array :");
        int rows = obj.nextInt();

        System.out.print("Enter the columns for the 2-D array -:-");
        int col = obj.nextInt();

        int[][] arr = new int[rows][col];


        for (int i = 0; i < rows ; i++) {
            
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter Element for a[%d][%d] :",i,j);
                arr[i][j] = obj.nextInt();

            }
        }

        for (int i = 0; i < rows ; i++) {
            
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        

    }
}
