import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        
        System.out.println("Printing the Reverse String Usig the Strig reverse And slit method:");

        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the String below :");
        String str = obj.next();

        System.out.printf("The String %s is Reversed as -:- %s",str,revStr(str));

    }

    public static String revStr(String str){

        String revStr = "";
        char ch;

        for(int i = 0 ; i < str.length() ;i++){
            ch = str.charAt(i);
            revStr = ch+revStr;

        }


        return revStr;
    }

   
}
