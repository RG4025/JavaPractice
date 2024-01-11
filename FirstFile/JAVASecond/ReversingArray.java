package JAVASecond;

public class ReversingArray {
    public static void main(String[] args) {
        
        System.out.println("Reversing the given array!.");

        int[] arr = ArrayUtility.arrayReturn();

          revrsingMet(arr);



    }

    public static void revrsingMet(int[] array){

        
        for(int i = 0; i< (array.length / 2); i++){
            int temp = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = temp;
        }

        System.out.println("Reversed Array As : ");
        System.out.print("[");
        for(int i = 0; i<array.length; i++){
            
            System.out.print(array[i] + " ");
        }
        System.out.print("]");

        
    }

 
}
