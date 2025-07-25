package excercises.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        centralCity();
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

    /**
     * 8.8
     */
    public static void largestRowAndColumn() {
        int MATRIX_SIZE = 5;
        int [][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        

        for(int i = 0; i < MATRIX_SIZE; i++) {
            for(int j = 0; j < MATRIX_SIZE; j++) { 
                int num =  (Math.random() * 1) > 0.5 ? 1 : 0;
                matrix[i][j] = num;
            }
        }

        int rowCnt = 0;
        int rowIndex = 0;
        for(int i = 0; i < MATRIX_SIZE; i++) {
            int currentCnt = 0;
            for(int j = 0; j < MATRIX_SIZE; j++) {
                if(matrix[i][j] == 1) {
                    currentCnt++;
                }
            }
            if(currentCnt > rowCnt)  {
                    rowCnt = currentCnt;
                    rowIndex = i;
            }
        }

        int columnCnt = 0;
        int columnIndex = 0;
        for(int i = 0; i < MATRIX_SIZE; i++) {
            int currentCnt = 0;
            for(int j = 0; j < MATRIX_SIZE; j++) {
                if(matrix[j][i] == 1) {
                    currentCnt++;
                }
            }
            if(currentCnt > columnCnt)  {
                    columnCnt = currentCnt;
                    columnIndex = i;
            }
        }

        for(int i = 0; i < MATRIX_SIZE; i++) {
            int spaceIntervall = 0;
            for(int j = 0; j < MATRIX_SIZE; j++) {
                System.out.print(matrix[i][j]);
                spaceIntervall++;

                if(spaceIntervall == 5) {
                    System.out.println();
                    spaceIntervall = 0;
                }
            }
        }

        System.out.println("The largest row index: " + rowIndex);
        System.out.println("The largest column index: " + columnIndex);
    }

    /**
     * 8.11
     */
    public static void headsAndTails(int n) {
        if(n < 0 || n > 511) {
            throw new IllegalArgumentException("number has to be between 0 and 511");
        }

        String binary = Integer.toBinaryString(n);

        while(binary.length() != 9) {
            binary = '0' + binary;
        }

        int spaceIntervall = 0;
        for(int i = 0; i < binary.length(); i++)  {
            if(binary.charAt(i) == '0') {
                System.out.print("H ");
            } else {
                System.out.print("T ");
            }
            spaceIntervall++;

            if(spaceIntervall % 3 == 0) {
                System.out.println();
            }
        }
    }

    /**
     * 8.13
     */
    public static void testLocateSmallest() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number and rows and columns of the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();
        double[][] matrix = new double[rows][columns];

        System.out.println("Enter the array: ");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        int[] index = locateSmallest(matrix);

        System.out.printf("The location of the smallest element is at (%d, %d)", index[0], index[1]);
    }
    public static int[] locateSmallest(double[][] a) {
        double smallestElement = a[0][0];
        int[] smallestIndex = new int[2];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] < smallestElement) {
                    smallestElement = a[i][j];
                    smallestIndex[0] = i;
                    smallestIndex[1] = j;
                }
            }
        }
        return smallestIndex;
    }

    /**
     * 8.19
     */
    public static boolean isConsecutiveFour(int[][] values) {
        //horizontal
        for(int row = 0; row < values.length; row++) {
            int cnt = 0;
            int value = -1;
            for(int column = 0; column < values[row].length; column++) {
                if(cnt == 4) {
                    return true;
                }

                if(value == values[row][column]) {
                    cnt++;
                } else {
                    value = values[row][column];
                    cnt = 1;
                }
            }
        }

        //vertical
        for(int column = 0; column < values.length; column++) {
            int cnt = 0;
            int value = -1;
            for(int row = 0; row < values[column].length; column++) {
                if(cnt == 4) {
                    return true;
                }

                if(value == values[row][column]) {
                    cnt++;
                } else {
                    value = values[row][column];
                    cnt = 1;
                }
            }
        }

        //diagonal
        for(int row = 0; row < values.length; row++) {
            int cnt = 0;
            int value = -1;
            for(int column = 0; column < values[row].length; column++) {

                // for(cnt = 0; cnt < 4; cnt++) {
                //     if(values[row++][column]) {

                //     }
                // }
            }
        }

        return false;
    }

    /**
     * 8.21
     */
    public static void centralCity() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int n = input.nextInt();

        System.out.println("Enter the coordinates of the cities: ");
        double[][] coordinates = new double[n][2];
        for(int r = 0; r < coordinates.length; r++) {
            for(int c = 0; c < coordinates[r].length; c++) {
                coordinates[r][c] = input.nextDouble();
            }
        }

        double minDistanceV = Double.MAX_VALUE;
        double minIndexV;
        for(int r = 0; r < coordinates.length; r++) {
            double distance = 0;
            double element = coordinates[r][0];
            for(int i = 0; i < coordinates.length; i++) {
                if(r == i) continue;

                distance += Math.abs(element - coordinates[i][0]);

                if(distance < minDistanceV) {
                    minDistanceV = distance;
                    minIndexV = r; 
                }
            }
        }

        double minDistanceH = Double.MAX_VALUE;
        double minIndexH;
        for(int r = 0; r < coordinates.length; r++) {
            double distance = 0;
            double element = coordinates[r][1];
            for(int i = 0; i < coordinates.length; i++) {
                if(r == i) continue;

                distance += Math.abs(element - coordinates[i][0]);

                if(distance < minDistanceH) {
                    minDistanceH = distance;
                    minIndexH = r; 
                }
            }
        }
    }

    /**
    *8.23 (Game: find the flipped cell)
    * -> Perfekt, um reines logisches Denken zu üben.
    */

    //in datei

    /**
    *8.36 (Latin square)
    * -> Fordert dich, komplexe Regeln für Zeilen und Spalten zu prüfen.
    */

    //in datei

    /**
    *8.35 (Largest block)
    * -> Eine echte Herausforderung für Fortgeschrittene.
    */

        
}
