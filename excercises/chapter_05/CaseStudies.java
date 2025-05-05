package excercises.chapter_05;

import java.util.Scanner;

public class CaseStudies {
    public static void main(String[] args) {
        CaseStudies cd = new CaseStudies();
        cd.checkingPalindromes();
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

    public void greatestCommonDivisor() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;

        while(k <= n1 && k <= n2) {
            if(n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
            k++;
        }

        System.out.printf("The greatest commmon divisor for %d and %d is %d", n1, n2, gcd);
    }

    public void futureTuition() {
        double tuition = 10000;
        double increment = 1.07;
        int year = 0;

        while(tuition < 20000) {
            tuition *= increment;
            year++;
        }

        System.out.printf("The tuition needs %d years to double", year);
    }

    public void convertingDecimalsToHexadecimals() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int number = input.nextInt();

        String hexadecimal = "";
        while(number != 0) {
            int hexValue = number % 16;
            char hexDigit = (hexValue >= 0 && hexValue <= 9) ? (char) (hexValue + '0'): (char) (hexValue - 10 + 'A');
            hexadecimal = hexDigit + hexadecimal;
            number /= 16;
        }

        System.out.printf("The hexadecimal %s", hexadecimal);
    }

    public void checkingPalindromes() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        if(word.length() % 2 == 0) {
            System.out.printf("%s is not a palindrome", word);
            return;
        }

        for(int i = 0; i < (word.length() - 1) / 2; i++) {
            if(word.charAt(i) != word.charAt(word.length() - i - 1)) {
                System.out.printf("%s is not a palindrome", word);
                return;
            }
        }

        System.out.printf("%s is a palindrome", word);
    }
}