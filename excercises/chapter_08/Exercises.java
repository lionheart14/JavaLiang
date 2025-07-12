package excercises.chapter_08;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        testSumRow();
    }
    /**
     * 8.1
     */
    public static double sumRow(double[][] m, int rowIndex) {
        double sum = 0;
        for(int i = 0; i < m[rowIndex].length; i++) {
            sum += m[rowIndex][i];
        }
        return sum;
    } 

    public static void testSumRow() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");
        double[][] matrix = new double[3][4];
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        for(int row = 0; row < matrix.length; row++) {
            System.out.println("Sum of the elemets at row " + row + " is " + sumRow(matrix, row));
        }
    }
}
