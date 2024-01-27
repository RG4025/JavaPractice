package FirstFile;  
import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        
        System.out.println("Working of thr list Interface!!");

        List<String> first = new ArrayList<>();
        first.add("Rushikesh");
        first.add("Gurav");
        first.add(1,"Dilip");


        System.out.println(first.get(0));

        for (String i : first) {
            
            System.out.print(i + " ");
        }


    }
}
