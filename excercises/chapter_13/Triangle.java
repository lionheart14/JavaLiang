package excercises.chapter_13;

import java.util.Scanner;

import excercises.chapter_11.GeometricObject;

public class Triangle extends GeometricObject{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three sides of the triangle: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        System.out.print("Enter the color the triangle should be filled with: ");
        String color = "";
        try {
            input.wait(1000);
            color = input.nextLine();
        } catch (InterruptedException e) {
            System.out.println("Fehler beim Scanner");
        }
        
        System.out.println("Enter whether the triangle should be filled or not (J/N): ");
        boolean filled = input.nextLine().charAt(0) == 'J';

        input.close();

        Triangle triangle = new Triangle(s1, s2, s3, color, filled);
        triangle.displayPerimeter();
        triangle.displayArea();
    } 

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3, String color, boolean filled) {
        super(color, filled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    public void displayArea() {
        double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));

        System.out.println("The area of triangle measures " + area);
    }

    public void displayPerimeter() {
        double perimeter = s1 + s2 + s3;

        System.out.println("The perimter of triangle measures " + perimeter);
    }

    public double getS1() {
        return s1;
    }

    public double getS2() {
        return s2;
    }

    public double getS3() {
        return s3;
    }
}
