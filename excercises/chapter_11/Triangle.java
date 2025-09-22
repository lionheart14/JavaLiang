package excercises.chapter_11;

import excercises.chapter_12.IllegalTriangleException;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) {
        try {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;

            if(side1 + side2 > side3 || side1 + side3 > side2 || side2 + side3 > side1) {
                throw new IllegalTriangleException();
            }
        } catch (IllegalTriangleException e) {
            System.out.println("One side of the triangle cannnot be greater that the sum of other the other two sides");
        }
    }

    public double getArea() {
        double halvedPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(halvedPerimeter * (halvedPerimeter - side1) * (halvedPerimeter - side2) * (halvedPerimeter - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    }
}
