package excercises.chapter_09;

import java.util.Random;

public class TestClass {
    public static void main(String[] args) {
        testStopWatch();
    }

    public static void testRectangle() {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.printf("Width: %f\n"+
                           "Height: %f\n"+
                           "Area: %f\n" +
                           "Perimteter: %f\n", 
                           r1.getWidth(), r1.getHeight(), r1.getArea(), r1.getPerimeter());

        System.out.printf("Width: %f\n"+
                           "Height: %f\n"+
                           "Area: %f\n" +
                           "Perimteter: %f", 
                           r2.getWidth(), r2.getHeight(), r2.getArea(), r2.getPerimeter());
    }

    public static void testFan() {
        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.setOn(true);
        f1.setSpeed(3);
        f1.setRadius(10.0);
        f1.setColor("yellow");

        f2.setSpeed(2);
        f2.setRadius(5.0);
        f2.setColor("blue");

        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }

    public static void testAccount() {
        Account a1 = new Account(1122, 20000);
        a1.setAnnualInterestRate(4.5);

        a1.withdraw(2500);
        a1.deposit(3000);
    }

    public static void testStopWatch() {
        Random random = new Random();
        int[] numbers = new int[100000];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        for(int i = 0; i < 100; i++) {
            System.out.print(numbers[i] + " ");

            if(i % 10 == 0) {
                System.out.println();
            } 
        }

        StopWatch sp = new StopWatch();
        selectionSort(numbers);
        sp.stop();

        for(int i = 0; i < 100; i++) {
            System.out.print(numbers[i] + " ");

            if(i % 10 == 0) {
                System.out.println();
            } 
        }
        
        System.out.println(sp.getElapsedTime());
    }

    public static void selectionSort(int[] numbers) {
        int min;
        int minIndex;
        int temp;
        for(int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            minIndex = i;
            for(int j = i; j < numbers.length; j++) {
                if(numbers[j] < min) {
                    min = numbers[j];
                    minIndex = j;
                }
            }
            temp = numbers[i];
            numbers[i] = min;
            numbers[minIndex] = temp;
        }
    }
}   
