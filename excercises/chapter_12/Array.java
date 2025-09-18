package excercises.chapter_12;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an number between 1 - 12: ");
                int number = input.nextInt() - 1;
                System.out.printf("%s has %d days", months[number], dom[number]);
    
                continueInput = false;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("The number has to be between 1 - 12");
            } 
        } while (continueInput);
    }
}
