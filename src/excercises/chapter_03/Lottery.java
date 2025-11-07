package excercises.chapter_03;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int digit = (int) (Math.random() * 100);

        int firstDigit;
        if(digit < 10) {
            firstDigit = 0;
        } else {
            firstDigit = digit / 10;
        }

        int secondDigit = digit % 10;

        System.out.print("Enter a two-digit number: ");
        int userDigit = input.nextInt();

        while(userDigit < 10 || userDigit >= 100) {
            System.out.println("Enter a two-digit number: ");
            userDigit = input.nextInt();
        }

        int userFirstDigit = userDigit / 10;
        int userSecondDigit = userDigit % 10;

        if(userFirstDigit == firstDigit && userSecondDigit == secondDigit) {
            System.out.println("The award is $10000!");;
        } else if(userFirstDigit == secondDigit && userSecondDigit == firstDigit) {
            System.out.println("The award is $3000!");
        } else if(userFirstDigit == firstDigit || userFirstDigit == secondDigit || userSecondDigit == firstDigit || userSecondDigit == secondDigit) {
            System.out.println("The award is $1000!");
        } else {
            System.out.println("No award!");
        }
        System.out.println(digit);
    }
}
