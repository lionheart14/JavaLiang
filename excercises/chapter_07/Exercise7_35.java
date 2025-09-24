package excercises.chapter_07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise7_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"piano"};
        // "write", "that", "dog", "cat", 
        String word = words[(int) (Math.random() * words.length)];
        boolean guessed = false;
        boolean characterGuessed = false;
        int guessedCharsIndex = 0;
        int missCount = 0;
        int correctCharCount = 0;
        char[] guessedChars = new char[30];

        while(!guessed) {
            if(correctCharCount == word.length()) {
                guessed = true;
                break;
            }
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
                    missCount++;
                }
            }

            if(correctCharCount == word.length()) {
                guessed = true;
                break;
            }
            
            System.out.print(" > ");

            try {
                char c = input.nextLine().charAt(0);
                for(int j = 0; j < guessedChars.length; j++) {
                    if(c == guessedChars[j]) {
                        characterGuessed = true;
                        System.out.println(c + " is already in the word");
                        break;
                    }
                }
                if(!characterGuessed) {
                    guessedChars[guessedCharsIndex] = c;
                    guessedCharsIndex++;
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter a character");
            }
        }
        System.out.println("The word is " + word + ". " + "You missed " + missCount + " times");
    }
}
