package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Exercise12_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter directory path to replace words: ");
        String mainDir = input.nextLine();

        Path mainPath = Paths.get(mainDir);
        Pattern pattern = Pattern.compile("Exercise(\\d+)_(\\d+)");

        try {
            Stream<Path> allFiles = Files.walk(mainPath);
            
            allFiles
                .filter(path -> !path.toFile().isDirectory())
                .forEach(path -> {
                    Matcher matcher = pattern.matcher(path.toString());
                    
                    while(matcher.matches()) {
                        try {
                            String g1 = matcher.group(1);
                            String g2 = matcher.group(2);
                            
                            if(g1.length() == 1) {
                                g1 = "0" + g1;
                            }

                            String newFileName = "Exercise" + g1 + "_" + g2;
                            Path newPath = path.resolveSibling(newFileName);
                            Files.move(mainPath, newPath);
                        } catch (IOException e) {
                            System.out.println("Error renaming File");
                        }
                    }
                });
        } catch (Exception e) {
            System.out.println("Error traversing Files");
        }
    }
}
