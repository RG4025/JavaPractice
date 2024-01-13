package FirstFile.IMPQue;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        System.out.println("Finding the Element in the guven array The Element will be stored using random method!..");

        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the length for the array :");

        int num = obj.nextInt();
        int arr[] = new int[num];

        for(int i =0; i<arr.length;i++){

            arr[i] = (int) ( Math.random() * 100);
            
        }

        System.out.print( "Enter 2 Digit Element you wont to find :");
        int find = obj.nextInt();
        
        int k = 0,j=0 ;

        for (int i : arr) {
            if(i == find){
                k++;
                System.out.println(find + " Found in the array " + k + " Times");   
            }
            
            if(i != find){
                System.out.println(find + " Not Found in the array " + j + " Position");   
            }
            j++;
        }


        
        System.out.println();
        System.out.println("The Created Array is as Follows :");
        
        System.out.print("[");
        for (int i : arr) {
            
            System.out.print(i + " ");
            
        }
        System.out.print("]");


    }
}
