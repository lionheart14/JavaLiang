package excercises.chapter_08;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        displayEmployees();
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

    public static int sumRow(int[][] m, int rowIndex) {
        int sum = 0;
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

    /**
     * 8.2
     */
    public static double averageMajorDiagonal(double[][] m) {
        double average = 0;
        int diagonalIndex = 0;
        for(int row = 0; row < m.length; row++) {
                average += m[row][diagonalIndex];
                diagonalIndex++;
        }
        average /= m.length;
        return average;
    }

    public static void testAverageMajorDiagonal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }
        System.out.println("Average of the elements in the major diagonal is " + averageMajorDiagonal(matrix));
    }

    /**
     * 8.4
     */
    public static void displayEmployees() {
        int[][] employees = {
            {2, 4, 3, 4, 5, 8, 8},
            {7, 3, 4, 3, 3, 4, 4},
            {3, 3, 4, 3, 3, 2, 2},
            {9, 3, 4, 7, 3, 4, 1},
            {3, 5, 4, 3, 6, 3, 8},
            {3, 4, 4, 6, 3, 4, 4},
            {3, 7, 4, 8, 3, 8, 4},
            {6, 3, 5, 9, 2, 7, 9}
        };

        int[] totalHours = new int[8];
        for(int i = 0; i < employees.length; i++) {
            totalHours[i] = sumRow(employees, i);
        }

        //TODO: too complicated, find easier solutions
        for(int i = 0; i < employees.length; i++) {
            int n = findSmallestInt(totalHours);
            System.out.println("Employee " + i + " total working hours: " + sum);
        }

    }

    public static int findSmallestInt(int[] list) {
        int smallestNumber = list[0];
        int index = 0;
        for(int i = 0; i < list.length; i++) {
            if(list[i] < smallestNumber) {
                smallestNumber = i;
                index = i;
            }
        }
        list[index] = 99;
        return smallestNumber;
    }
}
