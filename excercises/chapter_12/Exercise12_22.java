package excercises.chapter_12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;

public class Exercise12_22 {
    public static void main(String[] args) {
        Path directory = Paths.get(args[0]);
        String oldString = "";
        String newString = "";
        try {
            oldString = args[1];
            newString = args[2];
        } catch (InputMismatchException e) {
            System.out.println("Input has to be a string! ");
        }

        try {
            File dir = directory.toFile();

            if(!dir.isDirectory()) {
                System.out.println("Path has to lead to a directory");
                return;
            }

            File[] files = dir.listFiles();
            for (File file : files) {
                if(!file.isDirectory()) {
                    List<String> allLinesFile = Files.readAllLines(file.toPath());
                    for (String line : allLinesFile) {
                        if(line.contains(oldString)) {
                            line.replace(oldString, newString);
                        }
                    }
                    Files.write(file.toPath(), allLinesFile);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file");
        } 
    }
}
