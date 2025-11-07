package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise12_13 {
    public static void main(String[] args) {
        Path file = Paths.get(args[0]);
        int characterCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            List<String> string = Files.readAllLines(file);

            for (String string2 : string) {
                string2.split("\\s+");
                for(int i = 0; i < string2.length(); i++) {
                    char c = string2.charAt(i);
                    if(c == ' ') {
                        wordCount++;
                    } else {
                        characterCount++;
                    }
                }
                lineCount = string.size();
                wordCount++;
            }
            System.out.println("File " + args[0] + " has");
            System.out.println(characterCount + " characters");
            System.out.println(wordCount + " words");
            System.out.println(lineCount + " lines");
        } catch (IOException e) {
            System.out.println("Error while reading file");
            e.printStackTrace();
        }
    }
}
