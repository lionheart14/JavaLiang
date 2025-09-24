package excercises.chapter_12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise12_18 {
    public static void main(String[] args) {
        Path srcRootDirectory = Paths.get(args[0]);
        
        try {
            File file = srcRootDirectory.toFile();

            if(!file.isDirectory()) {
                System.out.println("Has to be directory");
                return;
            }

            File[] chapters = file.listFiles();
            for (File doc : chapters) {
                int chapterNumber = chapters.toString().charAt(chapters.toString().length() - 1);
                if(!doc.isDirectory() && doc.getName().endsWith(".java")) {
                    List<String> allLinesDoc = Files.readAllLines(doc.toPath()); 
                    allLinesDoc.add(0, "package chapter" + chapterNumber);
                }
            }
        } catch (Exception e) {
           System.out.println("Error reading file");
        }
    }
}
