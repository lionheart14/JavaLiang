package excercises.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        Scanner input = new Scanner(System.in);
        char[][] board = createEmptyBoard(7, 7);
        char turn = 'R';

        while(!allChecks(board)) {
            printBoard(board);
            System.out.println(Arrays.deepToString(board));
            if(turn == 'R') {
                System.out.print("Drop a red disk at column (0-6): ");
                int column = input.nextInt();
                drop(board, column, turn);
                turn = 'Y';
            } else {
                System.out.print("Drop a yellow disk at column (0-6): ");
                int column = input.nextInt();
                drop(board, column, turn);
                turn = 'R';
            }
        }

        printBoard(board);
        System.out.println("We have a winner!");
    }

    public static void drop(char[][] board, int column, char color) {
        for(int row = board.length - 1; row >= 0; row--) {
            if(board[row][column] == ' ') {
                board[row][column] = color;
                return;
            }
        }

        System.out.println("VOLL");
    }

    public static char[][] createEmptyBoard(int rows, int cols) {
        char[][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = ' ';
            }
        }
    return board;
    }

    public static void printBoard(char[][] board) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length; c++) {
                if(c == 0) {
                    System.out.print("|");
                }

                System.out.print(board[r][c] + "|");
            }
            System.out.println();
        }
        System.out.println("----------------");
    }

    public static boolean allChecks(char[][] board) {
        return  horizontalCheck(board) || 
                verticalCheck(board) || 
                diagonalCheckDown(board) || 
                diagonalCheckUp(board);
    }

    public static boolean horizontalCheck(char[][] board) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length - 3; c++) {
                char element = board[r][c];
                if(element != ' ') {
                    if (element == board[r][c+1] &&
                        element == board[r][c+2] &&
                        element == board[r][c+3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean verticalCheck(char[][] board) {
        for(int c = 0; c < board[0].length; c++) {
            for(int r = 0; r < board.length - 3; r++) {
                char element = board[r][c];
                if(element != ' ') {
                    if (element == board[r+1][c] &&
                        element == board[r+2][c] &&
                        element == board[r+3][c]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean diagonalCheckUp(char[][] board) {
        for(int r = 0; r < board.length - 3; r++) {
            for(int c = 0; c < board[r].length - 3; c++) {
                char element = board[r][c];
                if(element != ' ') {
                    if (element == board[r+1][c+1] &&
                        element == board[r+2][c+2] &&
                        element == board[r+3][c+3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean diagonalCheckDown(char[][] board) {
        for(int r = 0; r < board.length - 3; r++) {
            for(int c = 0; c < board[r].length; c++) {
                char element = board[r][c];
                if(element != ' ') {
                    if (element == board[r+1][c-1] &&
                        element == board[r+2][c-2] &&
                        element == board[r+3][c-3]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
