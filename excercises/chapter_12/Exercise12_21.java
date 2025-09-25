package excercises.chapter_12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Exercise12_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the author: ");
        String author = input.nextLine();

        Path authors = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\Authors.txt");
        Path titles = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\Books.txt");
        
        try {
            int lineNumber = -1;
            List<String> allLinesAuthor = Files.readAllLines(authors);
            for(int i = 0; i < allLinesAuthor.size(); i++) {
                if(allLinesAuthor.get(i).equals(author)) {
                    lineNumber = i;
                    break;
                }
            }

            List<String> allLinesTitles = Files.readAllLines(titles);
            for (String string : allLinesTitles) {
                if(string.startsWith(String.valueOf(lineNumber))) {
                    System.out.println(string.substring(2));
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}
