package excercises.chapter_12;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise12_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name for new directory");
        String directoryName = input.nextLine();
        input.close();

        Path fullPath = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\" + directoryName);

        boolean dirCreated = fullPath.toFile().mkdirs(); 

        if(dirCreated) {
            System.out.println("Directory " + directoryName + " was created");
        } else {
            System.out.println("Directory " + directoryName + " was not created");
        }
    } 
}
