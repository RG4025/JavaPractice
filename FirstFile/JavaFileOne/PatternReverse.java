// package JavaFileOne;

public class PatternReverse {
    public static void main(String[] args) {
        
        System.out.println("Printing the Patters in reverse using the do_while Loop!..");

        int i = 10;
        do{

            int j = 1;
            do{

                System.out.print(" * ");
                j++;
            }while(j <= i);
            
            System.out.println();

            i--;
        }while(i > 0);


    }
}
