package FirstFile.IMPQue;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter {

    

    public static void main(String[] args) {

        System.out.println("Creating the file using fileWriter");

        String fileNew = "FirstFile.txt";

        try(FileWriter writer = new FileWriter(fileNew)){
            writer.write("This is the first file in the file Writer!");

            writer.flush();
            System.out.println("File created successfully ");
        }catch (IOException exception){

            System.out.printf("Some error occurred %s ", exception.getMessage());
        }
    }
}
