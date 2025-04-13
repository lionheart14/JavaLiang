package excercises.chapter_03;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        exercises.randomMonth();
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
        
        // divide number by digit to extract numbers
        // int tenthDigit =
    }



}