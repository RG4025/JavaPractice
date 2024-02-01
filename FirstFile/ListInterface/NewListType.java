package FirstFile.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class NewListType {
    public static void main(String[] args) {
        
        System.out.println("Working with the Declard type of the list");    

        List <Integer> strOne = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {

            strOne.add((int)Math.floor(Math.random() * 100));
            
        }

        for (int i = 0; i < strOne.size(); i++) {

            System.out.print(strOne.get(i) + " ");
            
        }

        // using foreach loop

        for (Integer strOne2 : strOne) {
            
            System.out.println(strOne2 + " ");
        }


    }
}
