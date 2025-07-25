package excercises.chapter_08;

import java.util.Arrays;
import java.util.Scanner;

public class LatinSquare {
    static Scanner input = new Scanner(System.in);
    static int n;
    static char[][] matrix;
    static char[] alphabet;
    public static void main(String[] args) {
        prompt();
        fillAlphabet();
        if(horizontalCheck() && verticalCheck()) {
            System.out.println("The input array is a Latin square");
        } else {
            System.out.println("Wrong input: the letters mus be from " + alphabet[0] + " to " + alphabet[alphabet.length-1]);
        }
    }

    public static void prompt() {
        System.out.print("Enter number n: ");
        n = input.nextInt();
        input.nextLine();

        matrix = new char[n][n];
        alphabet = new char[n];

        System.out.println("Enter " + n + " rows of letters separated by spaces: ");
        for(int r = 0; r < matrix.length; r++) {
            String line = input.nextLine();
            String[] letters = line.split(" ");

            for(int c = 0; c < matrix[r].length; c++) {
                matrix[r][c] = letters[c].charAt(0);
            }
        }
    }

    public static void fillAlphabet() {
        char c = 'A';
        for(int i = 0; i < alphabet.length; i++) {
            alphabet[i] = c;
            c++;
        }
    }

    public static boolean horizontalCheck() {
        for(int r = 0; r < matrix.length; r++) {
            for(int c = 0; c < matrix[r].length; c++) {
                boolean found = false;
                for(char e : alphabet) {
                    if(matrix[r][c] == e) {
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    return false;
                }
            }
        }

        for(int r = 0; r < matrix.length; r++) {
            for(char e : alphabet) {
                boolean found = false;
                for(int c = 0; c < matrix[r].length; c++) {
                    if(matrix[r][c] == e) {
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean verticalCheck() {
        for(int c = 0; c < matrix[0].length; c++) {
            for(int r = 0; r < matrix.length; r++) {
                boolean found = false;
                for(char e : alphabet) {
                    if(matrix[r][c] == e) {
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    return false;
                }
            }
        }

        for(int c = 0; c < matrix[0].length; c++) {
            for(char e : alphabet) {
                boolean found = false;
                for(int r = 0; r < matrix.length; r++) {
                    if(matrix[r][c] == e) {
                        found = true;
                        break;
                    }
                }
                if(!found) {
                    return false;
                }
            }
        }

        return true;
    }
}
