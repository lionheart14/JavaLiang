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

    /**
     * 8.6
     */
    public static double[][] mulitplyMatrix(double [][] a, double[][] b) {
        double[][] matrix = new double[a.length][a.length];

        if(a.length != b[0].length) {
            throw new IllegalArgumentException();
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = a[i][1] * b[1][j] + a[i][2] * b[2][j] + a[i][3] * b[3][j];
            }
        }

        return matrix;
    }

    public static void testMultiplyMatrix() {
        Scanner input = new Scanner(System.in);
        final int MATRIX_SIZE = 3;
        double[][] a = new double[MATRIX_SIZE][MATRIX_SIZE];
        double[][] b = new double[MATRIX_SIZE][MATRIX_SIZE];

        System.out.print("Enter matrix1: ");
        for(int i = 0; i < MATRIX_SIZE; i++) {
            for(int j = 0; j < MATRIX_SIZE; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        System.out.print("Enter matrix2: ");
        for(int i = 0; i < MATRIX_SIZE; i++) {
            for(int j = 0; j < MATRIX_SIZE; j++) {
                b[i][j] = input.nextDouble();
            }
        }

        double[][] matrix = mulitplyMatrix(a, b);

        System.out.println("The mulitplication of the matrices is");
        // System.out.printf("%f %f %f       %f %f %f      %f %f %f\n" + 
        //                   "%f %f %f   *   %f %f %f   =  %f %f %f\n" +
        //                   "%f %f %f       %f %f %f      %f %f %f\n", a[0][0], a[0][1], a[0][2], );
    }

    /**
     * 8.7
     * darauf achten pointer system mit 2 pointers in diesem fall zu verwendne die for schliefne sind teilweise hier redundant
     */
    public static double[][] nearestPoint(double[][] points) {
        double[][] nearestPoints = new double[2][3];
        double distance = 0;

        for(int i = 0; i < points.length; i++) {
            for(int n = 0; n < points[i].length; n++) {
                if(Math.sqrt(Math.pow(points[i], 2)))
            }
        }
    }

}
