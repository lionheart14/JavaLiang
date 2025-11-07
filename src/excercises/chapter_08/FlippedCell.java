package excercises.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class FlippedCell {
    static Scanner input = new Scanner(System.in);
    static final int MATRIX_SIZE = 6;
    static int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
    
    public static void main(String[] args) {
        prompt();
        System.out.println("The flipped cell is at (" + Arrays.deepToString(findFlippedCellColumn(findFlippedCellRow())) + ")");
    }

    public static int findFlippedCellRow() {
        for(int r = 0; r < MATRIX_SIZE; r++) {
            int newRow = 0;
            int oneCnt = 0;

            for(int c = 0; c < MATRIX_SIZE; c++) {
                if(matrix[r][c] == 1) {
                    oneCnt++;
                }
            }
            if(oneCnt % 2 == 1) {
                return r;
            }
        }
        throw new Error("No flipped cell in matrix");
    }

    public static int[][] findFlippedCellColumn(int flippedRow) {
        int[][] flippedCell = new int[1][2];
        flippedCell[0][0] = flippedRow;

        for(int e = 0; e < matrix[flippedRow].length; e++) {
            int oneCnt = 0;
            for(int c = 0; c < MATRIX_SIZE; c++) {
                if(matrix[c][e] == 1) {
                    oneCnt++;
                }
    
            }
            if(oneCnt % 2 == 1) {
                flippedCell[0][1] = e;
                return flippedCell;
            }
        }
        throw new Error("No flipped cell in matrix");
    }


    public static void prompt() {
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for(int r = 0; r < MATRIX_SIZE; r++) {
            for(int c = 0; c < MATRIX_SIZE; c++) {
                matrix[r][c] = input.nextInt();
            }
        }
    }
}
