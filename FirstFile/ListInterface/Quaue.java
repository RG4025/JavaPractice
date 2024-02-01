
package FirstFile.ListInterface;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Quaue
 */
public class Quaue {

    public static void main(String[] args) {
        System.out.println("Working with the Queue!");

        Queue<String> que = new LinkedList<>();
        
        que.add("Rushi");
        que.offer("Gurav");
        que.add("Dilip");   


        for (String qu : que) {
            System.out.print(qu + " ");
        }
    }
}   