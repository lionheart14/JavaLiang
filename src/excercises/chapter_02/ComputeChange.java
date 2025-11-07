package excercises.chapter_02;

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double amount = input.nextDouble();

        int amountToCent = (int) (amount * 100);

        int numberOfDollars = amountToCent / 100;
        amountToCent %= 100;

        int numberOfQuarters = amountToCent / 25;
        amountToCent %= 25;

        int numberOfDimes = amountToCent / 10;
        amountToCent %= 10;

        int numberOfNickels = amountToCent / 5;
        amountToCent %= 5;

        int numberOfPennies = amountToCent;

        System.out.println("Your amount " + amount + " consists of"); 
        System.out.println(" " + numberOfDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes"); 
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
