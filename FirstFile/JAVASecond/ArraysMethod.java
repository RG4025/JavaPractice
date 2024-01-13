package FirstFile.JAVASecond;

import java.util.Arrays;

public class ArraysMethod {
    public static void main(String[] args) {
        System.out.println("All Pre Deined Methods in the java!!.");



        // Arrays.fill()
        // This ethods fill all index with the same value that given to it .

        int arr1[] = new int[5];
        Arrays.fill(arr1, 123);

        for (int i : arr1) {
            // System.out.print( i+ " ");
        }


        // in case of the String it works the same for all data type

        String name[] = new String[3];

        Arrays.fill(name, "Rushi");

        for (String i : name) {
            // System.out.print(i + " ");
        }
        
        // Sorting the array using the sort method ..
        // Arrays.toString() converts the  array into the string ..

        int num[] = {12,23,34,45,5,5667,67,6745,342,123,45,2,4,56,5,64,2};

        Arrays.sort(num);
        // System.out.print(Arrays.toString(num));

        for (int i  : num) {
            System.out.print(i + " ");
        }

        // using Method toUpperCase() for every String in the array It will converts the every array string into uppercase

        for (String i : name) {
            // System.out.print(i.toUpperCase() + " ");
        }
    }
}
