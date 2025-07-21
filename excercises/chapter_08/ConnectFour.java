package excercises.chapter_08;

public class ConnectFour {
    public static void main(String[] args) {
        
    }

    public boolean horizontalCheck(char[][] board) {
        for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[r].length - 3; c++) {
                int element = board[r][c];
                if (element == board[r][c+1] &&
                    element == board[r][c+2] &&
                    element == board[r][c+3]) {
                    return true;
                }
            }
        }
        return false;
    }
}
