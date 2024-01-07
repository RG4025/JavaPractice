public class StarPatternOne {
    public static void main(String[] args) {
        
        System.out.println("Printing the Pattern!.");

        int row = 0;
        while(row < 10){
            // System.out.println("*");


            int i = 0;
            while(i < row){
                System.out.print(" *");
                i++;
            }
            System.out.println();

            row++;
        }
    }
}
