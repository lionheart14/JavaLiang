package excercises.chapter_12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise12_20 {
    public static void main(String[] args) {
        Path srcRootDirectory = Paths.get(args[0]);

        try {
            File file = srcRootDirectory.toFile();
            File[] chapters = file.listFiles();

            for(int i = 0; i < chapters.length; i++) {
                File[] documents = chapters[i].listFiles();
                for(int j = 0; j < documents.length; j++) {
                    File doc = documents[j];
                    if(doc.toString().endsWith(".java")) {
                        List<String> allLinesDoc = Files.readAllLines(doc.toPath());
                        allLinesDoc.remove(0);
                        Files.write(doc.toPath(), allLinesDoc);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error while reading file");
        }
    }


}
