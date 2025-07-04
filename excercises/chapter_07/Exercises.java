package excercises.chapter_07;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        assignGrades();
    }

    /**
     * 7.1
     */
    public static void assignGrades() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        System.out.print("Enter " + n + " scores: ");
        int[] scores = new int[n];
        int bestScore = 0;

        for(int i = 0; i < n; i++) {
            scores[i] = input.nextInt();

            //best score
            if(scores[i] > bestScore) {
                bestScore = scores[i];
            }
        }

        char[] grades = new char[n];
        for(int i = 0; i < n; i++) {
            if(scores[i] >= bestScore - 5 ) {
                grades[i] = 'A';
            } else if(scores[i] >= bestScore - 10) {
                grades[i] = 'B';
            } else if(scores[i] >= bestScore - 15) {
                grades[i] = 'C';
            } else if(scores[i] >= bestScore - 20) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
        }

        for(int i = 0; i < n; i++) {
            System.out.printf("Student %d score is %d and grade is %c \n", i, scores[i], grades[i]);
        }
    }
}
