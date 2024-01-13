package FirstFile.IMPQue;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        
        System.out.println("Creating the 2-D array!!..");
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter The Number of Rows you want in the Array :");
        int num1 = obj.nextInt();

        System.out.print("Enter The Number of Columns you want in the Array :");
        int num2 = obj.nextInt();

        displayArr(createArray(num1, num2));
        
    }
    
    public static int[][] createArray(int rows, int col){
        int arr[][] = new int[rows][col];
        Scanner obj= new Scanner(System.in);
        
        for(int i =0; i<rows; i++){
            for(int j =0; j<col; j++){
                System.out.printf("Enter Element for a[%d][%d] : " , i , j);
                arr[i][j] = obj.nextInt();

            }
        }
        return arr;
    }


    public static void displayArr(int arr[][]){

        System.out.println("The created array as Follow : ");
        
        System.out.print("[");
        
        for (int[] i : arr) {
            System.out.print("{");
            for (int  j : i) {
                
                System.out.print(j + " ");
            }
            
            System.out.print("},");
        }
        
        System.out.print("]");
    }

}
