package JAVASecond;

/**
 * MergeTwoSortedArray
 */
public class MergeTwoSortedArray {

    public static void main(String[] args) {
        System.out.println("Printing the two sorted array!..");
        


        int[] arr1 = ArrayUtility.arrayReturn();
        int[] arr2 = ArrayUtility.arrayReturn();
        
        ascending(arr1);
        ascending(arr2);

        int[] sorted = sorted(arr1,arr2);


        display(sorted);

    }

    public static int[] sorted(int[] arr1, int[] arr2){
        int sizeMerge = arr1.length + arr2.length;
        int[] newArr = new  int[sizeMerge];

        int i =0, j=0, k=0;

        for(i=0,j=0,k=0; i< arr1.length || j < arr2.length ; ){

            if(j == arr2.length || ( i < arr1.length && arr1[i] < arr2[j])){
                newArr[k] = arr1[i];
                i++;
                k++;
            }else{
                newArr[k] = arr2[j];
                j++;
                k++;
            }

        }



        return newArr;


    }

    public static void display(int[] arr){

        System.out.println(" -:- The sorted Array as -:-");

        System.out.print("[");
        
        for(int i=0; i<arr.length; i++){

            System.out.print( arr[i] + " ");
        }

        System.out.print("]");
    }

    public static void ascending(int[] arr){

        int com = 0;

        for(int i = 0; i<arr.length; i++){

            for(int j = i+1; j<arr.length;j++){

                if(arr[i] > arr[j]){
                    com = arr[i];
                    arr[i] = arr[j];
                    arr[j] = com;
                }
            }

        }

    }
  
}