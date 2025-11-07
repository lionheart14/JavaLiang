package excercises.chapter_12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Exercise12_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Path filePath = Paths.get("C:\\DevVSC\\JavaLiang\\excercises\\chapter_12\\doc\\hangman.txt");
        List<String> words;

        try {
            words = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Error while reading File");
            return;
        }

        String word = words.get((int) (Math.random() * words.size()));
        boolean guessed = false;
        boolean sameCharacterGuessed = false;
        int guessedCharsIndex = 0;
        int missCount = 0;
        int correctCharCount = 0;
        char[] guessedChars = new char[30];

        while(!guessed) {
            correctCharCount = 0;

            System.out.print("(Guess) Enter a leter in word " );
            for(int i = 0; i < word.length(); i++) {
                boolean charFound = false;
                for(int j = 0; j < guessedChars.length; j++) {
                    if(word.charAt(i) == guessedChars[j]) {
                        System.out.print(word.charAt(i));
                        charFound = true;
                        correctCharCount++;
                        break;
                    }
                }
                if(!charFound) {
                    System.out.print("*");
                }
            }

            if(correctCharCount == word.length()) {
                guessed = true;
                break;
            }

            System.out.print(" > ");

            try {
                char c = input.nextLine().charAt(0);
                String cs = Character.toString(c);
                for(int j = 0; j < guessedChars.length; j++) {
                    if(c == guessedChars[j]) {
                        sameCharacterGuessed = true;
                        System.out.println(c + " is already in the word");
                        break;
                    }
                }
                if(!sameCharacterGuessed) {
                    guessedChars[guessedCharsIndex] = c;
                    guessedCharsIndex++;
                }

                if(!word.contains(cs)) {
                    missCount++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a character");
            }
        }
        System.out.println("\nThe word is " + word + ". " + "You missed " + missCount + " times");
    }
}
