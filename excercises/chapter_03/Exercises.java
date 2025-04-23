package excercises.chapter_03;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();

        exercises.pickACard();
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

    /**
     * 3.15
     */
    public void scissorRockPaper() {
        Scanner input = new Scanner(System.in);
        double number = Math.random();

        if(number < 0.33) {
            number = 0;
        } else if(number < 0.66) {
            number = 1;
        } else {
            number = 2;
        }

        System.out.print("scissor (0), rock (1), paper (2): ");
        int guess = input.nextInt();

        if(guess == number) {
            System.out.println("Draw");
        } else if(guess == 1 && number == 2 || guess == 0 && number == 1) {
            String temp = number == 1 ? "rock" : "paper";
            System.out.println("Lost, PC has " + temp);
        } else {
            String temp = number == 1 ? "rock" : "paper";
            System.out.println("Win, PC has " + temp);
        }
    }

    /**
     * 3.18
     */
    public void calculatingCostOfShipping() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight of package: ");
        double weight = input.nextDouble();
        double cost = 0;

        if(weight <= 2.5) {
            cost = 2.5;
        } else if(weight <= 4) {
            cost = 4.5;
        } else if(weight <= 10) {
            cost = 7.5;
        } else if(weight <= 20) {
            cost = 10.5;
        }

        if(weight > 20) {
            System.out.println("The package cannot be shipped.");
        } else {
            System.out.println("The cost of package is " + cost);
        }
    }

    /**
     * 3.19
     */
    public void computingPerimeter() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter degrees for edge 1, edge 2 and edge 3: ");
        int edgeOne = input.nextInt();
        int edgeTwo = input.nextInt();
        int edgeThree = input.nextInt();

        // sums of edges
        int sum1 = edgeOne + edgeTwo;
        int sum2 = edgeOne + edgeThree;
        int sum3 = edgeTwo + edgeThree;

        if(sum1 > edgeThree || sum2 > edgeTwo || sum3 > edgeOne) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }

    /**
     * 3.21
     */
    public void zellersCongruence() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        int j = year / 100;
        int k = year % 100;

        System.out.print("Enter month: 1-12: ");
        int m = input.nextInt() + 2;

        System.out.println("Enter the day of the month: 1-31: ");
        int q = input.nextInt();

        int h = (q + (26 * (m + 1) / 10) + k + k / 4 + j / 4 + 5 * j) % 7;

        String day = "fuckday";
        switch(h) {
            case 0: day = "Saturday"; break;
            case 1: day = "Sunday"; break;
            case 2: day = "Monday"; break;
            case 3: day = "Tuesday"; break;
            case 4: day = "Wednesday"; break;
            case 5: day = "Thursday"; break;
            case 6: day = "Friday"; break;
        }

        System.out.println("Day of the week is " + day);
    }

    /**
     * 3.22
     */
    public void pointInCircle() {
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter a point with two coordinates: ");
        double p1 = input.nextDouble();
        double p2 = input.nextDouble();

        double distance = Math.pow((Math.pow(p1 - p1, 2)) - Math.pow(p2 - p1, 2), 0.5);

        if(distance > 10) {
            System.out.println("Point " + "(" + p1 + ", " + p2 + ") is not in the rectangle");
        } else {
            System.out.println("Point " + "(" + p1 + ", " + p2 + ") is in the rectangle");
        }
    }

    /**
     * 3.23
     */
    public void pointInRectangle() {
        Scanner input = new Scanner(System.in);
        System.out.print ("Enter a point with two coordinates: ");
        double p1 = input.nextDouble();
        double p2 = input.nextDouble();

        double horizontalDistance = 10 / 2;
        double verticalDistance = 5.0 / 2;

        if(p1 <= horizontalDistance && p2 <= verticalDistance) {
            System.out.println("Point " + "(" + p1 + ", " + p2 + ") is in the rectangle");
        } else {
            System.out.println("Point " + "(" + p1 + ", " + p2 + ") is not in the rectangle");

        }
    }

    /**
     * 3.24
     */
    public void pickACard() {
        int rankNum = (int) (Math.random() * 13 + 1);
        int suitNum = (int) (Math.random() * 4 + 1);

        String rank = "error";
        String suit = "error";

        switch(rankNum) {
            case 1: rank = "Ace"; break;
            case 2: rank = "2"; break;
            case 3: rank = "3"; break;
            case 4: rank = "4"; break;
            case 5: rank = "5"; break;
            case 6: rank = "6"; break;
            case 7: rank = "7"; break;
            case 8: rank = "8"; break;
            case 9: rank = "9"; break;
            case 10: rank = "10"; break;
            case 11: rank = "Jack"; break;
            case 12: rank = "Queen"; break;
            case 13: rank = "King"; break;
        }

        switch(suitNum) {
            case 1: suit = "Clubs"; break;
            case 2: suit = "Diamonds"; break;
            case 3: suit = "Hearts"; break;
            case 4: suit = "Spades"; break;
        }
        
        System.out.println("The card you picked is " + rank + " of " + suit);
    }
}