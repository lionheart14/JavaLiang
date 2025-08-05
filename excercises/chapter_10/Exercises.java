package excercises.chapter_10;

import java.util.Stack;

import excercises.chapter_10.MyInteger;

public class Exercises {
    public static void main(String[] args) {
        displayPrimeNumbers();
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
}
