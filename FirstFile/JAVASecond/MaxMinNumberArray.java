import java.util.Scanner;

public class MaxMinNumberArray {
    

    public static void main(String[] args) {
        
        System.out.println("Printing the Maximum And Minimum number from the given array!.");

        Scanner obj =  new Scanner(System.in);
        System.out.print("Enter the length of the array :");

        int num =  obj.nextInt();

        int[] arr = new int[num];
        
        System.out.println("Enter the element for array :");

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = obj.nextInt();
        }

        System.out.println("Yeah! we got the All Element properly!..");

        int temp = 0;

        for(int i =0; i<arr.length;i++){

            for(int j = i+1; j<arr.length;j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print( " The Minimum Number of the Given array is -:- " + arr[0]);
        System.out.println();
        System.out.print( " The Maximum Number of the Given array is -:- " + arr[(arr.length - 1)]);


    }
}
