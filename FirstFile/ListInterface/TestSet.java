package FirstFile.ListInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {

        Set<String> names = new HashSet<>();
       
        System.out.println(names.add("Rushi"));
        System.out.println(names.add("Dilip"));
        System.out.println(names.add("Gurav"));

        for (String names2 : names) {
            System.out.print(names2 + " ");
        }
        System.out.println();

        System.out.println(names.contains("Rushi"));
        System.out.println(names.remove("Dilip"));
        // can't reemove the unpresented data from the set then it will return the false 
        System.out.println(names.remove("Dilip"));


        // the linkedHashSet Only stores the unique values it doesnt store the repeaed values.

        Set<String> linkName = new LinkedHashSet<>();
        linkName.add("Rushi");
        linkName.add("Gurav");
        linkName.add("Gauri");
        linkName.add("Gurav");

        System.out.println(linkName);

        
        
    }
}
