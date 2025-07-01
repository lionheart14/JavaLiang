package excercises.chapter_06;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        distanceTest();
    }
    /**
     * 6.1
     */
    public static int getPentagonalNumbers(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }

    /**
     * 6.2
     */
    public static int sumDigits(long n) {
        String s = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * 6.3
     */
    public static int reverse(int number) {
        String s = String.valueOf(number);
        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            reverse += number % 10;
            number /= 10;
        }
        return Integer.parseInt(reverse);
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    //6.4 same as 6.3

    /**
     * 6.5
     */
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        double temp;
        if(num1 < num2) {
            if(num2 < num3) {
                temp = num1;
                num1 = num3;
                num3 = temp;
            } else {
                temp = num1;
                num1 = num2;
                num2 = temp;
            }
        }
        System.out.printf("%.2f > %.2f > %.2f", num1, num2, num3);
    }
    
    /**
     * 6.6
     */
    public static void displayPattern(int n) {

    }

    /**
     * 6.7
     */
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double annualInterestRate = monthlyInterestRate * 12;
        System.out.println("The amount invested: " + investmentAmount);
        System.out.println("Annual interest rate: " + annualInterestRate);

        double futureValue = investmentAmount;
        System.out.printf("%-10s %s \n", "Years", "Future Value");
        for(int i = 1; i <= years; i++) {
            futureValue *= (annualInterestRate + 1);
            System.out.printf("%-2d", i);
            System.out.printf("%21.2f \n", futureValue);
        }
        return futureValue;
    }

    /**
     * 6.8
     */
    public static double mileToKilometer(double mile) {
        return mile / 1.6;
    }

    public static double kilometerToMile(double kilometer) {
        return kilometer * 1.6;
    }

    public static void distanceTest() {
        System.out.printf("%-15s %-15s | %15s %15s \n", "Miles", "Kilometers", "Kilometers", "Miles");
        int kilometers = 20;
        for(int i = 1; i <= 10; i++) {
            System.out.printf("%-15d %-15.3f | %7d %24.3f \n", i, kilometerToMile(i), kilometers, mileToKilometer(kilometers));
            kilometers += 5;
        }
    }
}
