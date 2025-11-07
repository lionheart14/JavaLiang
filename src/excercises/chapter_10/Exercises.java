package excercises.chapter_10;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import excercises.chapter_10.MyInteger;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("a?b?gf#e", "[?#]")));
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

    //10.16
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

    //10.17
    public static void findSquareNumbers() {
        String s = String.format("%d", Math.round(Math.sqrt(Long.MAX_VALUE)));
        BigInteger num = new BigInteger(s);
        int numberOfSquareNumbers = 0;

        while(numberOfSquareNumbers < 10) {
            System.out.println(num.multiply(num));
            num = num.add(new BigInteger("1"));
            numberOfSquareNumbers++;
        } 
    }

    //10.25
    public static String[] split(String s, String regex) {
        StringBuilder temp = new StringBuilder();
        List<String> result = new ArrayList<>();

        for(char c : s.toCharArray()) {
            if(regex.contains(String.valueOf(c))) {
                result.add(temp.toString());
                result.add(Character.toString(c));
                temp.setLength(0);
            } else {
                temp.append(c);
            }
        }
        if(!temp.isEmpty()) {
            result.add(temp.toString());
        }

        return result.toArray(new String[0]);
    }
}
