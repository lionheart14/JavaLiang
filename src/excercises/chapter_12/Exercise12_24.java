package excercises.chapter_12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercise12_24 {
    public static void main(String[] args) {
        final int LINE_COUNT = 1000;
        final String[] RANKS = {"assistant", "associate", "full"}; 
        final int[] SALARIES_MAX = {30000, 50000, 55000};
        final int[] SALARIES_MIN = {50000, 60000, 75000};

        
        Path filePath = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\Salary.txt");
        
        try {
            List<String> allLines = Files.readAllLines(filePath);

            for(int i = 1; i <= LINE_COUNT; i++) {
                int codeNumber = (int) (Math.random() * RANKS.length);
                String firstName = "FirstName" + i;
                String lastName = "LastName" + i;
                String rank = RANKS[codeNumber];
                int salary = (int) (Math.random() * SALARIES_MAX[codeNumber]) + SALARIES_MIN[codeNumber];

                String input = String.format("%s %s %s %d", firstName, lastName, rank, salary);

                allLines.add(i - 1, input);
            }

            Files.write(filePath, allLines);
        } catch (Exception e) {
            System.out.println("Error reading file");
            e.printStackTrace();
        }
    }
}
