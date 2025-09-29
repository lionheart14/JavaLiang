package excercises.chapter_12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise12_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the directory you want to modify: ");
        String goalDirectory = input.nextLine();
        input.close();

        Path fullPath = Paths.get("src/exercises", goalDirectory);

        try (Stream<Path> stream = Files.walk(fullPath)) {
            stream
                .filter(path -> Files.isRegularFile(path))
                .forEach(file -> {
                    String fileName = file.getFileName().toString();

                    if(fileName.startsWith("Exercise")) {
                        String numbers = 
                    }


                }
                )
            
        } catch (Exception e) {
            // TODO: handle exception
        }

    }
}
