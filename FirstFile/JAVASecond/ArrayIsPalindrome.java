package JAVASecond;

public class ArrayIsPalindrome {
    public static void main(String[] args) {
        System.out.println("Palindrome array checker!..");

        int[] arr = ArrayUtility.arrayReturn();

        boolean isPali = isPalindrome(arr);

        if(isPali){
            System.out.println("Your array is palindrome!..");
        }else{
            System.out.println("Your array is not palindrome!..");

        }
    }


    public static boolean isPalindrome(int[] arr){

        for(int i = 0 ; i< (arr.length /2); i++){
            if(arr[i] != arr[(arr.length - 1) - i]){
                return false;
            }
        }

        return true;
    }
}
