package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Exercise12_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the directory you want to modify: ");
        String goalDirectory = input.nextLine();
        input.close();

        Path fullPath = Paths.get("src/exercises", goalDirectory);
        Pattern pattern = Pattern.compile("Exercise(\\d+)_(\\d+).java");

        try (Stream<Path> stream = Files.walk(fullPath)) {
            stream
                .filter(path -> Files.isRegularFile(path))
                .forEach(file -> {


                    String fileName = file.getFileName().toString();
                    Matcher matcher = pattern.matcher(fileName);

                    while(matcher.matches()) {
                        try {
                            String i = matcher.group(1);
                            String j = matcher.group(2);
    
                            if(i.length() == 1) {
                                i = "0" + i;
                            }
    
                            if(j.length() == 1) {
                                j = "0" + j;
                            }
    
                            String newFileName = "Exercise" + i + "_" + j + ".java";
                            Path newPath = file.resolveSibling(newFileName);
                            Files.move(file, newPath);    
                        } catch (IOException e) {
                           System.out.println("Error renaming file");
                        }
                    }
                }
            );
        } catch (IOException e) {
            System.out.println("Error reading file");
        }
    }
}
