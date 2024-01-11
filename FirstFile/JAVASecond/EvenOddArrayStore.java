import java.util.Scanner;

public class EvenOddArrayStore {
    
    public static void main(String[] args) {
        
        System.out.println("Sorting the Even Odd Numbers from the given array!..");

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");

        int num = obj.nextInt();
        int[] arr = new  int[num];

        System.out.println("Enter the elements for the array :");

        for(int i =0; i<arr.length; i++){
            arr[i] = obj.nextInt();
    
        }
    
        int evenCount = 0, oddCount = 0;


        for(int i = 0 ; i < arr.length;i++){
            if(arr[i] % 2 == 0) evenCount++;
            else oddCount++;
        }

        int[] even = new  int[evenCount];
        int[] odd = new  int[oddCount];

        int j = 0, k=0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 ==0 ) even[j++] = arr[i];
            else odd[k++] = arr[i];
        }

    //  printing The Even
        System.out.print( "Even Numbers : [");
        for(int i = 0; i<even.length;i++){
            
            System.out.print(even[i] + " "); 
        }
        System.out.print("]");

        System.out.println();

        // printing the odd
         System.out.print("Odd Numbers : [");
        for(int i = 0; i<odd.length;i++){
            
            System.out.print(odd[i] + " "); 
        }
        System.out.print("]");

    }
}
