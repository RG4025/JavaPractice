
 package FirstFile.IMPQue;

import java.util.Scanner;

class SumOfDiagonal2DArray {

    public static void main(String[] args) {
        System.out.println("Calculating the Sum of diagonal elements!!.");

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter The Number of Rows you want in the Array :");
        int num1 = obj.nextInt();

        System.out.print("Enter The Number of Columns you want in the Array :");
        int num2 = obj.nextInt();

        Long sum = sumOfDIagonal(createArray(num1, num2));

        System.out.print( "The sum of diagonal elemens are : " + sum);
        System.out.println();

    }


    public static Long sumOfDIagonal(int[][] numArr){
        Long left = sumOfLeftDiagonal(numArr) ;
        Long right = sumOfRightDiagonal(numArr);
        Long sum = left + right;

        if( numArr.length % 2 != 0){
            int ind = numArr.length / 2;
            sum -= numArr[ind][ind];

        }
        return sum;
    }

    public static Long sumOfLeftDiagonal(int arr[][]){
         Long sum = 0l;

         int i = 0;
         while(i < arr.length){

           sum += arr[i][i];

            i++;
         }

         return sum;
    }


    public static Long sumOfRightDiagonal(int arr[][]){
         Long sum = 0l;

         int i= 0;
         while(i < arr.length){


            int col = arr.length - 1- i;
            sum += arr[i][col];

            i++;
         }

         return sum;
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

}