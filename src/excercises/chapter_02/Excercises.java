package excercises.chapter_02;

import java.util.Scanner;

public class Excercises {
    public static void main(String[] args) {
        Excercises excercises = new Excercises();

        excercises.computingTemperature();
    }

    /**
     * 2.1
     */
    public void convertMileToKilometer() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter miles: ");

        double mile = input.nextDouble();
        double kilometers = mile * 1.6; 

        System.out.println(mile + " miles is " + kilometers + " kilometers");
    }
    
    /**
     * 2.2
     */
    public void computeChange() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the sides and height of the Equilateral triangle: ");

        double length = input.nextDouble();
        double area = (Math.sqrt(3) / 4) * Math.pow(length, 2);
        double volume = area * length;

        System.out.println("The are is " + area);
        System.out.println("The volume of the Triangular prism is " + volume);
    }

    /**
     * 2.5
     */
    public void calculateTips() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");

        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble() / 10;

        double total = gratuityRate + subtotal;

        System.out.println("The gratuity is $" + gratuityRate + " and total is $" + total);
    }

    /**
     * 2.7
     */
    public void multiplyDigits() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");

        int digits = input.nextInt();

        int remaindingDigits = digits;

        int result = remaindingDigits % 10;
        remaindingDigits /= 10;

        result = result * (remaindingDigits % 10);
        remaindingDigits /= 10;

        result = result * (remaindingDigits % 10);
        remaindingDigits /= 10;

        System.out.println("The multiplication of all digits in " + digits + " is " + result);
    }

    /**
     * 2.8
     */
    public void findNumberOfYears() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");

        int minutes = input.nextInt();
        int remainingMinutes = minutes;

        int years = remainingMinutes / 60 / 24 / 365;
        remainingMinutes = remainingMinutes / 60 / 24;

        int days = remainingMinutes % 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
    }

    /**
     * 2.13
     */
    public void compoundValue() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");

        final double monthlyInterestRate = 0.003125;
        double savingAmount = input.nextDouble();
        double accountValue = savingAmount;

        for(int i = 1; i <= 6; i++) {
            accountValue *= monthlyInterestRate + 1;
            System.out.println("After the " + i + " month, the account value is " + accountValue);
            accountValue += savingAmount;
        }
    }

    /**
     * 2.14
     */
    public void computingBMI() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double BMI = weight / Math.pow(height, 2);
        System.out.println("BMI is " + BMI);
    }

    /**
     * 2.17
     */
    public void computingTemperature() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between - 58°F and 41°F: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed (>= 2) in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChillIndex = 35.74 + (0.6215 * temperature) - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
        System.out.println("The wind chill index is: " + windChillIndex);
    }
}
