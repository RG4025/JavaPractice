import java.util.Scanner;

public class AscendingOrderArray {
    public static void main(String[] args) {
        
        System.out.println("Printing the given array in the Ascending order!..");


        Scanner obj= new Scanner(System.in);
        System.out.print("Length of the array :");

        int num = obj.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter the Element of the array :");

        for(int i = 0; i<arr.length; i++){
            arr[i] = obj.nextInt();

        }

        System.out.println("Printing the given array in the ascending array -:-");
        int temp = 0;

        for(int i = 0; i< arr.length; i++){
            
            for(int j = i+1; j< arr.length; j++){

                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print( arr[i] + " ");
        }

    }
}
