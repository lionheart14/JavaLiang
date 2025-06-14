package excercises.chapter_06;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(sumDigits(234));
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
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * 6.3
     */
    public static int reverse(int number) {
        String s = String.valueOf(number);
        String reverse = "";
        for(int i = 0; i < s.length(); i++) {
            reverse += number % 10;
            number /= 10;
        }
        return Integer.parseInt(reverse);
    }

    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }
}
