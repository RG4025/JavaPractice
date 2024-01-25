
 package FirstFile.IMPQue;

import java.util.Scanner;
import java.util.StringTokenizer;

class StringRev {

    public static void main(String[] args) {
        System.out.println("Printing the String ad Reverse!!");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str," ");

        String newStr = " ";
        while (st.hasMoreTokens()) {
            newStr = st.nextToken() + " " + newStr;
        }

        System.out.println("The String is Reversed as : \n" + newStr);
    }
    
}