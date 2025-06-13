package excercises.chapter_06;

public class Exercises {
    public static void main(String[] args) {
        sumDigits(1);
    }

    /**
     * 6.1
     */
    public static int getPentagonalNumbers(int n) {
        int pentagonalNumber = n * (3 * n - 1) / 2;
        return pentagonalNumber;
    }

    /**
     * 6.2
     */
    public static int sumDigits(long n) {
        String s = String.valueOf(n);
        System.out.println(s);
    }
}
