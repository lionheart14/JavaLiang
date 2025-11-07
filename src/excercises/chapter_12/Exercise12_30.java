package excercises.chapter_12;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise12_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a filename: ");
        String fileName = input.nextLine();

        Path filePath = Paths.get(fileName);
        String[][] charMatrix = new String[26][2];
        
        char c = 'A';
        for(int i = 0; i < 26; i++) {
            charMatrix[i][0] = Character.toString(c);
            charMatrix[i][1] = "0";
            c++;
        }



        try {
            String fileContent = Files.readString(filePath);
            for(int i = 0; i < fileContent.length(); i++) {
                char currentChar = fileContent.charAt(i);
                if(Character.isAlphabetic(currentChar)) {
                    for(int j = 0; j < charMatrix.length; j++) {
                        if(Character.toUpperCase(currentChar) == charMatrix[j][0].toCharArray()[0]) {
                            charMatrix[j][1] = String.valueOf(Integer.valueOf(charMatrix[j][1]) + 1);
                        }
                        continue;
                    }
                }
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        for(int i = 0; i < charMatrix.length; i++) {
            System.out.println("Number of " + charMatrix[i][0] + "s: " + charMatrix[i][1]);
        }
    }
}
