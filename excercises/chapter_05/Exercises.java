package excercises.chapter_05;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
    }

    /**
     * 5.1
     */
    public void passOrFail() {
        Scanner input = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("Enter your score (-1 to exit): ");
            score = input.nextInt();

            if (score == -1) {
                System.out.println("Program terminated.");
                break;
            }

            if (score >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You don't pass the exam");
            }
        }
    }
}
