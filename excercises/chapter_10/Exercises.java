package excercises.chapter_10;

import java.math.BigInteger;
import java.util.Stack;

import excercises.chapter_10.MyInteger;

public class Exercises {
    public static void main(String[] args) {
        divisibleBy2Or3();
    }

    public static void displayPrimeNumbers() {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < 120; i++) {
            if(MyInteger.isPrime(i)) {
                stack.push(i);
            }
        }

        for (Integer integer : stack) {
            System.out.println(integer);
        }
    }

    public static void divisibleBy2Or3() {
        BigInteger num = new BigInteger("50000000000000000000000000000000000000000000000000");
        final BigInteger ZERO = new BigInteger("0");
        final BigInteger ONE = new BigInteger("1");
        final BigInteger TWO = new BigInteger("2");
        final BigInteger THREE = new BigInteger("3");
        int numberOfDivisibles = 0;

        while(numberOfDivisibles < 50) {
            if(num.mod(TWO).equals(ZERO) || num.mod(THREE).equals(ZERO)) {
                System.out.println(num);
                numberOfDivisibles++;
            }
            num = num.add(ONE);
        }
    }
}
