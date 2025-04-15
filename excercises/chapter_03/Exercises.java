package excercises.chapter_03;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        exercises.palindromeChecker();
    }

    /**
     * 3.1
     */
    public void solveQuadraticEquations() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b, 2) - 4 * a * c;

        double rootOne = (b * -1 + Math.pow(discriminant, 0.5)) / 2 * a;
        double rootTwo = (b * -1 - Math.pow(discriminant, 0.5)) / 2 * a;

        if(discriminant > 0) {
            System.out.println("The equation has two roots " + rootOne + " and " + rootTwo);
        } else if(discriminant == 0) {
            System.out.println("The equation has one root " + rootOne);
        } else {
            System.out.println("The equation has no real roots");
        }
    }

    /**
     * 3.4
     */
    public void randomMonth() {
        int number = (int) (Math.random() * 12 + 1);
        String month = "Error";
        switch(number) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
        }
        System.out.println(month);
    }

    /**
     * 3.9
     */
    public void checkISBN() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ISBN9 = input.nextInt();
        
        int d1 = ISBN9 / 100000000;
        int d2 = ISBN9 / 10000000 % 10;
        int d3 = ISBN9 / 1000000 % 10;
        int d4 = ISBN9 / 100000 % 10;
        int d5 = ISBN9 / 10000 % 10;
        int d6 = ISBN9 / 1000 % 10;
        int d7 = ISBN9 / 100 % 10;
        int d8 = ISBN9 / 10 % 10;
        int d9 = ISBN9 % 10;

        int checksum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.print("The ISBN-10 number is " + ISBN9);

        if(checksum == 10) {
            System.out.println("X");
        } else {
            System.out.println(checksum);
        }
    }

    /**
     * 3.12
     */
    public void palindromeChecker() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int thirdDigit = number % 10;

        if(firstDigit == thirdDigit) {
            System.out.println(number + " is a palindrome");
        } else {
            System.out.println(number + " is not a palindrome");
        }
    }

    /**
     * 3.14
     */
    public void headsOrTails() {
        Scanner input = new Scanner(System.in);
        double number = Math.random();
        if(number > 0.5) {
            number = 1;
        } else {
            number = 0;
        }

        System.out.print("Heads or Tails? (1 for heads, 0 for tails)");
        int guess = input.nextInt();

        if(guess == number) {
            System.out.println("Right!");
        } else {
            System.out.println("Wrong!");
        }
    }

    



}