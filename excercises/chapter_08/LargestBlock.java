package excercises.chapter_08;

import java.util.Scanner;

public class LargestBlock {
    static Scanner input = new Scanner(System.in);
    static int n;
    static int[][] matrix; 
    static int size;
    static int[] location = new int[2];
    public static void main(String[] args) {
        promptN();
        promptMatrix();
        checkSubmatrix();
    }

    public static void promptN() {
        System.out.print("Enter the number of rows in the matrix: ");
        n = input.nextInt();
    }

    public static void promptMatrix() {
        matrix = new int[n][n];
        System.out.println("Enter the matrix row by row: ");
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++) {
                matrix[r][c] = input.nextInt();
            }
        }
    }

    public static void checkSubmatrix() {
        for(int r = 0; r < n - 1; r++) {
            int cnt = 0;
            for(int c = 0; c < n - 1; c++) {
                if(matrix[r][c] == 1) {
                    for(int i = c + 1; i < n; i++) {
                        if(matrix[r][i] == 1) {
                            cnt++;
                        }
                    }

                    while(cnt > 0) {
                        if(checkElement(r, c, cnt)) {
                            if(cnt > size) {
                                size = cnt;
                                location[0] = r;
                                location[1] = c;
                            }
                        } else {
                            cnt--;
                        }
                    }
                }
            }
        }

        if(size > 0) {
            System.out.printf("The maximum square submatrix is at (%d, %d) with size %d", location[0], location[1], size);
        } else {
            System.out.println("No maximum square");
        }
    }

    public static boolean checkElement(int r, int c, int cnt) {
        if (r + cnt > matrix.length || c + cnt > matrix.length) {
            return false;
        }

        for(int j = r; j < r + cnt; j++) {
            for(int i = c; i < c + cnt; i++) {
                if(matrix[j][i] != 1) {
                    return false;           
                }
            }
        }
        return true;
    }
}
