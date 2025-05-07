package excercises.chapter_05;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.celsiusToFahrenheitTable();
    }

    /**
     * 5.1
     */
    public void passOrFail() {
        Scanner input = new Scanner(System.in);
        int score;

        while (true) {
            System.out.print("Enter your score (-1 to exit): ");
            score = input.nextInt();

            if (score == -1) {
                System.out.println("Program terminated.");
                break;
            }

            if (score >= 60) {
                System.out.println("You pass the exam");
            } else {
                System.out.println("You don't pass the exam");
            }
        }
    }

    /**
     * 5.3
     */
    public void celsiusToFahrenheit() {
        System.out.printf("%-10s %10s\n", "Celsius", "Fahrenheit");
        for(int i = 0; i <= 100; i += 2) {
            int celsius = i;
            double fahrenheit = celsius * 9/5 + 32;
            System.out.printf("%-10d %10.1f\n", celsius, fahrenheit);
        }
    }

    /**
     * 5.4
     */
    public void inchToCentimeter() {
        System.out.printf("%-10s %10s\n", "Inches", "Centimetres");
        for(int i = 0; i <= 10; i++) {
            int inch = i;
            double centimetres = inch * 2.54;
            System.out.printf("%-10d %.2f\n", inch, centimetres);
        }
    }

    /**
     * 5.5 
     */ 
    public void celsiusToFahrenheitTable() {
        System.out.printf("%-12s %12s   |   %-12s %12s\n", "Celsius", "Fahrenheit", "Fahrenheit", "Celsius");

        int fahrenheit2 = 20;
        for(int i = 0; i <= 100; i += 2) {
            int celsius1 = i;
            double fahrenheit1 = celsius1 * (9/5) + 32; 

            double celsius2 = (fahrenheit2 - 32) * (5/9.0);
            System.out.printf("%-12d %12.3f   |   %-12d %12.3f\n", celsius1, fahrenheit1, fahrenheit2, celsius2);
            fahrenheit2 += 5;
        }
    }  
}
