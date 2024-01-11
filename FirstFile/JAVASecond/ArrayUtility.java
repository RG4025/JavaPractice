package JAVASecond;

import java.util.Scanner;

public class ArrayUtility {
    
    public static int[] arrayReturn(){
          Scanner obj  = new Scanner(System.in);
        System.out.print("Enter the length for the array :");

        int num  = obj.nextInt();
        int[] arr = new int[num];

        System.out.println("Enter the Elements for the array :");

        for(int i = 0 ; i<arr.length; i++ ){

            
            arr[i] = obj.nextInt();

        }

        return arr;
    }
}
