import java.util.Scanner;

public class MergingTwoArray {
    
    public static void main(String[] args) {
        
        System.out.println("Merging the given two arrays in the single array!..");

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the first array length : ");
        int num1 = obj.nextInt();

        int[] arr1 = new int[num1];

        System.out.println("Enter the element for the first array :");

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = obj.nextInt();
        }

        System.out.print( "Enter the second array length :");

        int num2 = obj.nextInt();
        int[] arr2 =  new int[num2];

        System.out.println( "Enter the second array Element : ");
        
        for(int i = 0; i<arr2.length;i++){
            arr2[i] = obj.nextInt();

        }


        int totalLength = arr1.length + arr2.length;
        int[] merge = new int[totalLength];

        int j = 0;
        for(int i =0; i< arr1.length; i++){

            merge[j++] = arr1[i];
        }

        for(int i =0; i< arr2.length; i++){

            merge[j++] = arr2[i];
        }

        System.out.println("Printing the Merged array :");

        System.out.print( "[");
        
        for(int i = 0; i<totalLength; i++){
            System.out.print(merge[i] + " ");
        }

        System.out.print( "]");

    }
}
