package excercises.chapter_03;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // A leap year is divisible by 4
        boolean isLeapYear = (year % 4 == 0);
        // A leap year is divisible by 4 but not by 100 
        isLeapYear = isLeapYear && (year % 100 != 0);
        // A leap year is divisible by 4 but not by 100 or divisible by 400 
        isLeapYear = isLeapYear || (year % 400 == 0);

        if(isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
