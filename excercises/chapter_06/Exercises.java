package excercises.chapter_06;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        displaySortedNumbers(input.nextDouble(), input.nextDouble(), input.nextDouble());
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
}
