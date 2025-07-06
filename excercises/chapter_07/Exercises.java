package excercises.chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        prompt();
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

    /**
     * 7.9
     */

    public static void prompt() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for(int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble(); 
        }

        System.out.println("The reversed array is: " + Arrays.toString(reverseA(array)));
        // System.out.println("The maximum number is: " + max(array));
    }

    public static double max(double[] array) {
        double max = 0;
        for (double d : array) {
            if(d > max) {
                max = d;
            }
        }

        return max;
    }

    /**
     * 7.10
     */
    public static int indexOfLargestElement(double[] array) {
        int index = 0;
        double max = max(array);

        for(int i = 0; i < array.length; i++) {
            if(max == array[i]) {
                index = i;
            }
        }
        return index;
    }

    /**
     * 7.12
     */
    public static double[] reverseA(double[] array) {
        double[] reversedArray = new double[array.length];
        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    /**
     * 7.11
     */

    /**
     * 7.18
     */

    /**
     * 7.19
     */

    /**
     * 7.15
     */

    /**
     * 7.31
     */

    /**
     * 7.32
     */
}
