package excercises.chapter_05;

import java.util.Scanner;

public class CaseStudies {
    public static void main(String[] args) {
        CaseStudies cd = new CaseStudies();
        cd.guessingNumbers();
    }

    public void guessingNumbers() {
        int number = (int) (Math.random() * 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        System.out.print("Enter your guess: ");
        int guess = input.nextInt();

        while(guess != number) {
            if(guess < number) {
                System.out.println("Your guess is too low");
            }
            if(guess > number) {
                System.out.println("Your guess is too high");
            }
            System.out.print("Enter your guess: ");
            guess = input.nextInt();
        }

        System.out.printf("Yes, the number is %d", number);
    }
}
