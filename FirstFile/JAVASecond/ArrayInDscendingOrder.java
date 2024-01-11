 package JAVASecond;

import java.util.Scanner;

class ArrayInDscendingOrder {

    public static void main(String[] args) {
        
        System.out.println("Printing the array in dscending ord!..");

        int[] arr = ArrayUtility.arrayReturn();


        int temp = 0;
        for(int i = 0; i<arr.length ; i++){

            for(int j = i+1; j<arr.length;j++){
                if(arr[i] < arr[j]){
                    temp= arr[i];
                    arr[i] = arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("Printing the array in dscending order:");

        System.out.print("[");

        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("]");
    }
}