package JAVASecond;

import java.util.Scanner;

    public class Maxin2DArray{

     public static void main(String[]  args){

         System.out.println("Finding the max  number from the 2-D array!!");
         
         Scanner obj = new Scanner(System.in);
         
         System.out.print("Enter the Rows for the 2-D array -:- ");
         int rows = obj.nextInt();

         System.out.print("Enter the Columns for the 2-D array -:- ");
         int col = obj.nextInt();

         int[][] arr = new int[rows][col];


        for(int i =0; i<rows; i++){
            for(int j =0; j<col; j++){
                System.out.printf("Element for a[%d][%d] :" , i,j);
                arr[i][j] = obj.nextInt();
            }
        }

        System.out.print("[");

        for (int[] e : arr) {
            for (int element  : e) {

                if(element % 2 == 0){
                    System.out.print(element+ " ");
                }

            }
        }

        System.out.print("]");
        System.out.println();
        
        int sum = 0;
        for (int[] e : arr) {
            
            for (int element  : e) {

                sum+= element;
                
            }
        }
        
        System.out.println("The sum of the All Elements in the 2-D array is : " + sum);
        

 }
    
}
