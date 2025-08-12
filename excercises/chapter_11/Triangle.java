package excercises.chapter_11;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    public Triangle() {
        this(1, 1, 1);
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
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
