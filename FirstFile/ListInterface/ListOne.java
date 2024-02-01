
package FirstFile.ListInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * ListOne
 */
public class ListOne {

    public static void main(String[] args) {
        System.out.println("Working with the List interface!");

        // old version of the java 

        List strList = new ArrayList();
        strList.add("Rushi");
        strList.add("Gurav");
        strList.add(1,"Dilip");

        for (int i = 0; i < strList.size(); i++) {
            
            System.out.print(strList.get(i) + " ");
        }

        System.out.println(strList.get(0));

        
    }
}
