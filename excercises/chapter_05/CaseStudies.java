package excercises.chapter_05;

import java.util.Scanner;

public class CaseStudies {
    public static void main(String[] args) {
        CaseStudies cd = new CaseStudies();
        cd.doWhile();
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

    public void doWhile() {
        Scanner input = new Scanner(System.in);
        int number, max;
        System.out.print("Enter: ");
        number = input.nextInt(); 
        max = number;
        do {
            System.out.print("Enter: ");
            number = input.nextInt();
            if (number > max)
                max = number;
        } while (number != 0);
        System.out.println("max is " + max);
        System.out.println("number " + number); 
    }

    public void rewriteWhile() {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Enter an integer (the input ends if it is 0)");
            number = input.nextInt();
            sum += number;
        } while(number != 0);
    }
}