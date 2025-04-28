package excercises.chapter_04;

import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        Exercises exercises = new Exercises();
        exercises.asciiCode();
    }
    /** 
     * 4.1
     */
    public void areaOfPentagon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        double r = input.nextDouble();

        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.println("The are of the pentagon is " + area);
    }

    /**
     * 4.2
     */
    public void greatCircleDistance() {
        Scanner input = new Scanner(System.in);
        final double RADIUS = 6371.01;

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(input.nextDouble());
        double y1 = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(input.nextDouble());
        double y2 = Math.toRadians(input.nextDouble());

        double d = RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.printf("The distance between the two points is %.2f km", d);
    }

    /**
     * 4.5
     */
    public void areaOfPolygon() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of sides: ");
        int n = input.nextInt();

        System.out.print("Enter the side: ");
        double s = input.nextDouble();

        double area = (n * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of the polygon is %.2f", area);
    }

    /**
     * 4.6
     */
    public void randomPointsOnCircle() {
        final int RADIUS = 40;
        double alpha = Math.toRadians((int) (Math.random() * 360));
        double x = RADIUS * Math.cos(alpha);
        double y = RADIUS * Math.sin(alpha);
    }

    /**
     * 4.8
     */
    public void asciiCode() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char c = input.nextLine().charAt(0);
        int ascii = (int) c;

        System.out.printf("The ASCII code for character %c is %d", c , ascii);
    }


}
