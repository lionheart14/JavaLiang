package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import excercises.chapter_12.Exercise12_15;

public class Exercise12_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the name of the author: ");
        String author = input.nextLine();
        System.out.print("Please enter the title of one of their books: ");
        String title = input.nextLine();

        Path authors = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\Authors.txt");
        Path books = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\Books.txt");
        
        try {
            List<String> allAuthors = Files.readAllLines(authors);
            List<String> allBooks = Files.readAllLines(books);

            writeInFile(author, allAuthors);
        } catch (IOException e) {
            // TODO: handle exception
        }
    }
}
