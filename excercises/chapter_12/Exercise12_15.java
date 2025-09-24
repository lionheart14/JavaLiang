package excercises.chapter_12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise12_15 {
    public static void main(String[] args) {
        
    }

    public static void writeInFile(String name, File file) {
        try {
            Path filePath = file.toPath();
            List<String> allLines = Files.readAllLines(filePath); 

            int insertionIndex = 0;
            boolean inserted= false;
            for(int i = 0; i < allLines.size(); i++) {
                if(name.compareToIgnoreCase(allLines.get(i)) < 0) {
                    insertionIndex = i;
                    allLines.add(insertionIndex, name);
                    inserted = true;
                    break;
                }

                if(!inserted) {
                    allLines.add(name);
                }
            }

            Files.write(filePath, allLines);
        } catch (IOException e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}
