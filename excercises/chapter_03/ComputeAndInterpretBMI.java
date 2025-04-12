package excercises.chapter_03;

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();

        double BMI = weight / 0.45359237 / Math.pow(height / 0.0254, 2);

        if(BMI >= 30) {
            System.out.println("You are obese!");
        } else if(BMI >= 25) {
            System.out.println("You are overweight!");
        } else if(BMI >= 18.5) {
            System.out.println("You are normal!");
        } else {
            System.out.println("You are underweight!");
        }

    }
}
