package FirstFile.IMPQue;

import java.util.Scanner;

public class NumberGusser {
    public static void main(String[] args) {
        System.out.println("Welcome to the number gusser Game!!.");
        Scanner obj = new Scanner(System.in);

        boolean runAgain = true;

        int lastChance = 1;
        do{
            int random = ((int) (Math.random() * 10));
            // System.out.print(random);
            int chance = 1;
            int user;
            do{
                System.out.print("Enter your number between 1 TO 10:");
                user = obj.nextInt();
                chance++;
            }while( chance < 4  && user != random );

            if(user == random ){
                lastChance = 4;
                System.out.println("Whooh!! Champ You guassed it right!!, Correct number is :" + random);
            }else{
                System.out.println("Try one more time!!");
            }

            // System.out.print("You want to run again the game!");
            lastChance++;

            if(lastChance >= 3){
                  System.out.println("Hard Luck!!");
                  System.out.print("The Correct number was :" + random);
                  break;
            }
        }while(runAgain);

    }
}
