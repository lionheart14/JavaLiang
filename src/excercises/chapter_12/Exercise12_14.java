package excercises.chapter_12;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise12_14 {
    public static void main(String[] args) {
        File myFile = new File("excercises/chapter_12/doc/12_14.txt");
        System.out.println(readInFile("Leon Jonas Willi Penis", myFile));
    }

    public static int readInFile(String line, File file) {
        Path filePath = file.toPath();

        try {
            List<String> allLines = Files.readAllLines(filePath);

            for (int i = 0; i < allLines.size(); i++) {
                if(allLines.get(i).equals(line)) {
                    System.out.println("Position is " + i);
                    return 1;
                }
            }
        } catch (Exception e) {
           System.out.println("Error reading file");
           e.printStackTrace();
        }

        return 0;
    }
}
