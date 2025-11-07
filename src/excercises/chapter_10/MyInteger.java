package excercises.chapter_10;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public boolean isEven() {
        return value % 2 == 0;
    }

    public boolean isOdd() {
        return value % 2 == 1;
    }

    public boolean isPrime() {
        if(value <= 1) return false;
        if(value == 2) return true;
        if(isEven()) return false;

        for(int i = 3; i < Math.sqrt(value); i += 2) {
            if(value % i == 0) return false;
        }

        return true;
    }

    public boolean equals(int num) {
        return value == num;
    }

    public boolean equals(MyInteger num) {
        return value == num.getValue();
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 == 1;
    }

    public static boolean isPrime(int value) {
        if(value <= 1) return false;
        if(value == 2) return true;
        if(value % 2 == 0) return false;

        for(int i = 3; i < Math.sqrt(value); i += 2) {
            if(value % i == 0) return false;
        }

        return true;
    }

    public static int parseInt(char[] num) {
        String s = String.copyValueOf(num);
        return Integer.parseInt(s);
    }

    public static int parseInt(String num) {
        return Integer.parseInt(num);
    }

    public int getValue() {
        return value;
    }
}
