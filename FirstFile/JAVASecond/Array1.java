package FirstFile.JAVASecond;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        
        System.out.println("Finding the Number is Exits in the given array!.");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the array Length : ");
        int num = obj.nextInt();
        int[] arr = new int[num];
        
        System.out.println("Elements of the array : ");

        for(int i = 0 ; i< num; i++){

            arr[i] = obj.nextInt();
        }
        

        System.out.print("Enter the number you want to search in the previous array :");

        int findNum = obj.nextInt();

        for(int i = 0; i<arr.length; i++){

            if(arr[i] != findNum){
                System.out.println(findNum + " not found at " + (i+1) + " position");
            }
            
            if(arr[i] == findNum){
                System.out.println(findNum + "  found at " + (i+1) + " position");
            }
        }

    }
}
